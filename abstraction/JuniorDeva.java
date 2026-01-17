package abstraction;

class JuniorDeva extends Deva {
	@Override
	public void goldloan() {
		System.out.println("JuniorDeva paid goldloan");
	}
	public void bike() {
		System.out.println("BMW");
	}
	public static void main(String[] args) {
		
		System.out.println("---Junior Deva---");
		JuniorDeva jd = new JuniorDeva();
		jd.homeloan();
		jd.goldloan();
		jd.bike();
		
		System.out.println("---Parent---");
		Parent p = new JuniorDeva();
		p.homeloan();
		p.goldloan();
	  //p.bike();  --> CompileTime Error
		
		System.out.println("---Deva---");
		Deva d = new JuniorDeva();
		d.homeloan();
		d.goldloan();
	  //d.bike(); --> CompileTime Error
	}

}
