package ec.test.test.variables;

public class Operadores {
	private int a;
	private Integer b;
	private String c;

	public Operadores(int a,int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public Integer getB() {
		if (b == null) {
			b = 0;
		}
		return b;
	}

	public void setB(Integer b) {
		this.b = b;
	}

	public int sumar() {
		if (b == null) {
			b = 0;
		}
		return a + b;
	}

	public int sumarUno(int x) {
		// a = a +x;
		if (b == null) {
			b = 0;
		}
		a += x;
		return a;
	}

	public Integer restar() {
		return a - b;
	}

	public int multiplicar() {
		return a * b;
	}

	public double dividir() {
		if (b != 0)
			return a / b;
		return 0;
	}
	
	public Object sumarString() {
		return a+c;
	}
	
	public boolean validarMayor() {
		boolean r ;
		if(a!=b) {
			r = true;
		}else {
			r=false;
		}
		return r;
	}
	
	public boolean validarMayor2() {
		return a>b;
	}
	
	public int desplazarDerecha() {
		return a >> 2;
	}
	
	public int desplazarIzquierda() {
		return a << 2;
	}
}
