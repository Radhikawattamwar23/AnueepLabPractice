package pack1.com;
import java.time.Month;

public class MonthDays {

	    public static void main(String[] args) {
	        // Get all months
	        Month[] months = Month.values();
	        
	        // Iterate through each month
	        for (Month month : months) {
	            // Print the name of the month
	            System.out.print(month + ": ");
	            
	            // Print the total number of days in the month
	            switch (month) {
	                case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER:
	                    System.out.println("31 days");
	                    break;
	                case APRIL, JUNE, SEPTEMBER, NOVEMBER:
	                    System.out.println("30 days");
	                    break;
	                case FEBRUARY:
	                    System.out.println("28 days (non-leap year)");
	                    break;
	            }
	        }
	    }
	}


