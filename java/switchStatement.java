import java.util.Scanner;
public class SwitchStatement{

public static void main(String[] args){
	
	int month;
	Scanner mon=new Scanner(System.in);
	System.out.println("Enter the number of month to know the name of that month ");
	month=mon.nextInt();
	String monthString=" ";// converthing string to int
	switch(month){
		case 1:monthString="1-september";
		 break;
		case 2:monthString="2-october";
		 break;
		case 3:monthString="3-november";
		 break;
		case 4:monthString="4-december";
		 break;
		case 5:monthString="5-january";
		 break;
		case 6:monthString="6-ferbruary";
		 break;
		case 7:monthString="7-march";
		 break;
		case 8:monthString="8-may";
		 break;
		case 9:monthString="9-april";
		 break;
		case 10:monthString="10-june";
		 break;
	    case 11:monthString="11-july";
		 break;
		case 12:monthString="12-August";
		 break;
		case 13:monthString="13-Phuagume";
		 break;
	default : System.out.println("Invalid month");
	}
	System.out.println(monthString);
}
}