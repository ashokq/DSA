import java.util.Scanner;

public class ReverseArray {
    public static void reverse(int[] arr){
        int start = 0,end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements of the Array:");
        for(int i=0;i<n;i++){
           arr[i] = sc.nextInt();
        }
        System.out.println("Original Array:");
        for(int i=0;i<n;i++){
           System.out.print(arr[i]+",");
        }
        System.out.println();
        reverse(arr);
        System.out.println("Array After Reverse:");
        for(int i=0;i<n;i++){
           System.out.print(arr[i]+",");
        }
    }
}


/*
Enter the Size of the Array:
5
Enter the Elements of the Array:
7
4
2
9
8
Original Array:
7,4,2,9,8,
Array After Reverse:
8,9,2,4,7,
 */