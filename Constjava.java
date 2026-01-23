class Sample4{
	private int num1;
	private int num2;
	
	public Sample4() {
		System.out.println("inside default constructor");
		num1=50;
		num2=25;
	}
	
	public Sample4(int a, int b) {
		System.out.println("inside  constructor with parameters");
		num1=a;
		num2=b;
	}
	
	public Sample4(Sample4 obj) {
		System.out.println("inside  copy constructor ");
		this.num1=obj.num1;
		this.num2=obj.num2;
	}

	public void printData() {
		System.out.println("inside printData");
		int sum;
		sum = num1 + num2;
		System.out.println("Total is  :  " + sum);
	}
}

public class ConstructEg {

	public static void main(String[] args) {
		
		System.out.println("inside main");
		
		Sample4 ob1=new Sample4(30,50);
		Sample4 ob2=new Sample4();
		
		ob2.printData();
		ob1.printData();
		Sample4 ob3=new Sample4(ob1);
		ob3.printData();

	}

}
