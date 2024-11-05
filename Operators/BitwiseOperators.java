package Operators;

public class BitwiseOperators {
    public static void main(String[] args) {
        // computer data stored in -- binary --- 0/1
        int a = 9;
        System.out.println(Integer.toBinaryString(a)); // 9 is stored in binary as "1001"
        // 00000000 00000000 00000000 00001001 -- in reality the binary is like this of 9 but the initial zeros are not printed because it is of no use


        // operands for bitwise operator are -- byte, short, int, long 
        // we can't do bitwise operations on floating point numbers

        // -------- AND & OPERATOR --------
        // Returns 1 only if both corresponding bits of both operands are 1, otherwise 0

        int c = 5 & 4; // 101 & 100 --> 100
        System.out.println(c); // 4


        // -------- OR | OPERATOR (pipe) --------
        // Returns 1 if at least one of the corresponding bits of the operands is 1

        c = 8 | 4; // 1000 | 0100 --> 1100
        System.out.println(c); // 12


        // -------- XOR ^ OPERATOR (caret) --------
        // Returns 1 if the bits are different (one 1 and one 0). Returns 0 if the bits are the same (both 1 or both 0)
        c = 9 ^ 13; // 1001 ^ 1101 --> 0100
        System.out.println(c); // 4


        // -------- NOT ~ OPERATOR (tilde) --------
        // Inverts each bit of the operand (i.e., 0 becomes 1 and 1 becomes 0)
        a = 5;
        System.out.println(Integer.toBinaryString(a)); // "101"
        c = ~a;
        System.out.println(c); // -6
        System.out.println(Integer.toBinaryString(c)); // "11111111111111111111111111111010"


        // -------- LEFT SHIFT << OPERATOR --------
        // shifts bits to the left by a specified number of positions. For each shift, it adds a 0 to the right of the binary number. The leftmost bits are discarded, and the empty spaces on the right are filled with 0s.
        // Note: a << b = a * 2^b (2 ki power b)

        a = 9;
        System.out.println(Integer.toBinaryString(a)); // "1001"
        c = a << 2; // 1001 << 2
        System.out.println(c); // 36
        System.out.println(Integer.toBinaryString(c)); // "100100"


        // -------- RIGHT SHIFT >> OPERATOR --------
        // shifts bits to the right by a specified number of positions. For each shift, it discards the rightmost bits. In signed integers, the leftmost bit (the sign bit) is preserved for negative numbers to maintain the sign, called arithmetic right shift.
        // Note: a >> b = a/(2^b) [2 ki power b]

        a = 14;
        System.out.println(Integer.toBinaryString(a)); // "1110"
        // right shift operator jab apn +ve number pe apply kr rhe toh leftmost bit ko +ve jhod dia jayega yaani ki zero jhod dia jayega
        c = a >> 2; // 1110 << 2
        System.out.println(c); // 3
        System.out.println(Integer.toBinaryString(c)); // "11"


        // right shift with negative number
        // -ve number ke case mein right shift operator leftmost bit ko zero nhi jhodta usko 1 kr deta hai (or 1 ka matlab negative hota hai)
        a = -14;
        System.out.println(Integer.toBinaryString(a)); // "11111111111111111111111111110010"
        c = a >> 2;
        System.out.println(c); // -4
        System.out.println(Integer.toBinaryString(c)); // "11111111111111111111111111111100"


        // -------- UNSIGNED RIGHT SHIFT >>> OPERATOR --------
        // same as right shift operator the only difference is -ve number ke case mein unsigned right shift operator leftmost bit ko zero kr deta hai matlab ki +ve kr deta hai number ko
        a = -14;
        System.out.println(Integer.toBinaryString(a)); // "11111111111111111111111111110010"
        c = a >>> 2;
        System.out.println(c); // 1073741820
        System.out.println(Integer.toBinaryString(c)); // "111111111111111111111111111100"


        // unsigned right shift operator with +ve numbers -- same 2 same as right shift operator -- no difference
        a = 14;
        System.out.println(Integer.toBinaryString(a)); // "1110"
        c = a >>> 2;
        System.out.println(c); // 3
        System.out.println(Integer.toBinaryString(c)); // "11"
    }
}
