package Podstawy_2;

public class ParamTest {

	public static void main(String[] args) {
		/*
		 * Test 1. Metody nie mog¹ modyfikowaæ parametrów liczbowych
		 */

		System.out.println("Testowanie tripleValue:");
		double percent = 10;
		System.out.println("Przed: percent=" + percent);
		tripleValue(percent);
		System.out.println("Po: percent=" + percent);

		/*
		 * Test 2. Metody mog¹ zmieniaæ stan parametrów bêd¹cych obiektami
		 */

		System.out.println("\nTestowanie tripleSalary:");
		Employee2 harry = new Employee2("Grzegorz", 50000);
		System.out.println("Przed: sakary=" + harry.getSalary());
		tripleSalary(harry);
		System.out.println("Po: salary=" + harry.getSalary());

		/*
		 * Test 3. Metody nie mog¹ dodawaæ nowych obiektów do parametrów obiektowych
		 */

		System.out.println("\nTestowanie swap:");
		Employee2 a = new Employee2("Alicja", 70000);
		Employee2 b = new Employee2("Grzegorz", 60000);
		System.out.println("Przed: a=" + a.getName());
		System.out.println("Przed: b=" + b.getName());
		swap(a, b);
		System.out.println("Po: a=" + a.getName());
		System.out.println("Po: b=" + b.getName());

	}

	public static void tripleValue(double x) { // Nie dzia³a
		x = 3 * x;
		System.out.println("Koniec metody: x=" + x);
	}

	public static void tripleSalary(Employee2 x) { // Dzia³a
		x.raiseSalary(200);
		System.out.println("Koniec metody: salary=" + x.getSalary());

	}

	public static void swap(Employee2 x, Employee2 y) {
		Employee2 temp = x;
		x = y;
		y = temp;
		System.out.println("Koniec metody: x=" + x.getName());
		System.out.println("Koniec metody: y=" + y.getName());

	}

}

class Employee2 { // Uproszczona klasa Employee
	private String name;
	private double salary;
	
	public Employee2(String n, double s) {
		name = n;
		salary = s;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
}
