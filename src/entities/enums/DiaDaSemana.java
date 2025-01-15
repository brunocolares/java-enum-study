package entities.enums;

public enum DiaDaSemana {
	SUNDAY(1, true),
	MONDAY(2, false),
	TUESDAY(3, false),
	WEDNESDAY(4, false),
	THRUSDAY(5, false),
	FRIDAY(6, true),
	SATURDAY(7, true);
	
	private final int diaNumerico;
	private final boolean finalDeSemana;
	
	DiaDaSemana(int diaNumerico, boolean finalDeSemana) {
		this.diaNumerico = diaNumerico;
		this.finalDeSemana = finalDeSemana;
	}
	
	public boolean isFinalDeSemana() {
		return finalDeSemana;
	}
	
	public int getNumeroDoDia() {
		return diaNumerico;
	}
}
