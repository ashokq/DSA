import java.util.Scanner;

public class ReverseArray1 {
    public static void reverse(int[] arr,int n) {
        int[] a = new int[n];
        int in = 0;
        for (int i = n-1; i >=0; i--) {
            a[in] = arr[i];
            in++;
        }
        System.out.println("Array After Reverse:");
        for(int i=0;i<a.length;i++){
           System.out.print(a[i]+",");
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
        reverse(arr,n);
        
    }
}


/*
Output:-
 Enter the Size of the Array:
5
Enter the Elements of the Array:
7
4
2
8
0
Original Array:
7,4,2,8,0,
Array After Reverse:
0,8,2,4,7,
 */