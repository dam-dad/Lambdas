package dad.lambdas;

public class Main {
	
	public static void calcular(double x, double y, Operador op)  {
		System.out.println(op.operar(x, y));
	}

	public static void main(String[] args) {
		
		Operador sumador1 = new Operador() {
			public double operar(double a, double b) {
				return a + b;
			}
		};
		
		Operador sumador2 = (a, b) -> a + b;
		
		Operador restador = (a, b) -> a - b;
		Negador negador = (a) -> -a;
		Operador mulitiplicador = (x,y) -> x * y;
		
		System.out.println(sumador1.operar(10, 4));
		System.out.println(sumador2.operar(10, 4));
	
		calcular(13, 14, (n,m) -> n-m);

		Mostrar mos = () -> System.out.println("Lo que sea");
		mos.print();
		
	}

}
