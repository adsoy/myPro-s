package encapsulation01;

public class C05_Araba {
    private String marka="Volvo";

    private String model="model belirtilmedi";

    private int uretimYili;

    private String yakitTuru="yakitTuru belirtilmedi";

    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    public String getYakitTuru() {
        return yakitTuru;
    }

    public void setYakitTuru(String yakitTuru) {
        this.yakitTuru = yakitTuru;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "C05_Araba{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", uretimYili=" + uretimYili +
                ", yakitTuru='" + yakitTuru + '\'' +
                '}';
    }
}