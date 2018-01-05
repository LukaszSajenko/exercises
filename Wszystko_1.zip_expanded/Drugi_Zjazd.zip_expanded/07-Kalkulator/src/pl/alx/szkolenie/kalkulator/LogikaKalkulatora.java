package pl.alx.szkolenie.kalkulator;

public class LogikaKalkulatora {

	public static double oblicz(String dzialanie, double arg1, double arg2) {
		switch(dzialanie) {
		case "+" : return arg1 + arg2;
		case "-" : return arg1 - arg2;
		case "*" : return arg1 * arg2;
		case "/" : return arg1 / arg2;
		case "mod" : return arg1 % arg2;
		case "^" : return Math.pow(arg1, arg2);
		case "min" : return Math.min(arg1, arg2);
		case "max" : return Math.max(arg1, arg2);
		default : return 0;
				
		}
	}

}
