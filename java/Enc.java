class Enc{
	private int abc;
	private String name;
	public void setAbc(int abc){
		this.abc=abc;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getAbc(){
		return abc;
	} 
	public String getName(){
		return name;
	}
	public static void main(String[] args){
		Enc obj=new Enc();
		obj.setAbc(2825);
		obj.setName("Tola Lemma");
		System.out.println("name: "+obj.getName()+"\nID number:"+obj.getAbc());
		
	}
}