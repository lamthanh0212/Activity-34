package homework;

import java.util.Scanner;

public class Activity34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int socuoi= scanner.nextInt();
        int sum = 0 ;
        float avg ;
        for (int i = 1 ; i <= socuoi ; i=i+1 ){
            sum = sum +  i ;
        }
        System.out.println("The sum of 1 to " + socuoi + " is: " + sum );
        avg = sum / socuoi ;
        System.out.println("The average is: " + avg );
    }
}
