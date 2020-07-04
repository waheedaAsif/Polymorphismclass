package polymorphoismClass;

public class BMW extends Car {

	private int numerOfCylenders;
	private String engineModel;
	
	public BMW(String name, String model, int year, int numberOfDoors, int numberOfCylenders, String engineModel) {
		super(name, model, year, numberOfDoors);
		
		this.numerOfCylenders = numerOfCylenders;
		this.engineModel = engineModel;
	}
	public BMW() {
	}
	public String getModel() {
		return super.getModel() + " The model for BMW May be Avaliable";
	}
	
	
}
