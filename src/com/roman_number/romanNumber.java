package com.roman_number;

import java.util.Scanner;

public class romanNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = sc.nextLine();
        
        int integer = romanToInteger(romanNumeral);
        System.out.println("The integer value is: " + integer);
    }

    public static int romanToInteger(String s) {
        int result = 0;
        int preValue = 0;

        int i=s.length();
        while(i!=0)
        {
          i--;
          char num1=s.charAt(i);
          int value =getValue(num1);
          if(preValue<=value)
          {
        	  result+=value;
          }
          else {
        	  result-=value;
          }
          preValue=value;
        }
        
		return result;
    }

    public static int getValue(char numl) {
        switch (numl) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
