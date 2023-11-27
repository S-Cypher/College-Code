.data
SectionOne: .asciiz "This part of the code will take two numbers and then return the sum of those numbers"
First: .asciiz "Enter the first value: "
Second: .asciiz "Enter the second value: "
Sum: .asciiz "The sum of the two values is: "

SectionTwo: .asciiz "This next part will take in a string and repeat it back to you"
UserString: .asciiz "Enter your string here: "
StringEcho: .asciiz "The string you entered is: "
space: .space 32

#Section 1:
#Read in two input values and output the result of adding these two values together
.text
li $v0, 4 #instruction to print a string
la $a0, SectionOne #loads the memory location of SectionOne into a0 to be printed
syscall

li $v0, 11 #prints a character
li $a0, 10 #ascii value for new line character
syscall

li $v0, 4 #getting ready to print a string
la $a0, First #loads the memory address of First into a0 for it to be printed
syscall

li $v0, 5 #reads an integer
syscall
move $t0, $v0 #t0 holds the first value

li $v0, 4
la $a0, Second
syscall

li $v0, 5 #read integer
syscall
move $t1, $v0 #t1 holds the second value

add $t2, $t0, $t1

li $v0, 4
la $a0, Sum 
syscall

li $v0, 1
move $a0, $t2
syscall

li $v0, 11
li $a0, 10
syscall

#Section 2:
#Read in a string and repeat that string back to the user
li $v0, 4
la $a0, SectionTwo
syscall

li $v0, 11
li $a0, 10
syscall

li $v0, 4
la $a0, UserString
syscall

li $v0, 8 #reads a string, but differently
la $a0, space #the amount of space needed to take in the string
li $a1, 32 #max number of characters to read from the user
syscall

li $v0, 4
la $a0, StringEcho
syscall

li $v0, 4
la $a0, space
syscall

li $v0, 10 #exits the program correctly (no "dropped off bottom")
syscall
