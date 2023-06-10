package UcakBilet;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Uygulama {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Müşteri Bilgileri");
	        System.out.print("Ad: ");
	        String ad = scanner.nextLine();
	        System.out.print("Soyad: ");
	        String soyad = scanner.nextLine();
	        System.out.print("Telefon: ");
	        String telefon = scanner.nextLine();
	        System.out.print("E-posta: ");
	        String email = scanner.nextLine();
	        System.out.print("Öğrenci misiniz? (Evet/Hayır): ");
	        boolean ogrenci = scanner.nextLine().equalsIgnoreCase("Evet");
	        System.out.print("Engelli misiniz? (Evet/Hayır): ");
	        boolean engelli = scanner.nextLine().equalsIgnoreCase("Evet");

	        Musteri musteri = new Musteri(ad, soyad, telefon, email, ogrenci, engelli);

	        System.out.println("\nLokasyon Bilgileri");
	        System.out.print("Kalkış Yeri: ");
	        String kalkisYeri = scanner.nextLine();
	        System.out.print("Varış Yeri: ");
	        String varisYeri = scanner.nextLine();

	        Lokasyon lokasyon = new Lokasyon(kalkisYeri, varisYeri);

	        System.out.println("\nUçak Bilgileri");
	        List<Ucak> ucakListesi = new ArrayList<>();
	        ucakListesi.add(new Ucak("Pegasus", "737", 200, "XYZ123"));
	        ucakListesi.add(new Ucak("Pegasus", "A320", 180, "ABC456"));
	        ucakListesi.add(new Ucak("THY", "E190", 100, "DEF789"));
	        ucakListesi.add(new Ucak("THY", "CRJ900", 90, "GHI012"));
	        ucakListesi.add(new Ucak("Atlasjet", "747", 350, "JKL345"));
	        ucakListesi.add(new Ucak("Atlasjet", "A380", 500, "MNO678"));
	        ucakListesi.add(new Ucak("Qatar Airways", "E175", 80, "PQR901"));
	        ucakListesi.add(new Ucak("Qatar Airways", "CRJ700", 70, "STU234"));
	        ucakListesi.add(new Ucak("Anadolu Jet", "777", 300, "VWX567"));
	        ucakListesi.add(new Ucak("Anadolu Jet", "A330", 250, "YZA890"));

	        System.out.println("Uçaklar:");
	        for (int i = 0; i < ucakListesi.size(); i++) {
	            Ucak ucak = ucakListesi.get(i);
	            System.out.println((i + 1) + ". " + ucak.getMarka() + " " + ucak.getModel());
	        }

	        System.out.println("Uçaklar:");
	        for (int i = 0; i < ucakListesi.size(); i++) {
	            Ucak ucak = ucakListesi.get(i);
	            System.out.println((i + 1) + ". " + ucak.getMarka() + " " + ucak.getModel());
	        }

	        System.out.print("Uçak seçiminizi yapın (1-" + ucakListesi.size() + "): ");
	        int ucakSecim = scanner.nextInt();
	        Ucak secilenUcak = ucakListesi.get(ucakSecim - 1);

	        System.out.print("\nRezervasyon Tarihi(GG/AA/YYYY): ");
	        scanner.nextLine(); 
	        String rezervasyonTarihi = scanner.nextLine();
	        System.out.print("Kaç kişi için rezervasyon yapmak istiyorsunuz? ");
	        int kisiSayisi = scanner.nextInt();

	        Rezervasyon rezervasyon = new Rezervasyon(musteri, lokasyon, secilenUcak, rezervasyonTarihi, kisiSayisi);

	        System.out.println("\nRezervasyon Özeti:");
	        System.out.println("Müşteri: " + musteri.getAd() + " " + musteri.getSoyad());
	        System.out.println("Telefon: " + musteri.getTelefon());
	        System.out.println("E-posta: " + musteri.getEmail());
	        System.out.println("Öğrenci mi? " + (musteri.isOgrenci() ? "Evet" : "Hayır"));
	        System.out.println("Engelli mi? " + (musteri.isEngelli() ? "Evet" : "Hayır"));
	        System.out.println("Kalkış Yeri: " + lokasyon.getKalkisYeri());
	        System.out.println("Varış Yeri: " + lokasyon.getVarisYeri());
	        System.out.println("Uçak Markası: " + secilenUcak.getMarka());
	        System.out.println("Uçak Modeli: " + secilenUcak.getModel());
	        System.out.println("Rezervasyon Tarihi: " + rezervasyonTarihi);
	        System.out.println("Kişi Sayısı: " + kisiSayisi);

	        double fiyat = rezervasyon.rezervasyonFiyatiniHesapla();
	        System.out.println("Ödenecek Tutar: " + fiyat + " TL");

	        System.out.print("\nRezervasyonunuzu onaylamak istiyor musunuz? (Evet/Hayır): ");
	        scanner.nextLine();
	        String onay = scanner.nextLine();

	        if (onay.equalsIgnoreCase("Evet")) {
	            System.out.println("\nRezervasyon onaylandı!");
	        } else {
	            System.out.println("\nRezervasyon iptal edildi.");
	        }
	    }
	}