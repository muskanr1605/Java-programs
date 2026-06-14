//wajp to print day number of the week for eg sunday it is 1 and so on using switch case
class DayNumber{
	public static void main(String args[]){
		String inputDay ="Saturday";
// output should be 3		
          switch(inputDay){
			  case"Sunday":
			  System.out.println("Day number is 1");
			  break;
			   case"Monday":
			  System.out.println("Day number is 2");
			  break;
			   case"Tuesday":
			  System.out.println("Day number is 3");
			  break;
			   case"Wednesday":
			  System.out.println("Day number is 4");
			  break;
			   case"Thursday":
			  System.out.println("Day number is 5");
			  break;
			   case"Friday":
			  System.out.println("Day number is 6");
			  break;
			   case"Saturday":
			  System.out.println("Day number is 7");
			  break;
			  default:
			  System.out.println("INVALID");
		  }
	}
}