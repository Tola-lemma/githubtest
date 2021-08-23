class Student{  
 int rollno;  
 String name;  
 String city;  
  
 Student(int rollno, String name, String city){  
 this.rollno=rollno;  
 this.name=name;  
 this.city=city;  
 }  
 //overriding the toString() method
 public String toString(){
	 return rollno+" "+name+" "+city;
 }
  
 public static void main(String args[]){  
   Student s1=new Student(101,"Tola","Bshoftu");  
   Student s2=new Student(102,"Tadesse","Lalibela");  
      /**
         * below print the  hashcode of the value
         * System.out.println(cons); is the same as 
         * System.out.println(cons.toString());
         * both print the hashcode of the value
         * to print the value of the object we must overriding the toString() method 
		 * line 12 to 14
		 */
   System.out.println(s1);//compiler writes here s1.toString()  
   System.out.println(s2);//compiler writes here s2.toString()  
 }  
}  