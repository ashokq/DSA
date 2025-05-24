import java.util.Scanner;

public class MaxSubArraySum {
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
        int sum = 0;
        int max = Integer.MIN_VALUE;
        System.out.println("Sub arrays for given Array:");
       for(int i=0;i<arr.length;i++){ //To describe the Starting Element
         System.out.println("Starting from "+arr[i]);
          for(int j=i;j<arr.length;j++){ //To describe the Ending Element
            sum = 0;
            for(int k=i;k<=j;k++){   //To Print Elements From Start to End
            System.out.print(arr[k]+",");
            sum = sum + arr[k];
            }
            if(sum>max){
                max = sum;
            }
            System.out.print(" --> Sum of Sub Array:"+sum);
            t++;
            System.out.println();
          }
          
          System.out.println();
       }
       System.out.println("Total Number of Sub Arrays:"+t);
       System.out.println("Maximum Sub Array Sum:"+max);
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
2, --> Sum of Sub Array:2
2,4, --> Sum of Sub Array:6
2,4,6, --> Sum of Sub Array:12
2,4,6,8, --> Sum of Sub Array:20
2,4,6,8,10, --> Sum of Sub Array:30

Starting from 4
4, --> Sum of Sub Array:4
4,6, --> Sum of Sub Array:10
4,6,8, --> Sum of Sub Array:18
4,6,8,10, --> Sum of Sub Array:28

Starting from 6
6, --> Sum of Sub Array:6
6,8, --> Sum of Sub Array:14
6,8,10, --> Sum of Sub Array:24

Starting from 8
8, --> Sum of Sub Array:8
8,10, --> Sum of Sub Array:18

Starting from 10
10, --> Sum of Sub Array:10

Total Number of Sub Arrays:15
Maximum Sub Array Sum:30
 */