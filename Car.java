package hashMap;

public class Car {
	private String brand;
	private int price;
	private  String colour;
	private String Noplate;
	private boolean isAirbag;
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
	public String getNoplate() {
		return Noplate;
	}
	public void setNoplate(String noplate) {
		Noplate = noplate;
	}
	public boolean isAirbag() {
		return isAirbag;
	}
	public void setAirbag(boolean isAirbag) {
		this.isAirbag = isAirbag;
	}
	public Car(String brand,int price,String colour,String Noplate,boolean isAirbag) {
		this.brand=brand;
		this.price=price;
		this.colour=colour;
		this.Noplate=Noplate;
		this.isAirbag=isAirbag;
	}
	public String toString() {
		return "Brand="+brand+", "+"Price="+price+", "+"Colour="+colour+", "+"Noplate="+Noplate+", "+"IsAigBag="+isAirbag;
				
	}


}
