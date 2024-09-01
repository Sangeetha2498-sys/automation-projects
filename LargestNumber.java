package sample;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a,b,c;
      
      Scanner first=new Scanner(System.in);
      System.out.println("enter the first number");
      a=first.nextInt();
      
      Scanner second=new Scanner(System.in);
      System.out.println("enter the second number");
      b=second.nextInt();
      
      Scanner third=new Scanner(System.in);
      System.out.println("enter th third number");
      c=third.nextInt();
      
      if(a>b && a>c) {
    	  System.out.println("a is the largest number");
      }
      else if (b>a && b>c){
    	  System.out.println("b is the lagest number");
      }
      else{
    	  System.out.println("c is the larget number");
      }
      
	}

}
