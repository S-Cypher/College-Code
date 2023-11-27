#Keira Stewart
#November 1, 2023
#User String Manipulation Function
#A character is 1 BYTE.

.data
userString: .space 64
start: .asciiz "This program takes in a string from the user and allows them to make changes to the string until they want to stop.\n"
entry: .asciiz "Enter your string (max of 64 characters): "
current: .asciiz "Your current string is: "
decision: .asciiz "Do you want to make any changes to the string? (Y/N): "
YesNo: .space 2
replace: .asciiz "Enter the character in the string you would like to replace: "
diffChar: .asciiz "Enter what you would like to change the character to: "
finalString: .asciiz "Your final string is: "
.text

li $v0, 4
la $a0, start
syscall

li $v0, 4
la $a0, entry
syscall

li $v0, 8
la $a0, userString
li $a1, 64
syscall

#making sure the string is preserved after calling the function.

loop:
li $v0, 4
la $a0, current
syscall

li $v0, 4
la $a0, userString
syscall

move $s0, $a0 #WHY DOES THIS WORK??
#I'm guessing this is moving the current state of the string back into s0 
#so the function can change the characters again?

li $v0, 4
la $a0, decision
syscall

li $v0, 12
syscall

bne $v0, 89, leave #using bne worked better than beq for some reason.

li $v0, 11
li $a0, '\n'
syscall

li $v0, 4
la $a0, replace
syscall

li $v0, 12
syscall
move $a1, $v0 #ascii value in a1

li $v0, 11
li $a0, '\n'
syscall

li $v0, 4
la $a0, diffChar
syscall

li $v0, 12
syscall
move $a2, $v0 #ascii value in a2

li $v0, 11
li $a0, '\n'
syscall

jal changeString
j loop

leave: 
li $v0, 11
li $a0, '\n'
syscall

li $v0, 4
la $a0, finalString
syscall

li $v0, 4
la $a0, userString
syscall

#Remember to end the program properly
li $v0, 10
syscall


#I realized that I didn't need to preserve the return address
changeString:
addi $sp, $sp, -2
sb $a1, 4($sp) #character in the string
sb $a2, 5($sp) #character that the user wants to change $a1 to

#if the program finds a matching character that the user wants to change in their original string

stringLoop: #searching through the string
lbu $a3, 0($s0) #loading the characters from the string
beq $a1, $a3, match
beq $a3, '\0', exit #end of string
addi $s0, $s0, 1 #moving to the next character if there isn't a match

j stringLoop

match:
sb $a2, 0($s0)
addi $s0, $s0, 1 #moving through the string
j stringLoop

#once the loop reaches the end of the string
exit:
addi $sp, $sp, 2
jr $ra
