.text
li $a0, 10 #g
li $a1, 5 #h
li $a2, 5 #i
li $a3, 5 #j
li $s0, 290 

jal leaf_example #calling the function

move $s1, $v0 #copy return value into s1

li $v0, 1 #print returned value
move $a0, $s1
syscall

li $v0, 11 #print a new line character
li $a0, '\n'
syscall

li $v0, 1 #print s0
move $a0, $s0
syscall

li $v0, 10
syscall

leaf_example:
addi $sp, $sp, -4 #adjust the stack down
sw $s0, 0($sp) #saves s0 on the stack

add $t0, $a0, $a1 #$t0 = $a0+$a1 = g+h
add $t1, $a2, $a3 # $t1 = i+j = $a2+$a3
sub $s0, $t0, $t1 # f= $s0 = $t0-$t1

move $v0, $s0 #setting up the return value

lw $s0, 0($sp) #restores $s0
addi $sp, $sp, 4 #restore $sp (stack pointer)
jr $ra
