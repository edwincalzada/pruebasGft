package ejemplos;

public class Comparacion {

	public static void main(String[] args) {
		Integer valor1 = 1;
		Integer valor2 = 2;

		if(valor1 == valor2)	
			System.out.println("valor1 == valor2");

		if(valor1.equals(valor2)){
			System.out.println("valor1 es igual valor2");
		} else {
			System.out.println("valor1 no igual valor2");
		}
	}

}
