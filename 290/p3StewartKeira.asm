#Keira Stewart
#October 9, 2023
#Program 3
#Making Arrays and Searching in Them
.data
Array: .space 80 #20 * 4 (limit * size of access)
Start: .asciiz "This program will allow the user to create an array from submitted values and take in a value to also search for.\n"
ArrayQuestion: .asciiz "How many items will the array contain?\n"
Limit: .asciiz "Please enter a number between 1 and 20: "
Value: .asciiz "Enter a number: "
Search: .asciiz "Enter the value to search for: "
Found: .asciiz "The value is in the list!"
NotFound: .asciiz "The value is not in the list."

.text
li $v0, 4
la $a0, Start #introducing the user to what the program does
syscall

li $v0, 4
la $a0, ArrayQuestion #asking how many items will be in the array
syscall

li $v0, 4
la $a0, Limit #giving the user their limits for the size of the array
syscall

li $v0, 5 #taking in the size of the array that the user wants
syscall
move $s0, $v0 #s0 holds the size of the array

la $s3, Array #s3 holds the base address of the array

li $t0, 0 #counter to help end the loop

loop:
beq $t0, $s0, Next #if t0 equals the size of the array
lw $s2, 0($s3) 

li $v0, 4 #printing the prompt to insert numbers into the array
la $a0, Value #prompt!
syscall

li $v0, 5 #ready to read user input
syscall
sw $v0, 0($s3)

addi $t0, $t0, 1
addi $s3, $s3, 4
j loop

Next:
li $v0, 4
la $a0, Search #asking for a value to search
syscall

li $v0, 5
syscall
move $s1, $v0

la $s3, Array 
li $t0, 0 #counter again

find:
beq $t0, $s0, NoMatch #if the program reaches the end of the array without a match, then the number is not there
lw $s2, 0($s3)
beq $s1, $s2, Match
addi $s3, $s3, 4
addi $t0, $t0, 1
j find

NoMatch:
la $v0, 4
la $a0, NotFound
syscall

li $v0, 10 #I'm guessing having it end here would be better since the program runs top to bottom
syscall

Match:
li $v0, 4
la $a0, Found
syscall

li $v0, 10
syscall
