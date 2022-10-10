//Program to check pallindrome number 
//palindromic number is a number that remains the same when its digits are reversed.

import java.util.*;

class Main
{  
 public static void main(String args[])
  {  
  int r,rev=0,temp;    
  Scanner in = new Scanner(System.in); //creating scanner object
  System.out.print("Enter number: "); 
  int n = in.nextInt();  //taking input from user
  
  temp=n;    //making a copy of n to compare with rev
  while(n>0){    
   r=n%10;  //getting remainder  
   rev=(rev*10)+r;    
   n=n/10;    
  }    
  if(temp==rev) //checking if number is pallidrome or not
   System.out.println("palindrome number ");    
  else    
   System.out.println("not a palindrome number");    
}  
}  