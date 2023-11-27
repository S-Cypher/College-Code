#while(i != 10)
# i++

li $s3, 1 #i

while: #start of the loop
beq $s3, 10, Exit #if s3 == 10, exit loop
addi $s3, $s3, 1
j while #restart loop

Exit:
li $v0, 10
syscall