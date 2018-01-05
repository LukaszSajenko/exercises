package Podstawy;

public class instrukcjaBreak {

	public static void main(String[] args) { // Nie za bardzo wiem o co chodzi, wróciæ do tego!!!
		Scanner in = new Scanner(System.in);
		for (count = 1; count <= 100; count++) {
			System.out.println("Podaj liczbê (-1 koñczy dzia³anie programu): ");
			n = in.nextInt();
			if (n < 0) continue;
			sum += n;
		}

	}

}
