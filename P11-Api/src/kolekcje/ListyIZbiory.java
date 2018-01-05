package kolekcje;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class ListyIZbiory {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		LinkedList<String> lista = new LinkedList<>();
		HashSet<String> hasz = new HashSet<>();
		LinkedHashSet<String> linkedHasz = new LinkedHashSet<>();
		TreeSet<String> drzewo = new TreeSet<>();
		PriorityQueue<String> kolejka  = new PriorityQueue<>();
		
		al.add("ala"); lista.add("ala"); drzewo.add("ala"); hasz.add("ala"); linkedHasz.add("ala"); kolejka.add("ala");
		al.add("ola"); lista.add("ola"); drzewo.add("ola"); hasz.add("ola"); linkedHasz.add("ola"); kolejka.add("ola");
		al.add("ela"); lista.add("ela"); drzewo.add("ela"); hasz.add("ela"); linkedHasz.add("ela"); kolejka.add("ela");
		al.add("ula"); lista.add("ula"); drzewo.add("ula"); hasz.add("ula"); linkedHasz.add("ula"); kolejka.add("ula");
		al.add("ola"); lista.add("ola"); drzewo.add("ola"); hasz.add("ola"); linkedHasz.add("ola"); kolejka.add("ola");

		System.out.println("ArrayList:     "+al);
		System.out.println("LinkedList:    "+lista);
		System.out.println("TreeSet:       "+drzewo);
		System.out.println("HashSet:       "+hasz);
		System.out.println("LinkedHashSet: "+linkedHasz);
		System.out.println("PriorityQueue: "+kolejka);
		
		System.out.println("\n\nhaszkody Stringów:");
		for(String s : linkedHasz) {
			System.out.printf("%s  hashCode = %8d, modulo 16 = %2d%n",
					s, s.hashCode(), s.hashCode() % 16);
		}
	}
}
