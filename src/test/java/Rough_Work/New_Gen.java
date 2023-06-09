package Rough_Work;

public class New_Gen extends Generator {

	public static void main(String[] args) {

		Old_Gen gen1 = new Old_Gen();
		gen1.startMechanism();
		
		New_Gen gen2 = new New_Gen();
		gen2.startMechanism();
	}

	@Override
	public void startMechanism() {
	
System.out.println("New Generator Starts ");
		
	}



}
