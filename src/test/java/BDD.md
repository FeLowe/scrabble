**Behavior**                                		**User Input**                        	**Expected Output**
will take a letter and compare with that letter 		a 										a

will take the letter a and replace with a value of 		a 										1
1

will take user input of a string 						cat 									["c", "a", "t"]
and parse into individual letters

if parsed string contains a vowel or l,n,r,s, or t 		cat 									["c", 1, 1]
will replace letter with value of 1

if parsed string contains d or g, will replace			dog										[2, 1, 2]
letter with value of 2

if parsed string contains b,c,m, or p,					bam										[3, 1, 3]
will replace letter with value of 3 

if parsed string contains f, h, v, w, or y				wave									[4, 1, 4, 1]
will replace letter with value of 4

if parsed string contains the letter k 					kale									[5, 1, 1, 1]
will replace letter with value of 5

if parsed string contains the letter j, or x            jax										[8, 1, 8]
will replace letter with the value of 8

if parsed string contains the letter q, or z,			quake									[10, 1, 1, 5, 1]
will replace letter with the value of 10

if letters replaced with values, will 					quake									[18]
add all values together						