package interfaceeg;

public class maintest {
	public static void main(String[] args){  
		Bank d=new SBI();
		Bank r=new bob();
		System.out.println("ROI of SBI: "+d.rateOfInterest());
		System.out.println("ROI of BOB: "+r.rateOfInterest()); 
		}
}
