import java.util.Scanner;

public class LinearSearch{
    public static int Search(int[] arr,int key){
        for (int i = 0; i <= arr.length; i++) {
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
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
        System.out.println("Enter the Element to Search:");
        int key = sc.nextInt();
        int res = Search(arr,key);
        if(res==-1){
            System.out.println("The Element is not found");
        }else{
            System.out.println("The Element found at "+res+" Position");
        }
        sc.close();
    }
}

/*
Output:-
Enter the Size of the Array:
5
Enter the Elements of the Array:
2
1
5
6
4
Enter the Element to Search:
6
The Element found at 3 Position
 */