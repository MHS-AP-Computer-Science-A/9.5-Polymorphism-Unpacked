

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>();
        
        list.add(new HourlyEmployee("Molly", "Cook", 11.25));
        list.add(new HourlyEmployee("Dave", "Server", 9.25));
        list.add(new HourlyEmployee("Tegan", "Server", 9.25));
        list.add(new SalariedEmployee("Lilly", "Manager", 32000));
        list.add(new SalariedEmployee("Anna", "Owner", 56000));
        
           
        //Note that output will be 0 for hourly employees unless you add hours
        for(Employee e : list) {
            System.out.println(e.getPayCheck());
        }

	}

}
