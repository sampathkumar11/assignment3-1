import java.util.Scanner;

public class SrtCrt {
	String s;
	String c;	


	static String srt(Double sd){
		//double sd=Double.parseDouble(s);
		double srt_val=Math.sqrt(sd);
		String op="Square root of "+sd+" is "+srt_val;
		return op;
	}

	static String crt(Double cd){
		//double cd=Double.parseDouble(c);
		double crt_val=Math.cbrt(cd);
		String op="Cube root of "+cd+ " is "+crt_val;
		return op;
		
	}

	public static void main(String[] args)
	{
		System.out.println("Enter the number whose square root has to be found :");
		//SrtCrt obj_sc=new SrtCrt();
		Scanner scnr = new Scanner(System.in);
		//obj_sc.s="100.0";
		//String s="100.0";
		Double s=scnr.nextDouble();
		System.out.println(srt(s));
		
		//String c="8.0";
		
		System.out.println("Enter the number whose Cube root has to be found :");
		Double c=scnr.nextDouble();
		
		System.out.println(crt(c));
		scnr.close();
		
	}

}