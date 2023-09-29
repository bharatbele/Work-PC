class ExplicitCasting
{
	public static void main(String[] args)
	{
		float a= 120.23f;
		byte b= (byte)a;
		System.out.println("Explicit Casting from float to byte: "+b);
		
		//Explicit from int to char
		
		int d = 65;
		char e = (char)d;
		
		System.out.println("Explicit Casting from int to char: " +e);
	}
}