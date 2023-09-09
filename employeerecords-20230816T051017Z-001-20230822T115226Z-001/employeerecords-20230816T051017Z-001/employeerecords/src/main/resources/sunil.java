

import java.util.HashMap;
import java.util.Map;

class employee{
	int id;
	public employee(int id) {
		this.id=id;
	}
}
public class sunil {

	public static void main(String[] args) {
		employee emp1 = new employee(1);
		employee emp2 = new employee(1);

		Map<employee, String> map = new HashMap<employee, String>();
		map.put(emp1, "Jack");
		map.put(emp2, "Jack");
		
		System.out.println(map.size());
   }
}
