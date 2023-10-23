package com.shuffle;

import java.util.Random;

public class shuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []myArray= {1,2,3,4,5,6,7};
		
		suffleArray(myArray);
		for(int element :myArray)
		{
			System.out.print(element +" ");
		}
		

	}
	public static void suffleArray(int []array)
	{
	    Random random = new Random();
	   for(int i=array.length-1;i>=0;i--)
	   {
		   int index = random.nextInt(i + 1);
		   int temp=array[i];
		   
		   array[i]=array[index];
		   array[index]=temp;
	   }
	}

}
