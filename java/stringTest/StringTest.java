class StringTest{
	public static void main(String args[]){
		String name = "Kebede";
		System.out.println(name);
		name =  name + "Tollosa";
		System.out.println(name);
		
		char ch[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
        String s = new String(ch, 3, 3);// offset 3, count 3,lengh 6,
		System.out.println(s);

	}
}
