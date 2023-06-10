package UcakBilet;

public class Musteri {
	
	    private String ad;
	    private String soyad;
	    private String telefon;
	    private String email;
	    private boolean ogrenci;
	    private boolean engelli;

	    public Musteri(String ad, String soyad, String telefon, String email, boolean ogrenci, boolean engelli) {
	        this.ad = ad;
	        this.soyad = soyad;
	        this.telefon = telefon;
	        this.email = email;
	        this.ogrenci = ogrenci;
	        this.engelli = engelli;
	    }

	    public String getAd() {
	        return ad;
	    }

	    public String getSoyad() {
	        return soyad;
	    }

	    public String getTelefon() {
	        return telefon;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public boolean isOgrenci() {
	        return ogrenci;
	    }

	    public boolean isEngelli() {
	        return engelli;
	    }
	}



