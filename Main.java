import java.io.*;
import java.util.Scanner;

public class Main {

        // sorting the array through bubble sort
    public static void sortArray(int[] number){

        for(int i=0 ; i< number.length-1 ; i++){
             boolean swapped = false;
            for(int j=0 ; j< number.length-1 ; j++){
                if(number[j] > number[j+1]){
                int temp = number[j];
                number[j] = number[j+1];
                number[j+1] = temp;
                swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // taking input from the user and storing in the array

        System.out.println("enter 5 numbers in array");

        int[] number = new int[5];
        for(int i=0 ; i<5 ; i++){
            number[i] = sc.nextInt();
        }
        System.out.println("number stored in array are");

        for(int i=0 ; i<5 ; i++){
            System.out.println(number[i]);
        }

        System.out.println("sorted array:");
        for(int num : number){
            System.out.println(num+" ");
        }
        
}

}
