package Podstawy_2;

import java.util.ArrayList;

public class webinar18grudnia {

	// Kolekcje

	public static void main(String[] args) {

		ArrayList<String> friends = new ArrayList<>();
		friends.add("Zosia");
		friends.add("Micha�");
		friends.add("Wojciech");
		friends.add("Joanna");

		System.out.println("Moi przyjaciele: ");
		for (String friend : friends) {
			System.out.println(friends);
		}
		System.out.println("Ilo�� przyjaci� " + friends.size());
		
	}
}
