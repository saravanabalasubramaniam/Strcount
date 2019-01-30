import java.util.*;
import java.io.*;
class Strcount
	{
     	public static void main(String args[])
		{
     		 String a;
      		 int count=0;
     		 Scanner input=new Scanner(System.in);
		System.out.println("enter the input");
      		a=input.nextLine();
     		String d[]=a.split("\\s+");
     		for(int i=0;i<d.length;i++)
			{
         		count++;
     			}
      		System.out.println(count);
      		}      
	}
