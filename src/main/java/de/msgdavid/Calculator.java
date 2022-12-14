package de.msgdavid;

public class Calculator {

	public Calculator() {

	}

	public static double add(double param1, double param2) { //Symbol +
		return param1 + param2;
	}

	public static double sub(double param1, double param2) { //Symbol -
		return param1 - param2;
	}

	public static double div(double param1, double param2) throws ArithmeticException { //Symbol /
		return param1 / param2;
	}

	public static double multi(double param1, double param2) { //Symbol *

		return param1 * param2;
	}

	/**
	 * Berechnen der Quadratwurzel
	 * @param param1
	 * @return
	 */
	public static double sqrt(double param1){ //Symbol r2

		return Math.sqrt(param1);
	}

	public static double pow(double param1, double param2){ //Symbol xn

		return Math.pow(param1, param2);
	}

	public static double mod(double param1, double param2){ //Symbol %
		return param1 % param2;
	}
}
