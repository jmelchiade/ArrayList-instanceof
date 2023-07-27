class Test {
    boolean more;
    int x;

    void check() {
        if (!more && x == 0)
            System.out.println(x + 20);
        else
            System.out.println(!more);
    }
}

class Driver {
    public static void main(String str[]) {
        Test t = new Test();
        t.check();
    }
}

// Enter the code, compile and execute it. Compare your original response with
// the output generated.

// The Boolean and the variable integer are set to a default value since they
// are not defined. The Boolean will be false, and x will have a value of 0.
// As we pass through the if statement, there is a bang operator and our
// variable more, which is false. Since there is a bang operator, the line
// reads, “If more is true and x is equal to zero, print a line (0 + 20). The
// terminal will print a value of 20.
// The class Driver is used to execute the program.
