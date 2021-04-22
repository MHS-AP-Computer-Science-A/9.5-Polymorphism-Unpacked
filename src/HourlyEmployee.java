

public class HourlyEmployee extends Employee {
	//Instance variable to store hours
	private int hours;
	
	//Constructor method 
	//POST: superclass constructor called, hours is set to 0
	public HourlyEmployee(String name, String title, double payrate) {
		super(name, title, payrate);
		hours = 0;
	}
	
	//addHours method
	//POST: adds to the employees hours
	public void addHours(int h) {
		hours += h;
	}
	
	//POST: Computes and returns pay, sets hours back to 0
	@Override
	public String getPayCheck() {
		double pay = hours * getPayrate();
		hours = 0;
		return getName() + " $" + pay;
	}		

}