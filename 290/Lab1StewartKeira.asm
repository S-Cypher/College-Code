# f = g + (h - i) + j

#placing the numbers in saved value registers
li $s0, 20 #g
li $s1, 14 #h
li $s2, 6 #i
li $s3, 22 #j

sub $t0, $s1, $s2 # (h - i)
add $t1, $t0, $s0 # g + (h - i)
add $s4, $t1, $s3 # g + (h - i) + j

#printing the value as an integer (50!)
li $v0, 1 #system code to print an integer
move $a0, $s4 #copy $s4 into $a0
syscall 

#new line character
li $v0, 11
li $a0, 10 #I kept trying to use move here...
syscall

li $v0, 5 #replacing h with user input
syscall #calling to the system
move $a0, $s1
move $s1, $v0

li $v0, 5 #replacing j with user input
syscall
move $a0, $s3
move $s3, $v0


li $s0, 20 #g
li $s2, 6 #i

#s1 = 10, s3 = 1
sub $t0, $s1, $s2 # (h - i)
add $t1, $t0, $s0 # g + (h - i)
add $s4, $t1, $s3 # g + (h - i) + j

li $v0, 1 #prints the new result (should be 25)
move $a0, $s4
syscall


li $v0, 10 #terminates the program correctly
syscall
