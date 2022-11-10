package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		/*
		 Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini 
		 ve iki sayı seçmesini söyleyin. 
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("paralel kenar dikdörtgen üçgen birini giriniz :");
		String secim =sc.nextLine().toLowerCase();
		System.out.println("1. sayıyı giriniz :");
		int sayı1= sc.nextInt();
		System.out.println("2. sayıyı giriniz :");
		int sayı2= sc.nextInt();
		secim(secim,sayı1,sayı2);
	}//main sonu

	public static void secim (String str,int sayi1,int sayi2){
		switch (str){
			case "paralel kenar" :
				sayi2=sayi1;
				paralelkenarALan( sayi1,sayi2);
				paralelkenarCevre( sayi1,sayi2);
				break;

			case "ditdörtgen" :

				break;

			case "üçgen":

				break;

			default:

				System.out.println("hatalı seçim yaptınız");
				secim(str,sayi1,sayi2);
		}
	}

	private static void paralelkenarCevre(int sayi1, int sayi2) {
		System.out.println("karenin cevresi : " + (sayi1*sayi2));

	}

	private static void paralelkenarALan(int sayi1, int sayi2) {
		System.out.println("karenin çevresi :" + (sayi1*4));
	}


}
