package method_overridding;

public class bike extends vechile {
	void run(){
		System.out.println("Bike is running safely");
		}
	public static void main(String args[]){  
		  bike obj = new bike();
		  vechile r=new vechile();
		  r.run();
		  obj.run();

	}

}
