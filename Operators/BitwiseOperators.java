package Operators;

public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 9; //  1001
        int b = 10; // 1010

        // Bitwise AND --> & --> Returns 1 only if both corresponding bits of both operands are 1, otherwise 0
        System.out.println(a & b); // 1000 --> 8

        // Bitwise OR --> | --> Returns 1 if at least one of the corresponding bits of the operands is 1
        System.out.println(a | b); // 1011 --> 11

        // Bitwise XOR --> ^ --> Returns 1 if the bits are different (one 1 and one 0). Returns 0 if the bits are the same (both 1 or both 0)
        System.out.println(a ^ b); // 0011 --> 3

        // Bitwise NOT (complement) --> ~ --> Inverts each bit of the operand (i.e., 0 becomes 1 and 1 becomes 0)
        System.out.println(~a); // 0110 --> 6
        System.out.println(~b); // 0101 --> 5

    }
}
