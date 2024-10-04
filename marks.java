
// Get Input for 3 variables: Name,Score,Department
//let the user enter the score for 100 marks
//you convert it for 10 and print it.

import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int score = scan.nextInt();
        scan.nextLine();
        String department = scan.nextLine();

        System.out.println("My Name is "+ name);
        System.out.println("My Score is "+ score/10 );
        System.out.println("My Department is "+ department);
    }

    
}
