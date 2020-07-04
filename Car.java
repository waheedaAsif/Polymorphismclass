package polymorphoismClass;

public class Car {

	
	private String name;
	private String model;
	private int year;
	private int numberOfDoors;
	
	
	
	//Setters
	
	public void setName(String name) {
		this.name = name;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	
	//getter
	public String getName() {
		return name;
	}
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	public Car(String name, String model, int year,int numberofDoors ) {
		this.name = name;
		this.model = model;
		this.year = year;
		this.numberOfDoors = numberOfDoors;
	}
	public Car() {
		this.name = "";
		this.model = "";
		this.year = 0;
		this.numberOfDoors = 0;
	}
		
}

