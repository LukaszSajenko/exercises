package Podstawy;

public class instrukcjaBreak {

	public static void main(String[] args) { // Nie za bardzo wiem o co chodzi, wr�ci� do tego!!!
		Scanner in = new Scanner(System.in);
		for (count = 1; count <= 100; count++) {
			System.out.println("Podaj liczb� (-1 ko�czy dzia�anie programu): ");
			n = in.nextInt();
			if (n < 0) continue;
			sum += n;
		}

	}

}
