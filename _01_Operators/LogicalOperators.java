package _01_Operators;

public class LogicalOperators {
    public static void main(String[] args) {
        int p = 15, q = 10, r = 5;

        System.out.println((p > q) && (q > r)); // true
        System.out.println((p > q) && (q < r)); // false
        System.out.println(!(p != q)); // false

        // AND && Operator
        System.out.println("-------- && Operator --------");
        System.out.println(true && true && true && true); // true
        System.out.println(true && false && true && true); // false
        // System.out.println(1 && 0 && 1); // ERROR: && operator used to perform a logical AND operation, but it only works with boolean values (true or false)

        // OR || Operator
        System.out.println("-------- || Operator --------");
        System.out.println(true || true || false); // true
        System.out.println(false || false || false || false); // false
        System.out.println(true || false); // true
        
        // NOT ! Operator
        System.out.println("-------- ! Operator --------");
        System.out.println(!true); // false
        System.out.println(!false); // true
    }
}
