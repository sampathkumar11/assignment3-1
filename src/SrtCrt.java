// getting errors static reference with non static
public class SrtCrt {
	String s;
	String c;	


	void srt(String s){
		double sd=Double.parseDouble(s);
		double srt_val=Math.sqrt(sd);
		System.out.println("Square root of "+s+ "is "+srt_val);
		
	}

	void crt(String c){
		double cd=Double.parseDouble(c);
		double crt_val=Math.sqrt(cd);
		System.out.println("Cube root of "+c+ "is "+crt_val);
		
	}

	public static void main(String[] args)
	{
//		System.out.println("Hellow World!");
		SrtCrt obj_sc=new SrtCrt();
		//obj_sc.s="100.0";
		String s="100.0";
		srt(s);
		
		String c="125.0";
		crt(c);
		
	}

}
