package arrayprograms;

import java.util.Scanner;

public class MaxElement {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[5];

        System.out.println("Enter elements in Array:");

        // Step 1: Take input
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 2: Assume first element as max
        int max = arr[0];

        // Step 3: Find max
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        // Step 4: Print result
        System.out.println("Maximum element is: " + max);
    }
}