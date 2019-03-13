package design;

import java.util.Scanner;

public class EmployeeInfo extends Departments implements Employee {

	/*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
	 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
	 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
	 * go to FortuneEmployee class to apply all the fields and attributes.
	 *
	 * Important: YOU MUST USE the
	 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
	 * Use all kind of keywords(super,this,static,final........)
	 * Implement Nested class.
	 * Use Exception Handling.
	 *
	 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	private static String nameOfCompany;
	static double monthIncome;
	private String empName;
	private int empID, empAge;
	public int yearsWorked;


	public static String getCompanyName() {
		return nameOfCompany;
	}
	public static void setCompanyName(String companyName) {
		EmployeeInfo.nameOfCompany = companyName;
	}

	public int getEmployeeID() {
		return empID;
	}
	public void setEmployeeID(int empID) {
		this.empID = empID;
	}

	public String getEmployeeName() {
		return empName;
	}
	public void setEmployeeName(String empName) {
		this.empName = empName;
	}

	public EmployeeInfo(int empID){
		this.empID = empID;

	}

	public EmployeeInfo(String empName, int empID){
		this.empName = empName;
		this.empID = empID;

	}

	public EmployeeInfo(String empName, int empID, int empAge) {
		this.empName = empName;
		this.empID = empID;
		this.empAge = empAge;

	}

	public void assignDepartment() {
		Scanner s = new Scanner(System.in);
		System.out.println("Department name: ");
		String department = s.nextLine();
		if (empName==null){
			System.out.println("Your name: ");
			String userName = s.nextLine();
			System.out.println(userName + " registered to " + department);
			this.empName = userName;
		} else{
			System.out.println(empName + " registered to " + department);}

	}

	public double calculateSalary() {
		Scanner s = new Scanner(System.in);
		System.out.println();
		System.out.println("What is the monthly salary? ");
		double monthly = s.nextInt();
		this.monthIncome = monthly;
		return monthly;
	}

	public int yearsWithCompany(){
		int total = 0;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Start date: ");
		String joiningDate = sc.nextLine();
		System.out.println("Current date: ");
		String xDate = sc.nextLine();

		String x = DateConversion.convertDate(joiningDate);
		String y = DateConversion.convertDate(xDate);

		String yearStarted = x.substring(x.length()-4);
		String currentYear = y.substring(y.length()-4);

		int start = Integer.parseInt(yearStarted);
		int current = Integer.parseInt(currentYear);
		yearsWorked = current-start;

		return total;
	}

	public double calculateEmployeePension() {
		int value = 0;

		if (yearsWorked >= 5) {
			value = (int) (monthIncome* .25);
		} else if (yearsWorked == 4) {
			value = (int) (monthIncome * .20);
		} else if (yearsWorked == 3) {
			value = (int) (monthIncome * .15);
		} else if (yearsWorked == 2) {
			value = (int) (monthIncome * .10);
		} else if (yearsWorked == 1) {
			value = (int) (monthIncome * .05);
		} else if (yearsWorked == 0) {
			value = 0;
		}

		return value;
	}

	public double calculateEmployeeBonus(){
		double bonus = monthIncome;
		if (yearsWorked>=3 ){bonus = (int)monthIncome * 0.10;

		} else if (yearsWorked>=2 ){ bonus = (int)monthIncome * 0.08;

		}
		return bonus;
	}

	@Override
	public String employeeName() {
		return null;
	}

	@Override
	public int employeeId() {
		return 0;
	}

	@Override
	public void departments() {

	}

	@Override
	public void benefitLayout() {

	}

	private static class DateConversion {

		public DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}

}
