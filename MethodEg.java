public class MethodEg {
	
	public static void display() {
		System.out.println("inside display");
	}
	
	
	public void disp() {
		System.out.println("inside disp");
	}

	
	public static void main(String[] args) {
		System.out.println("inside main");
		display();
		
		MethodEg o1 = new MethodEg();
		
		MethodEg o2;
		o2 = new MethodEg();
		
		o1.disp();
		o2.disp();
	}
	

}