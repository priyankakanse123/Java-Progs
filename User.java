package com.bridgelabz.programs;
import java.util.Scanner;
import com.bridgelabz.util.Utility;
class User
{
public static void main(String args[])
			{
				String string="Hello username how are you",username;
				Scanner sc=new Scanner(System.in);
  
				Utility u=new Utility();

				System.out.println(" Enter the Username:");
				String string1=sc.next();
				//Checks the length of the String
				if(string1.length()>=3)
					{
					//if check length returns true
					//Call replaceusername
					username= string.replace("username",string1);
					System.out.println(username);  
 
					}
				else
					{
						System.out.println("UserName should contain More than 3 Character");
					}
			}
	}

	
