import java.util.Scanner;

public class ArrayPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array:");
        int n = sc.nextInt();
        int p = n*(n-1)/2; //To Find the Total no of Pairs
        // System.out.println("Total No of Pairs:"+p);
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
        int nop = 0;
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                System.out.println("("+arr[i]+","+arr[j]+")");
                nop++;
            }
        }
        System.out.println("Total No of Pairs:"+nop);
    }
}

/*
Output:-
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
(2,4)
(2,6)
(2,8)
(2,10)
(4,6)
(4,8)
(4,10)
(6,8)
(6,10)
(8,10)
Total No of Pairs:10
 */
