package interface_codes;

public interface Mobile {
void color();
void sound();
}
class Samsung implements Mobile{

	@Override
	public void color() {
		System.out.println("Black");
		
	}

	@Override
	public void sound() {
		System.out.println("Samsung ringtone");
		
	}
	
}
class Apple implements Mobile{

	@Override
	public void color() {
		System.out.println("White");
		
	}

	@Override
	public void sound() {
		System.out.println("Apple ringtone");
		
	}
	
}
class Moto implements Mobile{

	@Override
	public void color() {
		System.out.println("Green");
		
	}

	@Override
	public void sound() {
		System.out.println("Moto ringtone");
		
	}
	
}
class MobileHelper{
	public static void useMobile(Mobile m){
		m.color();
		m.sound();
		
	}
}