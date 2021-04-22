

public class Employee {
    private String name;
	private String title;
	private double payrate;
	
	//POST: calls superclass constructor and initialized title and payrate
	//      instance variables
	public Employee(String name, String title, double payrate) {
        this.name = name;
		this.title = title;
		this.payrate = payrate;
	}
	
	//POST: returns the Employee's payrate
	public String getPayCheck() {
		return "" + payrate;
	}
	
	public double getPayrate(){
	    return payrate;
	}
	
	public String getName(){
	    return name;
	}
}
