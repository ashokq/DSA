//Find the best time to buy and sell the stocks

import java.util.Scanner;

public class Stocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No of Days:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Stock price on each day:");
        for(int i=0;i<n;i++){
           arr[i] = sc.nextInt();
        }
        System.out.println("Given Stock Prizes:");
        for(int i=0;i<n;i++){
           System.out.print(arr[i]+",");
        }
        System.out.println();

        int buyPrize = Integer.MAX_VALUE;
        int sellPrize = Integer.MIN_VALUE;
        int Profit = 0;
        for(int i=0;i<arr.length;i++){
            if(buyPrize<arr[i]){
                int p = arr[i] - buyPrize;
                Profit = Math.max(Profit,p);
                if(arr[i]>sellPrize){
                    sellPrize = arr[i];
                }
            }else{
                buyPrize = arr[i];
            }
        }
        System.out.println("Best Time to buy Stocks:"+buyPrize);
        System.out.println("Best Time to Sell Stocks:"+sellPrize);
        System.out.println("The Profit:"+Profit);
    }
}


// Output:
// Enter the No of Days:
// 6
// Enter the Stock price on each day:
// 7
// 1
// 5
// 3
// 6
// 4
// Given Stock Prizes:
// 7,1,5,3,6,4,
// Best Time to buy Stocks:1
// Best Time to Sell Stocks:6
// The Ptofit:5