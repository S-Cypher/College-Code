While:
slti $t0, $s3, 10 #t0 = $s3 < 10
beq $t0, $zero, Exit #exit when $t0 >= 10
addi $s3, $s3, 1 #i++
j While

Exit:
#exit the program
