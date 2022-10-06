/*
Write a Program to determine if the given number is Armstrong number or not. Print true if number is armstrong, otherwise print false.
An Armstrong number is a number (with digits n) such that the sum of its digits raised to nth power is equal to the number itself.
For example,
371, as 3^3 + 7^3 + 1^3 = 371
1634, as 1^4 + 6^4 + 3^4 + 4^4 = 1634
Input Format :
Integer n
Output Format :
true or false
Sample Input 1 :
1
Sample Output 1 :
true
Sample Input 2 :
103
Sample Output 2 :
false
*/

import java.util.Scanner;
import java.lang.Math;
public class Main {
	
		static boolean isArmstrong(int n){   
    int temp, digits=0, last=0, sum=0;     
    temp=n;   
    while(temp>0)    
    {   
    temp = temp/10;   
    digits++;   
    }   
    temp = n;   
    while(temp>0)   
    {         
    last = temp % 10;     
    sum +=  (Math.pow(last, digits));      
    temp = temp/10;   
    }    
    if(n==sum)     
    return true;        
    else return false;   
    } 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(isArmstrong(n)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

	}
}
