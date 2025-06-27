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
        
}

}
