
li $a0, 5 #n = 5

jal fact

move $a0, $v0
li $v0, 1
syscall

li $v0, 10
syscall

fact:
addi $sp, $sp, -8 #space for two registers
sw $ra, 4($sp) #saving $ra
sw $a0, 0($sp) #saving $a0

slti $t0, $a0, 1
beq $t0, $zero, else #if n<= 1, go to else
li $v0, 1 #set v0 to 1
addi $sp, $sp, 8 #restore $sp
jr $ra

else:
sub $a0, $a0, 1 #a0 = (n-1)
jal fact #call fact

lw $a0, 0($sp) #restore a0
lw $ra, 4($sp) #restore $ra
addi $sp, $sp, 8 #restore the $sp

mul $v0, $a0, $v0 #return n*fact(n-1)
jr $ra #return






