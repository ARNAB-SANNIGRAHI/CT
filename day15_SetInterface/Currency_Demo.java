package day15_SetInterface;
import java.util.Currency;

public class Currency_Demo {
	public static void main(String[] args) {
		Currency currency = Currency.getInstance("USD");
		System.out.println("Currency Code: "+currency.getCurrencyCode());
		System.out.println("Currency Symbol:" +currency.getSymbol());
		System.out.println("Currency name: "+currency.getDisplayName());;
		
		Currency currency2 = Currency.getInstance("INR");
		System.out.println("Currency Code: "+currency2.getCurrencyCode());
		System.out.println("Currency Symbol:" +currency2.getSymbol());
		System.out.println("Currency name: "+currency2.getDisplayName());;
	}

}
