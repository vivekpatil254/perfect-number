package com.bridgelabz;
import java.util.Scanner;

public class Perfect_Number {
    public static void main(String[] args) {
        int sum=0,number,i;
        System.out.println("Enter the Number : ");
        Scanner scanner=new Scanner(System.in);
        number=scanner.nextInt();
        for(i=1;i<number;i++)
        {
            if(number%i==0)
            {
                sum=sum+i;

            }


        }
            if(sum==number)
                System.out.print("Entered number is a perfect number");
            else
                System.out.print("Entered number is not a perfect number");

    }
}





