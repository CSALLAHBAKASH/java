public class Main {
    // A simple method that adds two integers
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Print a message
        System.out.println("Hello, Java!");

        // Declare and initialize variables
        int x = 10;
        int y = 20;

        // Use the add method
        int sum = add(x, y);
        System.out.println("Sum: " + sum);

        // Conditional statement
        if (sum > 20) {
            System.out.println("The sum is greater than 20");
        } else {
            System.out.println("The sum is 20 or less");
        }

        // Loop from 1 to 5
        System.out.println("Counting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}