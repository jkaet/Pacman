/**
 * CS 2110 Fall 2014 HW2
 * Part 2 - Coding with bitwise operators
 * @author [Your name here or you will lose points!]
 * 
 * *** NOTE: The rules are different for each java file! ***
 * 
 * The only things you are allowed to use in your code are the following:
 *	   - The bitwise operators |, &, ~, ^, <<, >>
 *     - Increment and Decrement (++ and --).
 *         - You may also add or subtract 1 from a number, but it must be only 1.
 *     - Boolean operators ||, &&, and !, which are only allowed in if-statements.
 *     - Conditional statements: if, if-else, switch-case, ? :
 *         - However, you may only handle up to two cases, or 2 conditionals. This means ternaries, too!
 *     - Equality comparisons (==, !=, <=, >=, <, >).
 *
 * You are not allowed to use anything not mentioned above. This includes the following,
 * but is not an exhaustive list:
 *     - Multiplication or Division
 *     - Addition or Subtraction with numbers other than 1.
 *          - Iteration in functions other than toString.
 *          - The unsigned right shift operator >>> (C does not provide this operator).
 *     - Modulus (%).
 *     - Any functions found in Java libraries (especially the Math library).
 *         - Example: Math.pow, Integer.bitCount, etc.
 *     - Casting (you should not have cast anywhere!)
 *          - Any Java 7 feature / standard library function.
 *            (we will be grading using Java 6)
 *      
 *     - Switch-case ban, you may not use more than 2 if-statements, or two
 *       case-statements using switch. (see the next point)
 *
 * Finally, your code must be robust and concise. If we asked you to print out the values 1 through 100
 * and you wrote 100 separate print statements, then sure, it works, but no one's gonna hire a coder who does
 * that. Likewise, you will NOT get credit for verbose answers for which there is a much more concise
 * solution. For instance, if you need to shift a value by n*4 times, you may not write x << n << n << n << n
 * or you will get no credit, because there is a much more concise way to do this in one operation by
 * shifting n. Keep this in mind, ESPECIALLY in the first 2 functions in this file.
 *
 * Remember that for this assignment, All bit masks must be written in hexadecimal.
 * This is the convention for masks and makes it much easier for the programmer to
 * understand the code. If you write a mask in any other base you will lose points.
 *
 * All of these functions accept ints as parameters because if you pass in a number
 * (which is of type int by default) into a function accepting a byte, then the Java
 * compiler will complain even if the number would fit into that type.
 *    
 * Now, keep in mind the return value is also an int. Please read the comments about how
 * many significant bits to return and make sure that the other bits are not set or else
 * you will not get any points for that test case.
 * i.e if I say to return 6 bits and you return 0xFFFFFFFF, you will lose points.
 *
 * Definitions of types:
 * nibble - 4 bits
 * byte   - 8 bits
 * short  - 16 bits
 * int    - 32 bits
 */
public class HW2Operations
{
	/**
	 * Set an 8-bit byte in an int.
	 * 
	 * Ints are made of four bytes, numbered like so:
	 *   B3 B2 B1 B0
	 *
	 * For a graphical representation of the bits:
	 *   3322222222221111111111
	 *   10987654321098765432109876543210 <= starting with bit 0
	 *   -------+-------+-------+-------+
	 *    Byte 3| Byte 2| Byte 1| Byte 0|
     *
	 * Examples:
	 *     setByte(0xAAA5BBC6, 0x17, 1); // => 0xAAA517C6
	 *     setByte(0x56B218F9, 0x44, 3); // => 0x44B218F9
	 *
	 * Note: Remember, no multiplication allowed!
	 * 
	 * @param num The int that will be modified.
	 * @param byte The byte to insert into the integer.
	 * @param which Selects which byte to modify - 0 for least-significant byte.
	 *            
	 * @return The modified int.
	 */
	public static int setByte(int num, int a_byte, int which)
	{
		return 0;
	}
	
	/**
	 * Get a 4-bit nibble from an int.
	 *
	 * Ints are made of 8 nibbles, numbered like so:
	 *   N7 N6 N5 N4 N3 N2 N1 N0
	 *
	 * For a graphical representation of the bits:
	 *   3322222222221111111111
	 *   10987654321098765432109876543210 <= starting with bit 0
	 *   ---+---+---+---+---+---+---+---+
	 *    N7| N6| N5| N4| N3| N2| N1| N0|
	 *
	 * Examples: 
	 *     getNibble(0x56781234, 3); // => 0x1
	 *     getNibble(0xFF254545, 7); // => 0xF
	 * 
     * Note: Remember, no multiplication allowed!
     *
	 * @param num The int to get a nibble from.
	 * @param which Determines which nibble gets returned - 0 for least-significant nibble.
	 *            
	 * @return A nibble corresponding to the "which" parameter from num.
	 */
	public static int getNibble(int num, int which)
	{
		return 0;
	}

	/**
	 * Pack 4 bytes into an int.
	 * 
	 * The bytes should be placed consecutively in the 32-bit int in the order
	 * specified by the parameters.
	 * 
	 * Example:
	 *     pack(0x12, 0x34, 0x56, 0x78); // => 0x12345678
	 *     pack(0xDE, 0xAD, 0xBE, 0xEF); // => 0xDEADBEEF
	 * 
	 * @param b3 Most significant byte (will always be an 8-bit number).
	 * @param b2 2nd byte (will always be an 8-bit number).
	 * @param b1 3rd byte (will always be an 8-bit number).
	 * @param b0 Least significant byte (will always be an 8-bit number).
	 *            
	 * @return a 32-bit value formatted like so: b3b2b1b0
	 */
	public static int pack(int b3, int b2, int b1, int b0)
	{
		return 0;
	}
	
	/**
	 * Take the absolute value of an n-bit number.
	 * 
	 * Examples:
	 *     abs(0x00001234, 16); // => 0x00001234
	 *     abs(0x00001234, 13); // => 0x00000DCC
	 * 
	 * Note: We will only pass in values 1 to 31 for n.
	 * 
	 * @param num An n-bit 2's complement number.
	 * @param n The bit length of the number.
	 * @return The n-bit absolute value of num.
	 */
	public static int abs(int num, int n)
	{
		return 0;
	}

	/**
	 * NOTE: For this method, you may only use &, |, and ~.
	 *
	 * Perform an exclusive-or on two 32-bit ints.
	 *
	 * Examples:
	 *     xor(0xFF00FF00, 0x00FF00FF); // => 0xFFFFFFFF
	 *     xor(0x12345678, 0x87654321); // => 0x95511559
	 * 
	 * @param num1 An int
	 * @param num2 Another int
	 *
	 * @return num1 ^ num2
	 */
	public static int xor(int num1, int num2)
	{
		return 0;
	}
	
	/**
	 * Return true if the given number is a power of 2.
	 * 
	 * Examples:
	 *     powerOf2(1024); // => true
	 *     powerOf2(23);   // => false
	 *
	 * Note: Make sure you handle ALL the cases!
	 * Note2: Remember: Robust and concise! Do not just return an OR of all the powers of 2.
	 * 
	 * @param Num a 32-bit int. Since this is an int, it is SIGNED!
	 * @return true if num is a power of 2.
	 */
	public static boolean powerOf2(int num)
	{
		return false;
	}
}

