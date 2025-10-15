/*
Q1. Write a program to create class name as Cube with two methods
void setValue(int x): this function accept number as parameter
int getCube(): this function can calculate a cube of a number and return it.
*/

import java.util.*;
public class Cube{
	public static void main(String x[])
	{
		new Cube().setValue(10);
		
	}
	static int y;
	static void setValue(int x)
	{
		y = x;
		new Cube().getCube();
	}
	 static void getCube(){
		System.out.println("cube is : "+(y * y * y));
	 }
}