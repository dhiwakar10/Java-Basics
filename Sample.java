// Get input for 3 integer variables:a,b,c.
// Now multiply all variables and store in d.
// Now add all variables and store in e.
// noe divide d by e.




import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = a*b*c;
        int e = a+b+c;

        System.out.println(d);
        System.out.println(e);
        System.out.println(d/e);



        
    }

    
} 

