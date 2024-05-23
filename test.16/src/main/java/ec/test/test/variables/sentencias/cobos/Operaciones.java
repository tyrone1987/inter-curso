package ec.test.test.variables.sentencias.cobos;

public class Operaciones {
	
	private int a= 0;
	private int b= 0;
	
	public double Sumar (double  a, double b){
		return a + b;
	}
	
	public double Restar(double a, double b){
		return a - b;
	}
	
	public double Multiplicar(double a, double b)
	{
		for (int i = 1; i <= b; i++) {
			if (b == 1){
				b = a;	
			}else if (b >= 2){
				b += a;
			}			
		}
		return b;
	}
	
	public double Dividir (double a, double b)
	{
		if (b==0)
		{
			return 0;
		} else {
			return a/b;
			
		}
	}

}
