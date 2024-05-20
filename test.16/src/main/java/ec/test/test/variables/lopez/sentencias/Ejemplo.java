package ec.test.test.variables.lopez.sentencias;

public class Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperacionesEnum o = OperacionesEnum.MULTIPLICACION;
		int a = 5;
		int b = 1;
		switch (o) {
		case DIVISION: {
			if(b>0)
			{
				System.out.println(a / b);
			}else {
				System.out.println("no se puede dividir por cero");
			}
			break;
		}
		case MULTIPLICACION: {
			int c = 0;
			for(int i = 1; i <= b; i++) {
				c+=a;
			}
			System.out.println(c);
			break;
		}
		case SUMA: {
			System.out.println(a + b);
			break;
		}
		case RESTA: {
			System.out.println(a - b);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + o);
		}
	}

}
