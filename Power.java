package com.bridgelabz.programs;
public class Power
     {

   public static void main(String[] args)


{       int power = Integer.parseInt(args[0]);
       int data = 1;
            if (power>=0 & power<31){
                // calculating for given value 
            for(int i=0 ; i<=power ; i++)
           {
                System.out.println("2^"+i+"="+data);
             data = data*2;
           }
       }
                // Printing the value 
            else {
                System.out.println("Enter num less than 31");
            }
           }
         }

