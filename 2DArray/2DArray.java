import java.util.*;

class twoDArray {

    public static void main(String[] args) {
        boolean endOfProgram = false;
        Scanner sc = new Scanner(System.in);
        String choice = "";

        while (endOfProgram == false) {
            // two_d_array(sc);

            System.out.print("\n");
            System.out.print(
                    "Continue for the program (y/n): ");
            choice = sc.nextLine();

            if (choice == "y")
                break;
        }
        sc.close();
    }

    public static void two_d_array(Scanner sc) {
        // Scanner sc = new Scanner(System.in);
        System.out.print(
                "Enter the length of the Array, \nFor example 3x3, please input 3\nFor example 2x2, please enter 2\nPlease enter the number: ");

        int lengthOfArray = sc.nextInt();
        sc.nextLine();
        int n = lengthOfArray;
        int a[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            System.out.print("\n");
            System.out.printf("Enter all the numbers in the row %s \n", i + 1);
            for (int j = 0; j < n; j++) {
                System.out.printf("Enter for the %s element: ", j + 1);
                a[i][j] = sc.nextInt();
                sc.nextLine();
            }
        }

        System.out.print("\n");
        System.out.println("Results: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}