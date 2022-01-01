package duke.choice;

public class Clothing {
	
	String size;
	 double price;
	public String description;
	private final double MIN_PRICE = 1.0;
	private final double TAX = .2;
	
	
	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public double getPrice() {
		return  price + (price*TAX); //or
		// return price = price * (1 + TAX);
	}// OR ;  



	public double getMIN_PRICE() {
		return MIN_PRICE;
	}



	public double getTAX() {
		return TAX;
	}



	public void setSize(String newSize) {
		
		size = newSize;
	}
	
	
	
	public boolean fit(Customer newCustomer) {//checks if the size of a chosen item
		//(i.e using an object instantiation from the Clothing class); 'items[<insert index number>].fit(<insert argument>' )
		//matches with a customer's size by inserting an 
		//instantiation of an object from the customer class as argument within the 'fit()' method parameters.
		
		return size.equals(newCustomer.size);
		
	}
	
	
	
	public void setPrice(double newPrice) {//sets price of item
		
		price = (newPrice > MIN_PRICE)? newPrice : MIN_PRICE;
		
	}
	
	public void measure (int value) {
		
		size = (value < 6)? "M":"L";		
	}
	
	public String getSize() {// returns size of an item inherited from the Clothing class
		return size;
	}
	

}
	
