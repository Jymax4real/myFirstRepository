package duke.choice;

public class ShopApp {

	public static void main(String[] args) {

		
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		
		Customer[] customers = {c1,c2};	
		
		c1.name = "Brain";
		c1.setSize(3);
		c1.age = 20;
		c1.shopName = "SuperDry Store";
		
		
		c2.name = "Pinky";
		c2.measurement = 7;
		c2.size = "M";
		c2.age = 23;
		c2.shopName = "Nike Shop";
		
		Clothing[] items = new Clothing[10];
		
		
		 items[0] = new Clothing();
		 items[1] = new Clothing();
		 items[2] = new Clothing();
		 items[3] = new Clothing();
		 
		 
		items[0].setPrice(189);		
		items[0].setSize("L");
		items[0].setDescription("Superdry Coat");
		c1.favItem = items[1].description;
		
	    
		items[1].setDescription("Nike Shirt");
		items[1].setPrice(35);	
		items[1].setSize("M");
	    c2.favItem = items[2].description;
	    
	    
	    items[2].setDescription("Versace Tracksuit");
	    items[2].setPrice(180);	
	    items[2].setSize("M");;
	    
	    items[3].setDescription("White Real hoodie");
	    items[3].setPrice(89);
	    items[3].setSize("M");;	
	    
	   
	    //The below array symbolizes a different shop / wardrobe.
	    Clothing[] cloth = {items[0], items[1], items[2], items[3]};
	    
	    
	    cloth[0].setDescription("White Air Forces");
	    cloth[0].setPrice(85);
	    cloth[0].setSize("8.5");
	    
	    cloth[1].setDescription("White PSG coat");
	    cloth[1].setPrice(135);
	    cloth[1].setSize("M");
	    
	    cloth[2].setDescription("PSG tracksuit");
	    cloth[2].setPrice(125);
	    cloth[2].setSize("M");
	    
	    cloth[3].setDescription("Jeans");
	    cloth[3].setPrice(110);
	    cloth[3].setSize("M");
	    
	    c1.favItem = cloth[0].description ; 
	    c2.favItem = cloth[1].description;
	    
	    
	    
	    
	    
	    
	    
	  
	    
				
		
	
					
		//c1.setSize("M");
		System.out.println(items[1].fit(c1));//checks the size of an of an item in the 
		                                    //Clothing array and checks if it matches with a customers size
		
		
		
			for(Customer customer : customers) {
				
		System.out.println("welcome to " + customer.shopName + ", customer name is " + customer.name + "," + " age is " + customer.age + "," + " size is " + customer.getSize());
		System.out.println(customer.name + "'s" + " favorite item is " + customer.favItem + "," );
		}
		
		
		
			
			for( int i = 0; i < 4; i++) {//this code prints out the price for the items that customers chose to buy.
			
			
		System.out.println("Price for " + items[i].description + " is " + items[i].getPrice());// still have to figure out how I found this solution haha!
			
			}
		

	

			
		//System.out.println("welcome to " + c2.shopName + "," + "customer name is " + c2.name + "," +  " age is " + c2.age + "," + " size is " + c2.size);
		//System.out.println(c2.name + "'s" + " favorite item is a " + c2.favItem + ","+ " " + item2.price + ", " + item2.size);

		for(int i=0; i <2; i++) {
			
			if(customers[i].age<18) {
				
				System.out.println(customers[i].name + " is not allowed to shop ");
		}   else {System.out.println(customers[i].name + " is old enough to shop ");}
		
			}
			
		
		//System.out.println("total price is: " + c1.getTotalClothingCost());
					
		int x = 1;	
		customers[x].addItems(cloth);
		System.out.println( "Total cost for " + customers[x].name + " is: " + customers[x].getTotalClothingCost());
		
		
		System.out.println();

}}
