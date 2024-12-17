package Manager;

public class Main {

	public static void main(String[] args) {
		        Employee emp = new Employee("John Doe", 50.000);
		        Manager mgr = new Manager("Jane Smith", 75000, "Sales", "5000");

		        System.out.println(emp.toString()); // Εμφανίζει τα στοιχεία του υπαλλήλου
		        System.out.println(mgr.toString()); // Εμφανίζει τα στοιχεία του διευθυντή
		    }

	}


