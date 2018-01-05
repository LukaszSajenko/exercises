package Tablice;

import java.util.Arrays;

public class Tablice2 {

    public static void main(String[] args) {
   	 
   	 // deklaracja �e t1 jest zmienn� typu "tablica int�w"
   	 int[] t1;
   	 
   	 // utworzenie tablicy na 10 int�w w pamieci
   	 // tablica jest pocz�tkowo wype�niona samymi zerami (albo nullami)
   	 t1 = new int[10];
   	 
   	 // mo�na to zapisa� w jednej linii
   	 int[] t2 = new int[20];
   	 
   	 // tablica znasw�j rozmiar
   	 System.out.println(t1.length);
   	 System.out.println(t2.length);
   	 
   	 // na pola w tablicy (albo inaczej "kom�rki" tablicy) mo�na wpisywa� warto�ci
   	 t1[0] = 100;
   	 t1[2] = 333;
   	 t1[2]++;  // na kom�rkach mo�na dzia�a� jak na zmiennych
   	 t1[3] = 300 + 21;
   	 
   	 // mo�na odczytywa� pojedyncze kom�rki:
   	 System.out.println(t1[0]);
   	 System.out.println(t1[1]);
   	 System.out.println(t1[2]);
   	 
   	 //EXN t1[10] = 4;
   	 
   	 // Wypisywanie tablic
   	 System.out.println(t1);  // wypisuje "krzaki"
   	 System.out.println(Arrays.toString(t1));
   	 
   	 // P�tle
   	 for(int i = 0; i < t1.length; i++) {
   		 System.out.println("tablica na pozycji " + i + " ma warto�� " + t1[i]);
   	 }

   	 System.out.println();
   	 
   	 for(int i = 0; i < t2.length; i++) {
   		 t2[i] = i*i;
   	 }
   	 
   	 System.out.println(Arrays.toString(t2));
   	 
   	 for(int element : t2) {
   		 System.out.println("kolejna liczba: " + element);
   	 }

    }

}

