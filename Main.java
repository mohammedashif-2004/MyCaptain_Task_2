import java.io.*;
import java.util.Scanner;

public class Main {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // taking input from the user and storing in the array

        System.out.println("enter number of elements to add in array");
        int n = sc.nextInt();

        int[] number = new int[n];
        System.out.println("enter "+n+" numbers");
        for(int i=0 ; i<n ; i++){
            number[i] = sc.nextInt();
        }
        System.out.println("number stored in array are");

        for(int i=0 ; i<n ; i++){
            System.out.println(number[i]);
        }

        System.out.println("sorted array:");
        for(int num : number){
            System.out.println(num+" ");
        }

        // Finding second lowest and second highest
        if (5 < 2){
            System.out.println("Not enough elements to find second lowest and highest.");
        } 
        
        else {
            int secondLowest = -1, secondHighest = -1;

            // Find second lowest
            for (int i = 1; i < 5; i++) {
                if (number[i] != number[0]) {
                    secondLowest = number[i];
                    break;
                }
            }

            // Find second highest
            for (int i = 5 - 2; i >= 0; i--) {
                if (number[i] != number[5 - 1]) {
                    secondHighest = number[i];
                    break;
                }
            }

            if (secondLowest == -1) {
                System.out.println("All elements are same. No second lowest.");
            } else {
                System.out.println("Second lowest number: " + secondLowest);
            }

            if (secondHighest == -1) {
                System.out.println("All elements are same. No second highest.");
            } else {
                System.out.println("Second highest number: " + secondHighest);
            }
        }

        System.out.println("sorted array:");
        for(int num : number){
            System.out.println(num+" ");
        }
        
}

}
