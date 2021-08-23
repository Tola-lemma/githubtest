/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tola Lemma
 */ class CountStudent {
    
    public static void main(String s[])
    {
        Student st1 = new Student("Rajesh", 34, 'A');
        Student st2 = new Student("Mahesh", 78, 'B');
        System.out.println("Number of students after st1, st2 : " + Student.count);
        Student st3 = new Student("Suresh", 65, 'A');
        System.out.println("Number of students after st3: " + Student.count);
        Student st4 = createStudent();
        System.out.println("Number of students after st4: " + Student.count);
        System.out.println("Print count using objects : " + st1.count + " " + st2.count + " " + st3.count + " " + st4.count);
    }
    
    public static Student createStudent()
    {
        return new Student("Akhilesh", 59, 'C');
    }
 }

class Student
{
    // Static variable
     static int count = 0; // LINE A       
	 //if static keyword is deleted non-static variable count cannot be referenced from a static context

    // Member variables
    String name;
    int marks;
    char section;

    Student(String name, int marks, char section)
    {
        this.name = name;
        this.marks = marks;
        this.section = section;
        // Increment the static variable
        count++; // LINE B
    }   
}
/**
* DESCRIPTION
 * Here we have a defined a Student class with member variables name, marks and section.
 * We also included a static or class variable called count at LINE A and 
 * incremented it in the constructor at LINE B.
 * Since the constructor is called when ever a new Student is created,
 * we can effectively keep track on the number of students using the static variable count.
 * Also note that the static variables can be accessed using the object variables like st1, st2 
 * or using the class name Student. Either way, 
 * it points to the same class variable.
*/