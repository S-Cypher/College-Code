#A[12] = h + A[8];
.data
A: .word 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15

.text
li $s2, 5 #h
la $s3, A #base address of A is in $s3

lw $t0, 32($s3) #$t0 = A[8]
add $t0, $s2, $t0 #$t0 = h + A[8]
sw $t0, 48($s3) #A[12] = $t0

