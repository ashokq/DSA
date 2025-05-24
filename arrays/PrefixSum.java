//Another and optimized approach to find maximum sub array sum

import java.util.Scanner;

public class PrefixSum {
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

        int[] prefixArray = new int[arr.length];
        prefixArray[0] = arr[0];
        for (int i = 1; i <prefixArray.length; i++) {
            prefixArray[i] = prefixArray[i-1]+arr[i];
        }
        System.out.println("Prefix Array:");
        for(int i=0;i<n;i++){
           System.out.print(prefixArray[i]+",");
        }
        System.err.println();
        int sum = 0;
        int max = Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){ //To describe the Starting Element
          for(int j=i;j<arr.length;j++){ //To describe the Ending Element
            sum = i==0? prefixArray[j] :prefixArray[j] - prefixArray[i-1];
            if(sum>max){
                max = sum;
            }
          }
       }
       System.out.println("Maximum Sub Array Sum:"+max);

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
// Prefix Array:
// 2,6,12,20,30,
// Maximum Sub Array Sum:30