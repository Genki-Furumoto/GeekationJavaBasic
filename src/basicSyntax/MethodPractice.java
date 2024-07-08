package basicSyntax;

public class MethodPractice {
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		
		method5(method1(a, b));
		method5(method2(a, b));
		method5(method3(a, b));
		method5(method4(a, b));
		
		
		
	}
		
		public static int method1(int num1, int num2) {
			return num1 + num2;
		}
		
		public static int method2(int num1, int num2) {
			return num1 - num2;
		}
		
		public static int method3(int num1, int num2) {
			return num1 * num2;
		}
		
		public static int method4(int num1, int num2) {
			return num1 / num2;
		}
		
		public static void method5(int num) {
			System.out.println("計算結果は" + num + "です。");
		}

}