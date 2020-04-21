package homeWork2;

public class Pizza {
	String address ;
	int order;
	public double price = 10.5;
	
	public Pizza () {  // default constructor
		
	}
	
	public Pizza(String address) {// constructor with parameters
	this.address=address;		
	System.out.println("the pizza place is in "+ address);
		}
	public Pizza (int order, double price) {
	this.order=order;
	this.price=price;
	}
	public double getTotalPrice() {
	
	double total=order*price;
	return total;
	
		
	}
	
	
	
	

}



