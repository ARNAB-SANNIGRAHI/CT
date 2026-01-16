package Polymorphism;

public class MapV3 extends MapV2 {
	public void bookCab() {
		System.out.println("Rapido Cab is booked");
	}
	public static void main(String[] args) {
		MapV1 m1 = new MapV3();//UC
		m1.route();
		System.out.println("----------------");
		MapV2 m2 = (MapV2) m1;//Note
		m2.route();
		System.out.println("----------------");
		MapV3 m3 = (MapV3) m1;//DC
		m3.route();
		m3.bookCab();
	}
}
