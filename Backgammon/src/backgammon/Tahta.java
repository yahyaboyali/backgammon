/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backgammon;

/**
 *
 * @author yahya
 */
public class Tahta {

    Konum[] konumlar = new Konum[24];

    // white true black false.
    public Konum[] konumciz() {

        for (int i = 0; i < konumlar.length; i++) {
            switch (i) {
                case 0: {
                    Konum a = new Konum();
                    Tas t = new Tas();
                    t.setTasrengi("siyah");
                    t.setTasvarmi(true);
                    a.setTassayisi(2);
                    a.setKordinatlar(i);
                    a.setT(t);
                    konumlar[i] = a;
                    break;
                }
                case 5: {
                    Konum a = new Konum();
                    Tas t = new Tas();
                    t.setTasrengi("beyaz");
                    t.setTasvarmi(true);
                    a.setTassayisi(5);
                    a.setKordinatlar(i);
                    a.setT(t);
                    konumlar[i] = a;
                    break;
                }
                case 7: {
                    Konum a = new Konum();
                    Tas t = new Tas();
                    t.setTasrengi("beyaz");
                    t.setTasvarmi(true);
                    a.setTassayisi(3);
                    a.setKordinatlar(i);
                    a.setT(t);
                    konumlar[i] = a;
                    break;
                }
                case 11: {
                    Konum a = new Konum();
                    Tas t = new Tas();
                    t.setTasrengi("siyah");
                    t.setTasvarmi(true);
                    a.setTassayisi(5);
                    a.setKordinatlar(i);
                    a.setT(t);
                    konumlar[i] = a;
                    break;
                }
                case 12: {
                    Konum a = new Konum();
                    Tas t = new Tas();
                    t.setTasrengi("beyaz");
                    t.setTasvarmi(true);
                    a.setTassayisi(5);
                    a.setKordinatlar(i);
                    a.setT(t);
                    konumlar[i] = a;
                    break;
                }
                case 16: {
                    Konum a = new Konum();
                    Tas t = new Tas();
                    t.setTasrengi("siyah");
                    t.setTasvarmi(true);
                    a.setTassayisi(3);
                    a.setKordinatlar(i);
                    a.setT(t);
                    konumlar[i] = a;
                    break;
                }
                case 18: {
                    Konum a = new Konum();
                    Tas t = new Tas();
                    t.setTasrengi("siyah");
                    t.setTasvarmi(true);
                    a.setTassayisi(5);
                    a.setKordinatlar(i);
                    a.setT(t);
                    konumlar[i] = a;
                    break;
                }
                case 23: {
                    Konum a = new Konum();
                    Tas t = new Tas();
                    t.setTasrengi("beyaz");
                    t.setTasvarmi(true);
                    a.setTassayisi(2);
                    a.setKordinatlar(i);
                    a.setT(t);
                    konumlar[i] = a;
                    break;
                }
                default: {
                    Konum a = new Konum();
                    Tas t = new Tas();
                    t.setTasrengi(" ");
                    t.setTasvarmi(false);
                    //a.setTassayisi(0);
                    a.setKordinatlar(i);
                    a.setT(t);
                    konumlar[i] = a;
                    break;
                }
            }
        }
        return konumlar;
    }
}
