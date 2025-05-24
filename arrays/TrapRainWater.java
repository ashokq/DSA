import java.util.Scanner;

public class TrapRainWater {
    public static void main(String args[]){
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

        int[] lmb = new int[n]; //Left Max Boundary
        int[] rmb = new int[n]; //Right Max Boundary

        lmb[0] = arr[0];
        rmb[n-1] = arr[n-1];

        for (int i = 1; i < n; i++) {
            lmb[i] = Math.max(arr[i], lmb[i-1]);
        }

        for (int i = n-2; i >=0; i--) {
            rmb[i] = Math.max(arr[i], rmb[i+1]);
        }

        int trappedWater = 0;
        for(int i=0;i<n;i++){
            trappedWater = trappedWater + (Math.min(lmb[i],rmb[i])-arr[i]);
        }
        System.err.println("Trapped Water:"+trappedWater);
    }
}

// Output:
// Enter the Size of the Array:
// 7
// Enter the Elements of the Array:
// 4
// 2
// 0
// 6
// 3
// 2
// 5
// Given Array:
// 4,2,0,6,3,2,5,
// Trapped Water:11