/* Program to Print a stars(*) where a Right angled Triangle will form */

import java.util.Scanner;
public class RightTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Lines:");
        int n =sc.nextInt();
        for(int i=1;i<=n;i++){ //The Loop to describe the Number of Lines in the Pattern
           for(int j=1;j<=i;j++){ //The Loop to describe the number of *'s in each Line
              System.out.print("*");
           }
           System.out.println();
        }
        sc.close();
    }
}

// Output:
// Enter the Number of Lines:
// 5
// *
// **
// ***
// ****
// *****