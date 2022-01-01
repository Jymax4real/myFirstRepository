package duke.choice;

public class Customer {
	
	String shopName;
	String name;
	byte age;
	String size;
	int measurement;
	String favItem;
	
	
	
	 private Clothing[] cItems;
	
	
	
	public void addItems(Clothing[] customerItems) {//accepts 'Arrays' of type 'Clothing' as arguments.
		
		this.cItems = customerItems;}
		
	
	
	public Clothing[] getItems() {//returns an array of Type 'Clothing' given to the parameter of 'addItems'
	return cItems;
	}
	
	public double getTotalClothingCost(){//combines price of elements of cItems array and returns the Total Price.
double totalPrice = 0;
		
		for(int i = 0; i < 4; i++) {
			
		totalPrice = totalPrice + cItems[i].getPrice();	
			//System.out.println(cItems[i].getPrice());
		}	
		
		return totalPrice;
		
		
	}
	public int setSize(int measurement) {
		
		Customer c1 = new Customer();			
		Customer c2 = new Customer();			

		Customer[] customers = {c1,c2};
			
			
				
			switch(measurement) {
				
				case 1, 2, 3  :
					size = "S";
					break;
					
				case  4, 5, 6 :
					size = "M";
					break;
					
				case 7, 8, 9 :
					size = "M";
				break;
					
				default :
					size = "Size Not available";}//items[i].size = customers[i].size;
					
						
			return measurement;
		}
	
	public String setSize(String customerSize){
		
		this.size = customerSize;
		
		return size;
		
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public int getMeasurement() {
		return measurement;
	}

	public void setMeasurement(int measurement) {
		this.measurement = measurement;
	}

	public String getFavItem() {
		return favItem;
	}

	public void setFavItem(String favItem) {
		this.favItem = favItem;
	}

	public String getSize() {
		return size;
	}
	
	

	
	
	
	

}
