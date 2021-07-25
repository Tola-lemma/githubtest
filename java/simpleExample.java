// Java variable example @adding lower type
class simpleExample
{
	public static void main(String[] args)
	{
		byte a=10;
		byte b=10;
		    /**
		*  byte c=a+b;
		*  Compile time error 
		*  Because adding a+b=20 will be int ;
	
         * @author Tola Lemma
                      */
		
		byte c=(byte)(a+b);
		System.out.println(c);
	}
}