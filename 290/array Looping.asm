.data 
Array: .word 1,2,3,4,5

.text
la $s3, Array
move $s0, $zero

loop:
beq $s0, 5, exit
lw $t0, 0($s3) #load from the array

li $v0, 1
move $a0, $t0
syscall

li $v0, 11
li $a0, '\n'
syscall

addi $s3, $s3, 4 #moving my address by 4 bytes
addi $s0, $s0, 1

j loop


exit:
li $v0, 10
syscall

