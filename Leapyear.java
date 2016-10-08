package com.bridgelabz.programs;
import  com.bridgelabz.util.Utility;

public class Leapyear
{
 public static void main(String[] args){
 int year=0;
   Utility u = new Utility();
   System.out.println("Please Enter the Year");
   year = u.inputInteger();
	System.out.println("Entered year is: "+year);
	

   if(year%4==0 && year%100!=0 || year%400==0){
         System.out.println(year+" Is a Leap year");
     }
   else {
         System.out.println(year+"  Sorry its not a Leap year");
     }
   }
}
