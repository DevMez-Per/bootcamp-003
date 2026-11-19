package com.bootcamp.helper;

public class TaxCalculator {

	private static double IVA_RATE;

	public TaxCalculator(double IVA_RATE) {
		this.IVA_RATE = IVA_RATE;
	}

	public static double calculateIva(double price) {
		if (price < 0) {
	        throw new IllegalArgumentException("El precio no puede ser negativo");
	    }
		return price * IVA_RATE / 100;
	}
}
