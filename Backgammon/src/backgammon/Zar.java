/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backgammon;

import java.util.Random;

/**
 *
 * @author yahya
 */
public class Zar {

    private int zar;
 
    public int ZarAt() {
        Random rand = new Random();
        while (true) {
            zar = rand.nextInt(7);
            
            if (zar == 0 ) {
                zar = rand.nextInt(7);
                
            } else {
                return zar;
            }
        }
    }

}
