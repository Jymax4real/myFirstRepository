package duke.choice;

public class ArrayRef {

	public static void main(String[] args) {

		Customer adfunnel1 = new Customer();
		Customer[] cu1 = new Customer[7]; ;
		
		Customer x = adfunnel1 ;// variable x references to the same object referenced by its value.
		x.age = 20;
		
		cu1[0] = adfunnel1 ;
		
		System.out.println(x.age);
		
		
	}

}
