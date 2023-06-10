package UcakBilet;

public class Rezervasyon {

	private Musteri musteri;
    private Lokasyon lokasyon;
    private Ucak ucak;
    private String rezervasyonTarihi;
    private int kisiSayisi;

    public Rezervasyon(Musteri musteri, Lokasyon lokasyon, Ucak ucak, String rezervasyonTarihi, int kisiSayisi) {
        this.musteri = musteri;
        this.lokasyon = lokasyon;
        this.ucak = ucak;
        this.rezervasyonTarihi = rezervasyonTarihi;
        this.kisiSayisi = kisiSayisi;
    }

    public String toString() {
        return "Rezervasyon Bilgileri:\n" +
                "Müşteri: " + musteri.getAd() + " " + musteri.getSoyad() + "\n" +
                "Telefon: " + musteri.getTelefon() + "\n" +
                "E-posta: " + musteri.getEmail() + "\n" +
                "Öğrenci mi? " + (musteri.isOgrenci() ? "Evet" : "Hayır") + "\n" +
                "Engelli mi? " + (musteri.isEngelli() ? "Evet" : "Hayır") + "\n" +
                "Kalkış Yeri: " + lokasyon.getKalkisYeri() + "\n" +
                "Varış Yeri: " + lokasyon.getVarisYeri() + "\n" +
                "Uçak Markası: " + ucak.getMarka() + "\n" +
                "Uçak Modeli: " + ucak.getModel() + "\n" +
                "Yolcu Kapasitesi: " + ucak.getYolcuKapasitesi() + "\n" +
                "Seri Modeli: " + ucak.getSeriModeli() + "\n" +
                "Rezervasyon Tarihi: " + rezervasyonTarihi + "\n" +
                "Kişi Sayısı: " + kisiSayisi;
    }

    public double rezervasyonFiyatiniHesapla() {
        
        return 500.0;
    }
}

