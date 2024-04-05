package linkedList;

public class Car {
	private String brand;
	private String model;
	private String design;
	private int price;
	public Car(String brand, String model, String design, int price) {
		super();
		this.brand = brand;
		this.model = model;
		this.design = design;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", design=" + design + ", price=" + price + "]";
	}
	
	

}
