package Podstawy;

public class StaticTest {

	public static void main(String[] args) {
		
		// Wstawienie do tablicy staff trzech obiekt�w reprezentuj�cych pracownik�w
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Tomasz", 40000);
		staff[1] = new Employee("Dariusz", 60000);
		staff[2] = new Employee("Grzegorz", 65000);
		
		// Drukowanie informacji o wszystkich obiektach klasy Employee
		for(Employee e : staff) {
			e.setId();
			System.out.println("name=" + e.getName() + ",id=" + e.getid() + ",salary=" + e.getSalary());
			
		}
		
		int n = Employee.getNextId(); // Wywo�anie metody statycznej
		System.out.println("Nast�pny dost�pny identyfikator=" + n);
		

	}

}

	class Employee {
		
		private static int nextId = 1;
		private String name;
		private double salary;
		private int id;
		
		public Employee(String n, double s) {
			name = n;
			salary = s;
			id = 0;
		}
		
		public String getName() {
			return name;
		}
		public double getSalary() {
			return salary;
		}
		public int getid() {
			return id;
		}
		public void setId() {
			id = nextId;
			nextId++; // Ustawienie identyfikatora na kolejny dost�pny numer
		}
		public static int getNextId() {
			return nextId; // Zwr�cenie pola statycznego
			
		}
		public static void main(String[] args) { // test jednostkowy
			Employee e = new Employee("Grzegorz", 50000);
			System.out.println(e.getName() + " " + e.getSalary());
		}
	}
