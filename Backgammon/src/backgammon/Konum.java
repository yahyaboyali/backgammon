
package backgammon;


public class Konum {
    private int kordinatlar;
    private boolean tasvarmi;
    private boolean renk;
    private int tassayisi;
    private Tas t;

    public Tas getT() {
        return t;
    }

    public void setT(Tas t) {
        this.t = t;
    }
    public int getTassayisi() {
        return tassayisi;
    }

    public void setTassayisi(int tassayisi) {
        this.tassayisi = tassayisi;
    }
    public int getKordinatlar() {
        return kordinatlar;
    }

    public void setKordinatlar(int kordinatlar) {
        this.kordinatlar = kordinatlar;
    }

    public boolean isTasvarmi() {
        return tasvarmi;
    }

    public void setTasvarmi(boolean tasvarmi) {
        this.tasvarmi = tasvarmi;
    }

    public boolean isRenk() {
        return renk;
    }

    public void setRenk(boolean renk) {
        this.renk = renk;
    }
    
    
    
}
