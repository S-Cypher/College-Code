li $s0, 9 #$s0 = 9 = 0000 1001

sll $t4, $s0, 4 #shift 4 bits to the left

li $v0, 1 #print
move $a0, $t4
syscall

li $v0, 11 #newline
li $a0, '\n'
syscall

srl $t2, $t4, 4 #shift $t4 right 4 bits

li $v0, 1 #print
move $a0, $t2
syscall

li $v0, 10
syscall