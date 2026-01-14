package core_java;

public class HelpLaptop {

public static New_Laptop getLaptop() {
	
	return new New_Laptop(null, 0);
}
	public static New_Laptop VerifyPrice(double price, String brand) {
		if( price<10000 || price>500000) {
			System.out.println("Price of laptop is Invalid");
			return null;
		}
		return new New_Laptop(brand, price);
		}
	}