//file :Utility.java
//Created by:Niraj
//Date:08/10/2016
//Purpose:Utility class for data input. 

package com.bridgelabz.util;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;


public class Utility
	{
		


	Scanner sc=new Scanner(System.in);
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


//take Input as Integer
public int inputInteger()
	{
		try
			{
				//reads the inputString
				return br.read();
			}
		catch(IOException e)
			{
				//prints exception if any exception
				System.out.println(e.getMessage());
			} 
		return 0;
	}

//take Input as word
public String inputString()
	{
		try
			{
				//reads the inputString
				return br.readLine();
			}
		catch(IOException e)
			{
				//prints exception if any exception
				System.out.println(e.getMessage());
			} 
		return"";
	}
public String readFile(File file){
	
	try{
		br = new BufferedReader(new FileReader(file));
		return br.readLine();
	}
	catch(Exception e){
		System.out.println(e);
	}
	return "";
}

public void clearFile(File f){
	try{
		String s = this.readFile(f);
		BufferedWriter wr = new BufferedWriter(new FileWriter(f));
		wr.write(" ");
		wr.close();
	}
	catch(Exception e){
		System.out.println(e);
	}
}

public void writeFile(File file,String data){
	try{
		String string = this.readFile(file);
		string = string.trim();
		BufferedWriter wr = new BufferedWriter(new FileWriter(file));
		wr.write(string+" "+data);
		wr.close();
	}
	catch(Exception e){
		System.out.println(e);
	}
}
}
 
       



