.data
original: .asciiz "hello world"
copy: .space 32

.text
la $s1, original #base address for original
la $s0, copy #base address for copy
move $s3, $zero #basically int i = 0

while:
add $t1, $s3, $s1 #t1 = address of original[i]
lbu $t2, 0($t1) #t2 = original[i]
add $t3, $s3, $s0 #t3 = address of copy[i]
sb $t2, 0($t3) #copy[i] = t2
beq $t2, '\0', exit #exit if t2 == null
addi $s3, $s3, 1 #s3 = i = i++
j while


exit:
li $v0, 4
la $a0, copy
syscall

li $v0, 10
syscall

