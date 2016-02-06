
public class SrtCrt {
	String s;
	String c;	


	static String srt(String s){
		double sd=Double.parseDouble(s);
		double srt_val=Math.sqrt(sd);
		String op="Square root of "+sd+" is "+srt_val;
		return op;
	}

	static String crt(String c){
		double cd=Double.parseDouble(c);
		double crt_val=Math.cbrt(cd);
		String op="Cube root of "+cd+ " is "+crt_val;
		return op;
		
	}

	public static void main(String[] args)
	{
//		System.out.println("Hello World!");
		SrtCrt obj_sc=new SrtCrt();
		//obj_sc.s="100.0";
		String s="100.0";
		System.out.println(srt(s));
		
		String c="8.0";
		System.out.println(crt(c));
		
	}

}

/*
class SrtCrt{
	public static void main(String[] args){
		
		double sd=100.0;
		double srt_val=Math.sqrt(sd);
		System.out.println("Square root of "+sd+ "is "+srt_val);
		
		
		double cd=625.00;
		double crt_val=Math.sqrt(cd);
		System.out.println("Cube root of "+cd+ "is "+crt_val);
			
		
	}
}*/