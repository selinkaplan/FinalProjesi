package UcakBilet;

public class Ucak {
	
	private String marka;
    private String model;
    private int yolcuKapasitesi;
    private String seriModeli;

    public Ucak(String marka, String model, int yolcuKapasitesi, String seriModeli) {
        this.marka = marka;
        this.model = model;
        this.yolcuKapasitesi = yolcuKapasitesi;
        this.seriModeli = seriModeli;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getYolcuKapasitesi() {
        return yolcuKapasitesi;
    }

    public String getSeriModeli() {
        return seriModeli;
    }
}
	



