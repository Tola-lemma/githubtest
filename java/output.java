class output {
        public static void main(String args[]) 
        {
			
			/*  float fx=26.98; 
			compiler assume it is double data type so compiler Error. 
			"possible lossy conversion from double to float"
            must  be declared as  float fx=26.98F; 
			or cast to float type float fx=(float) 26.98;  */
			
			int n=13;
			if(n%2==0)	
			System.out.println("Even number");
			
			else
				System.out.println("Odd number");
			double x=9/2;
			System.out.println("promotion in java  "+x);
            double a, b,c;
            a = 3.0/0;
            b = 0/4.0;
            c=0/0.0;
 
	        System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } 
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	*output will be 
	 *    Infinity
     *    0.0
     *    NaN
	 */
	 
	 
	 