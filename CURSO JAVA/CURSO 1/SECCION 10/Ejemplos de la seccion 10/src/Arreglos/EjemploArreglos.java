package Arreglos;

import java.util.Iterator;

public class EjemploArreglos
{
public static void main(String[] args) 
{
	int array[] = new int[3];
	
	array[0]=25;
	array[1]=20;
	array[2]=30;
	
	for(int i=0;i<array.length;i++) 
	{
	System.out.println(array[i]);
	}
	
	for(int temp:array) 
	{
		System.out.println(temp);
	}

}
}
