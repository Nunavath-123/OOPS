package exceptionex;

public class Wrapper {

	public static void main(String[] args) {
		run(10);
	}
	public static void run(int i) {
		System.out.println("from run(int i)");
	}
	public static void run(long i) {
		System.out.println("from run(long i)");
	}
	public static void run(float i) {
		System.out.println("from run(float i)");
	}
	public static void run(double i) {
		System.out.println("from run(double i)");
	}
	public static void run(Object i) {
		System.out.println("from run(Object i)");
	}
}
