package arrayList;

public class Phone {
 private String brand;
 private int price;
 private String colour;
 private float rating;
 private int editionYear;
 
public Phone(String brand, int price, String colour, float rating, int editionYear) {
	super();
	this.brand = brand;
	this.price = price;
	this.colour = colour;
	this.rating = rating;
	this.editionYear = editionYear;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public String getColour() {
	return colour;
}

public void setColour(String colour) {
	this.colour = colour;
}

public float getRating() {
	return rating;
}

public void setRating(float rating) {
	this.rating = rating;
}

public int getEditionYear() {
	return editionYear;
}

public void setEditionYear(int editionYear) {
	this.editionYear = editionYear;
}

@Override
public String toString() {
	return "Phone [brand=" + brand + ", price=" + price + ", colour=" + colour + ", rating=" + rating + ", editionYear="
			+ editionYear + "]";
}

 
 
 

}
