package currencyConvertor;
import java.util.HashMap;
import java.util.Scanner;

public class CurrencyConvertor {
	private static final HashMap<String,Double>
	exchangeRates = new HashMap<>();
	static {
		exchangeRates.put("USD", 1.0);
		exchangeRates.put("EUR", 0.85);
		exchangeRates.put("GBP", 0.73);
		exchangeRates.put("USD", 109.78);
		//Add more rates as needed
	}
	public static void main (String[]args) {
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Welcome to Currency Convertor");
		System.out.println("USD , EUR , GBP , JPY");
		System.out.println("Enter amount");
		double amount = scanner.nextDouble();
		
		System.out.println("Enter the Currency you want to convert from ");
		String fromCurrency=scanner.next().toUpperCase();
		System.out.println("Enter the Currency you want to convert to");
		String toCurrency = scanner.next().toUpperCase();
		
		double convertedAmount = convertCurrency(amount,fromCurrency,toCurrency);
		System.out.println(amount +" "+fromCurrency + "=" + convertedAmount + " " + toCurrency);
 	}
	private static double convertCurrency(double amount,String fromCurrency, String toCurrency) {
		if(!exchangeRates.containsKey(fromCurrency) || !exchangeRates.containsKey(toCurrency)) {
			System.out.println("Invalid currencies");
			return 0.0;
		}
		double fromRate = exchangeRates.get(fromCurrency);
		double toRate = exchangeRates.get(toCurrency);
		
		
		double amountInUSD =amount/ fromRate;
		return amountInUSD * toRate;
		
		
	}

	}


