package abu;

import java.io.IOException;
import java.util.Scanner;

public class comp 
{
	public static void main(String[] args) throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice:");
		String ch = sc.nextLine();
		System.out.println("Enter the URL:");
		String url1 = sc.nextLine();
	
		String res2= syed.browserCall(ch,url1);
		System.out.println(res2);
		
		System.out.println(syed.closeApp());
	}
}

