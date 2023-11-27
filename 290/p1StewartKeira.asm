#Keira Stewart
#9/11/2023
#Information Technology
#Program 1: Guess the Number

#Player 1 input
li $v0, 5
syscall
move $a0, $s0
move $s0, $v0

#New line character
li $v0, 11
li $a0, 10
syscall

Guess:
#Player 2 input 
li $v0, 5
syscall
move $t0, $v0 #temp since the number has to change until the program closes?

#loop
While:
beq $t0, $s0, Match #if the numbers are the same, this line exits the loop
bgt $t0, $s0, Bigger
blt $t0, $s0, Smaller

Smaller:
#prints out a -1
#jumps back to the input for a new guess
li $v0, 1
li $a0, -1
syscall

#new line
li $v0, 11
li $a0, 10
syscall
j Guess


Bigger:
#prints out a 1
#jumps back to the input for a new guess
li $v0, 1
li $a0, 1
syscall

#new line
li $v0, 11
li $a0, 10
syscall
j Guess

Match:
li $v0, 1
li $a0, 0 #prints a 0 for a matching number
syscall

li $v0, 10 #exits the program
syscall
