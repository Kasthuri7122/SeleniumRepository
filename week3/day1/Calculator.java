package week3.day1;

public class Calculator {
			public void add (int a, int b) {
			System.out.println( a+b);
		}
		public void add(int a, int b, int c) {
			System.out.println(a+b+c);
		}
		public void multiply(double a, double b) {
			System.out.println(a*b);
		}
		public void multiply(float a, float b) {
			System.out.println(a*b);
		}
		public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add(3, 2);
		calc.add(5, 6, 9);
		calc.multiply(53, 55);
		calc.multiply(5.5f, 8.8f);
		
	}

}
