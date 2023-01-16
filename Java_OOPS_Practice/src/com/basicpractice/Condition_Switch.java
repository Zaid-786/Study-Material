package com.basicpractice;


//To write a program for Condition_Switch

public class Condition_Switch
{
public static void main(String[] args) 
{
	String day="sunday";						//first we defined a string variable day in this variable  we stored sunday then we passed day as a expression in switch statement
	
	switch(day)
	{
	case "monday":										//this is not match according expression
		System.out.println("today is monday....");
		break;
		
	case "tuesday":										//this is not match according expression
		System.out.println("today is tuesday...");
		break;
		
	case "sunday":										//this is matched according expression and prints result today is a sunday
		System.out.println("today is sunday...");
		break;
			
		default:											//this is optional case if your expression is not any case then its show 
			System.out.println("day is invalid...");
			break;
		
	}
	
			
	}

}
