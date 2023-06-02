package encapsulation01;

public class C07_sinif extends C01_Okul{
    private int siniftakiOgrenci=30;

    @Override
    public int getSinifSayi() {
        return super.getSinifSayi();
    }
    private  int toplamogrenci=getSinifSayi()*siniftakiOgrenci;

    public static void main(String[] args) {
        C07_sinif sinif=new C07_sinif();
        System.out.println(sinif.toplamogrenci);
    }
    @Override
    public String getOkulIsmi() {
        return super.getOkulIsmi();
    }

    @Override
    public void setOkulIsmi(String okulIsmi) {
        super.setOkulIsmi(okulIsmi);
    }

    @Override
    public String getMudur() {
        return super.getMudur();
    }

    @Override
    public void setMudur(String mudur) {
        super.setMudur(mudur);
    }

    @Override
    public int getOgretmenSayisi() {
        return super.getOgretmenSayisi();
    }

    @Override
    public void setOgretmenSayisi(int ogretmenSayisi) {
        super.setOgretmenSayisi(ogretmenSayisi);
    }

    @Override
    public int getToplamogrenciSayisi() {
        return super.getToplamogrenciSayisi();
    }

    @Override
    public void setToplamogrenciSayisi(int toplamogrenciSayisi) {
        super.setToplamogrenciSayisi(toplamogrenciSayisi);
    }

    @Override
    public boolean isTamGunMu() {
        return super.isTamGunMu();
    }

    @Override
    public void setTamGunMu(boolean tamGunMu) {
        super.setTamGunMu(tamGunMu);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}