package entities.enums;

public enum Moeda {
	REAL(1.0),
	DOLAR(6.05),
	EURO(6.22);
	
	private final double taxa;
	
	Moeda(double taxa) {
		this.taxa = taxa;
	}
	
	private double getTaxa() {
		return taxa;
	}
	
	public double converter(double real) {
		return real / getTaxa();
	}
	
}
