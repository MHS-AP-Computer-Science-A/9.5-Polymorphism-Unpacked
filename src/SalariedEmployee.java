

public class SalariedEmployee extends Employee {
	private int payPeriods;

	public SalariedEmployee(String name, String title, double payrate) {
		super(name, title, payrate);
		payPeriods = 26;
	}
	
	//POST: sets payPeriods to p
	public void setPayPeriods(int p) {
		payPeriods = p;
	}
	
	//POST: Computes and returns pay which is the payrate
	//      divided by 26
	@Override
	public String getPayCheck() {
		return getName() + " $" + getPayrate() / 26;	
	}
	
	
}
