package methodPractice;

public class Rectangle {     // area rectangle = length * width
	
	
	
	public void getRectangleArea() {  // method without return type and parameters
		int length=45;                // hardcoded
		int width =15;
		int area = length*width;
		System.out.println("the first area is "+area+ " in New jersey");
	}
		
	public void getRectangleArea(int length,int width) {// method without return type with parameters
	
	
		int area = length*width;
		System.out.println("this is the second area "+area +" in New york");
		
	}
	public int getRecArea() {
		int length=35;                // hardcoded
		int width =10;
		int area = length*width;
		System.out.println("this is the theerd area "+area + " in DC");
		return area;
	}
	public int getRecArea(int length,int width) {
		int area = length*width;
		System.out.println("this is the forth area "+ area+" in florida");
		return area;
	}
	
	
	

}
