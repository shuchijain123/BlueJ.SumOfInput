/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please input your number");
        int number = in.nextInt();
        int sum=0;
        
        for(int i=1;i<=number;i++){
        
         sum = sum+i;
         
         
        

    }
    System.out.println("Total Sum till Number is " + sum);
}
    
}
