package _01_Operators;

public class Questions {
    public static void main(String[] args) {
        System.out.println(5 / 3 * 2 + 5); // left to right evaluation --> 1 * 2 + 5 --> 2 + 5 --> 7

        int p = 10, q = 14, r = 20;
        System.out.println(p - ++r - ++q); // 10 - 21 - 15 --> -26

        System.out.println(4 + 5 + "pqr"); // left to right associativity --> 9 + "pqr" --> 9pqr
        System.out.println("abc" + 4 + 2); // left to right associativity --> "abc4" + 2 --> "abc42"

        System.out.println(false == false == true); // left to right evaluation (associativity) --> true == true --> true
    }
}
