package ec.test.test.variables;

public class Operadore {
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getB() {
		return B;
	}
	public void setB(String b) {
		B = b;
	}
	private int a;
	private String B;
	
	public Object sumarString()
	{
		return a + B;
	}
}

