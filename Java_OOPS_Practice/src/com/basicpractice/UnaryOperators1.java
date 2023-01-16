package com.basicpractice;



//To write a program for UnaryOperators1

public class UnaryOperators1
{

public static void main(String[] args)
{
    int z = 10;
	
    System.out.println("value of z="+z);						  	//this is printing simple z values 10
    System.out.println("value of z post increment="+(z++));			//this is printing post increment z values 10 and values printed 10 but after printed is values 11
    System.out.println("value of z pre increment="+(++z));			//this is printing pre increment z values 12 because afer post increment its value 11 then pre increment means first increment them asign
    System.out.println("value of z ="+(z));							// this is z printing values afer pre increment is 12
    System.out.println("value of z post decrement ="+(z--));		//this is post decrement first asign then decrement means z value prnted 12 but is decrement
    System.out.println("value of z pre decrement="+(--z));			//this is pre decrement first decrement then asign now z values is 10


    

    
    
    
	}

}
