package com.au.practiceProgram;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Programs {

	
	
	//Reverse String
	@Test 
	public void reverseString() {
		Programs p=new Programs();
		String input="Selenium";
		
		StringBuilder input1=new StringBuilder();
		
		input1.append(input);
		
		
		input1=input1.reverse();
		System.out.println(input1);
	}
	
	//second Largest number
	@Test
	public void secondLargest() {
		
		int temp, size;
		
		int arr[]= {45,32,11,25,98};
		size=arr.length;
		for(int i=0; i<size;i++) {
			for(int j=i+1; j<arr.length;j++) {
				
			
		if(arr[i]>arr[j]) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		
			}
	}
		System.out.println(arr[size-2]);

}
	
	//Extract vowels in a string
	@Test
	public void vowerlsExtract() {
		
		String input="Hello world";
		int size=input.length();
		for(int i=0; i<size;i++)
		
		if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u'){
			System.out.println(input.charAt(i));
		}
	}
	
	//Odd or Even
	@Test
	public void OddEven() {
		int i, sumO=0, sumE=0;
		
		int number[]=new int[7];
		for(i=0;i<7;i++) {
			if(i%2==1) {
				sumO=sumO+1;
			}else {
				sumE=sumE+1;
			}
		}
	System.out.println("Odd number" + sumO);
	System.out.println("Odd number" + sumE);
	
	}
	
	//Print * symbol pyramid
	@Test
	public void patteren_Print() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}
		System.out.println();
		}
	}
}






























