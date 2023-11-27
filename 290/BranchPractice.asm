#Branch Not Equal Practice

li $s1, 10 #g
li $s2, 5 #h
li $s3, 5 #i
li $s4, 5 #j

bne $s3, $s4, Else #if $s3 !=$s4 go to Else
add $s0, $s1, $s2 # f = s0 = s1 + s2 = g + h

j PrintAndExit #Jump to skip the Else
Else: sub $s0, $s1, $s2 #f = s0 = s1 - s2 = g-h

PrintAndExit: 
#print result
li $v0, 1
move $a0, $s0
syscall

#close the program
li $v0, 10
syscall