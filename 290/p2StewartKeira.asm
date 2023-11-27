#Keira Stewart
#September 21, 2023
#Information Technology
#Printing binary positions and their values


li $s0, 15 #starting at 15 for the positions
Positions: #looping and printing the position number
blt $s0, 0, NewLine #checking if the number is less than 0
li $v0, 1
add $a0, $s0, $zero #adding the value to a0
syscall

#Tab between each number
li $v0, 11
li $a0, 9 #horizontal tab
syscall
sub $s0, $s0, 1 #subtracts the position number 
j Positions

NewLine: 
li $v0, 11
li $a0, 10
syscall


li $s0, 32768 
BinaryDecimal: #since MIPS converts the binary into decimal in the register?
beq $s0, 0, exit #checks if the value is equal to zero
li $v0, 1
add $a0, $s0, $zero #moves the value into a0
syscall

#Tab between each number
li $v0, 11
li $a0, 9
syscall

srl $s0, $s0, 1 #shifting the bits to the right by 1
j BinaryDecimal

exit:
li $v0, 10 #exits the program propertly
syscall





