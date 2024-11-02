package _01_Operators;

public class AssignmentOperators {
    public static void main(String[] args) {
        int p = 15, q = 20, r = 12;

        p += q; // p = p + q
        System.out.println("p = " + p); // p = 35

        q -= r; // q = q - r
        System.out.println("q = " + q); // q = 8

        r *= p; // r = r * p
        System.out.println("r = " + r); // r = 420

        q %= p; // q = q % p
        System.out.println("q = " + q); // q = 8

        r /= p; // r = r / p
        System.out.println("r = " + r); // r = 12
    }
}
