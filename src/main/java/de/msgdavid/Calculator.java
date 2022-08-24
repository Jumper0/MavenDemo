package de.msgdavid;

public class Calculator {

	public Calculator() {

	}

	public static double add(double param1, double param2) {
		return param1 + param2;
	}

	public static double sub(double param1, double param2) {
		return param2 - param1;
	}

//	public static double div(double param1, double param2) throws ArithmeticException {
//		return param1 / param2;
//	}

	public static double div(int param1, int param2) throws ArithmeticException {

		return param1 / param2;
	}

	public static double multi(double param1, double param2) {
		return param1 * param2;
	}
}
