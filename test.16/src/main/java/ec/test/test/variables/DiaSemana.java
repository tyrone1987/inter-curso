package ec.test.test.variables;

public enum DiaSemana {
	LUNES(1,"L"), 
	MARTES(2,"M"), 
	MIERCOLES(3,"X"), 
	JUEVES(4,"J"), 
	VIERNES(5,"V");
<<<<<<< Updated upstream
	
=======

>>>>>>> Stashed changes

	private int codigoDia;
	private String inicial;
	
	DiaSemana(int codigoDia,String inicial) {
		// TODO Auto-generated constructor stub
		this.codigoDia = codigoDia;
		this.inicial = inicial;
	}

	public int getCodigoDia() {
		return codigoDia;
	}

	public String getInicial() {
		return inicial;
	}
	
}
