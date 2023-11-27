# f = (g+h) - (i+j);
addi $s1, $zero,10 #$s1 = 0 + 10 = g
li $s2,5 #$s2 = 5 = h
add $s3, $zero, $s2 #$s3 = 0+$s2 = 5 = i
move $s4, $s3 # s4 = s3 = 5 = j


add $t0, $s1, $s2 
add $t1, $s3, $s4
sub $s0, $t0, $t1

li $v0, 1 #system code to print int
move $a0, $s0 # move f into $a0 to print
syscall #make a call to the system
