/*
 Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 */

import java.util.Scanner;

public class IsDuplicate {
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

        int[] duplicates = new int[n];
        int a = 0;
        boolean b = false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    duplicates[a] = arr[i];
                    a++;
                    b = true;
                }
            }
        }
        if(b==true){
            System.out.println("Array contains Duplicate Elements.");
            System.out.println("Duplicates Array:");
            for(int i=0;i<n;i++){
                System.out.print(duplicates[i]+",");
            }
        }else{
            System.out.println("Array Does't contains Duplicate Elements.");
        }
        
    }
}

// Output:
// Enter the Size of the Array:
// 5
// Enter the Elements of the Array:
// 1 
// 3
// 2
// 1
// 2
// Given Array:
// 1,3,2,1,2,
// Array contains Duplicate Elements.
// Duplicates Array:
// 1,2,0,0,0,