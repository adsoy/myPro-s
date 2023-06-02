package encapsulation01;

public class C01_Okul {
    private String okulIsmi="Devlet okulu";
    private String mudur="Ahmet Hoca";
    private int sinifSayi=15;
    private int ogretmenSayisi=5;

    private int toplamogrenciSayisi;
    private boolean tamGunMu=false;

    public int getSinifSayi() {
        return sinifSayi;
    }

    public String getOkulIsmi() {
        return okulIsmi;
    }

    public void setOkulIsmi(String okulIsmi) {
        this.okulIsmi = okulIsmi;
    }

    public String getMudur() {
        return mudur;
    }

    public void setMudur(String mudur) {
        this.mudur = mudur;
    }

    public int getOgretmenSayisi() {
        return ogretmenSayisi;
    }

    public void setOgretmenSayisi(int ogretmenSayisi) {
        this.ogretmenSayisi = ogretmenSayisi;
    }


    public int getToplamogrenciSayisi() {
        return toplamogrenciSayisi;
    }

    public void setToplamogrenciSayisi(int toplamogrenciSayisi) {
        this.toplamogrenciSayisi = toplamogrenciSayisi;
    }

    public boolean isTamGunMu() {
        return tamGunMu;
    }

    public void setTamGunMu(boolean tamGunMu) {
        this.tamGunMu = tamGunMu;
    }

    @Override
    public String toString() {
        return "C01_Okul{" +
                "okulIsmi='" + okulIsmi + '\'' +
                ", mudur='" + mudur + '\'' +
                ", ogretmenSayisi=" + ogretmenSayisi +
                ", sinifSayi=" + sinifSayi +

                ", tamGunMu=" + tamGunMu +
                '}';
    }
}