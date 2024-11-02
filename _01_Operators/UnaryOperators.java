package _01_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        // pre-increment ++p --> increment first assignment second
        // post-increment p-- --> assignment first increment second

        // pre-decrement --p --> decrement first assignment second
        // post-decrement p-- --> assignment first decrement second

        int p = 32;

        System.out.println("p: " + p); // p = 32
        System.out.println("p: " + p++); // p = 32
        System.out.println("p: " + ++p); // p = 34
        System.out.println("p: " + p); // p = 34
        System.out.println("p: " + p--); // p = 34
        System.out.println("p: " + p++); // p = 33
        System.out.println("p: " + --p); // p = 33
        System.out.println("p: " + p); // p = 33
    }
}
