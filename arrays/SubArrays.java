import java.util.Scanner;

public class SubArrays {
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
        int t =0;
        System.out.println("Sub arrays for given Array:");
       for(int i=0;i<arr.length;i++){ //To describe the Starting Element
         System.out.println("Starting from "+arr[i]);
          for(int j=i;j<arr.length;j++){ //To describe the Ending Element
            for(int k=i;k<=j;k++){   //To Print Elements From Start to End
             System.out.print(arr[k]+",");
            }
            t++;
            System.out.println();
          }
          
          System.out.println();
       }
       System.out.println("Total Number of Sub Arrays:"+t);
   }
}


/*
 Enter the Size of the Array:
5
Enter the Elements of the Array:
2
4
6
8
10
Given Array:
2,4,6,8,10,
Sub arrays for given Array:
Starting from 2
2,
2,4,
2,4,6,
2,4,6,8,
2,4,6,8,10,

Starting from 4
4,
4,6,
4,6,8,
4,6,8,10,

Starting from 6
6,
6,8,
6,8,10,

Starting from 8
8,
8,10,

Starting from 10
10,

Total Number of Sub Arrays:15
 */