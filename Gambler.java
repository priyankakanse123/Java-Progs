package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
import java.util.Scanner;

class Gambler{
 public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    System.out.println("enter stake");
    int stake=sc.nextInt();
    System.out.println("enter trails");
    int trails=sc.nextInt();
    System.out.println("enter goal");
    int goal=sc.nextInt();

    int wins=0;
    int bets=0;

    for (int i=0;i<trails;i++){

    int cash = stake;

    while(cash > 0 && cash < goal){
     bets++;
     if(Math.random()<0.5)
        cash++;
     else
       cash--;}
      if(cash==goal)
        wins++;
       }
      System.out.println("Wining With the points " + trails);
          }
       }
