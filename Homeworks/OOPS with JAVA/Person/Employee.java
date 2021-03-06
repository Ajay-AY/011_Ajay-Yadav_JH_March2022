package Person;


public class Employee extends Person{
	double annualSalary;
	int year;
	String nationalInsuaranceNumber;
	
	Employee(String name,double annualSalary, int year, String nationalInsuaranceNumber ){
		super(name);
		this.annualSalary = annualSalary;
		this.year = year;
		this.nationalInsuaranceNumber = nationalInsuaranceNumber;
	}
	
	String getName(){
		return this.name;
	}
	
	double getAnnualSalary(){
		return this.annualSalary;
	}
	
	int getYear(){
		return this.year;
	}
	
	
	String getNationalInsuaranceNumber(){
		return this.nationalInsuaranceNumber;
	}
	
	
	
	void setAnnualSalary(double annualSalary){
		this.annualSalary = annualSalary;
	}
	
	void getYear(int year){
		this.year = year;
	}
	
	
	void getNationalInsuaranceNumber(String nationalInsuaranceNumber){
		this.nationalInsuaranceNumber = nationalInsuaranceNumber;
	}
	
	void printDetails(){
		System.out.println("Employee Name : "+this.name);
		System.out.println("Employee Annual Salary : "+this.annualSalary);
		System.out.println("Employee's Year of Joining  : "+this.year);
		System.out.println("Employee's National Insuarance Number : "+this.nationalInsuaranceNumber);
	}
}