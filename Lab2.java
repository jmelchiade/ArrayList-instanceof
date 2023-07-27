
// Question 3 Given the following code:

// class Mystry
// {
// public static void main(String[] arg)
// {
// int i = 10;
// int j = 12;
// if (i < j || i = 3)
// System.out.println(“i is “ +  i );	
// }
// }

// (a) On the space provided below, write what you think will result when you attempt to compile the program.

// The output cannot compile. The variable i is defined as the integer 10, which is less than j (12), however it is not equal to three. The if statement is written as though to reassign the integer value of i, so the code cannot compile. I believe the if statement should read:
// If ( i < j || i <=/>= 3)… In this case, the code will compile because the condition if (i < j) is true.

// (b) if the program did not compile fix the error(s). Record the correction in the space provided below.

// class Mystry
// {
// public static void main(String[] arg)
// {
// int i = 10;
// int j = 12;
// if (i < j || i <= 3)
// System.out.println("i is " +  i );	
// }
// }

//  Alternatively,

class Mystry {
    public static void main(String[] arg) {
        int i = 10;
        int j = 12;
        if (i < j && i <= 3) {
            System.out.println("i is " + i);
        } else {
            System.out.println("i is not less than or equal to three");
        }
    }
}
