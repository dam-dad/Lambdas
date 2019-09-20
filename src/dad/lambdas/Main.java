package dad.lambdas;

public class Main {

	public static void main(String[] args) {

		Operador sumador = (a, b) -> a + b;
		Operador restador = (a, b) -> a - b;
		Negador negador = a -> -a;
		Operador mulitiplicador = (x,y) -> x * y;
		
		double r1 = sumador.operar(10, 4);
		double r2 = restador.operar(10, 4);
		double r3 = mulitiplicador.operar(10, 4);
		int r4 = negador.negar(45);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
	}

}
