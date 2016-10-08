package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;


public class Harmonic
		{
	public static void main(String[] args)
	{
		int N,i;
			float value=0;
     Utility u = new Utility();
    System.out.println("Enter the Value");
     N = u.inputInteger();
  // Condition to check number value
   if(N ==0){
		System.out.println("Value of N must not be zero");
      }
    else{   
          //Assigning the value
        for(i=1;i<=N;i++)
        value = value +(1/i);
}
System.out.println("Entered value is " + value);
}
}
