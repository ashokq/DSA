// In Kadane's Algorithm the max sub array will be repalced by zero if the value is negative

import java.util.Scanner;

public class Kadanes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements of the Array:");
        for(int i=0;i<n;i++){
           arr[i] = sc.nextInt();
        }
        System.out.println("Given Array:");
        for(int i=0;i<n;i++){
           System.out.print(arr[i]+",");
        }
        System.out.println();

        int ms=Integer.MIN_VALUE,cs=0;
        for (int i = 0; i < arr.length; i++) {
            cs = cs + arr[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Maximum Sub Array Sum:"+ms);
    }
}

// Output:
// Enter the Size of the Array:
// 5
// Enter the Elements of the Array:
// 2
// 4
// 6
// 8
// 10
// Given Array:
// 2,4,6,8,10,
// Maximum Sub Array Sum:30