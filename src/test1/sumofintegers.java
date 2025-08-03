package test1;
import java.util.Scanner;

public class sumofintegers {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String n = "SELE87NIU9M" ;
		int lenght = n.length();
		char b;
		int sum = 0;
		
		for (int i=0;i<lenght;i++)
		{
		
			 b = n.charAt(i);
			try {
				sum += Integer.parseInt(Character.toString(b));
			} catch (Exception e) {}
			
		}
		System.out.println(sum);
			
	}
	
	public void subbranch1() {
		System.out.println("git practice for sub branch 1");
		// TODO Auto-generated method stub

	}
	public void subbranch2() {
		
		System.out.println("sub branch 2 code ");
		// TODO Auto-generated method stub

	}

}
