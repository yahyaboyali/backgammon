
package backgammon;

import java.io.*;

/**
 *
 * @author yahya
 */
public class Dosya {
    public File f;
    public void yaz(String dosyaadi,String text) throws IOException{
       f = new File(dosyaadi+"txt");
       if(!f.exists()){
           f.createNewFile();
       }
       FileWriter fw = new FileWriter(f,true);
       BufferedWriter bw = new BufferedWriter(fw);
       bw.write(text);
       bw.close();
    }
    public String oku(String dosyaadi) throws IOException{
        f = new File(dosyaadi+"txt");
       if(!f.exists()){
           f.createNewFile();
       }
       FileReader fr = new FileReader(f);
       BufferedReader br = new BufferedReader(fr);
       String line;
       while((line=br.readLine())!=null){
           return line;
       }
       return "";
    }
    public void kayitsizyaz(String dosyaadi,String line) throws IOException{
        f = new File(dosyaadi+"txt");
       if(!f.exists()){
           f.createNewFile();
       }
       FileWriter fw = new FileWriter(f,false);
       BufferedWriter bw = new BufferedWriter(fw);
       bw.write(line);
       bw.close();
    }
}
