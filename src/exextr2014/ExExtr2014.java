package exextr2014;

/**
 *
 * @author dc1314daw2@gmail.com
 */

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.io.*;

public class ExExtr2014 {
    public static void main(String[] args) throws IOException{
        File f = new File("ExExtr2014.html");
          try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
                bw.write("<html>");bw.newLine();
                bw.write("  <head>");bw.newLine();
                bw.write("    <title>");bw.newLine();
                bw.write("      Examen Extraordinari");bw.newLine();
                bw.write("    </title>");bw.newLine();
                bw.write("  </head>");bw.newLine();
                bw.write("  <body>");bw.newLine();
                bw.write("    P&agrave;gina web Examen Extraordinari ");bw.newLine();
                bw.write("    <br>");bw.newLine();                
                DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                Date date = new Date();
                bw.write(dateFormat.format(date));bw.newLine();
                bw.write("  </body>");bw.newLine();
                bw.write("</html>");bw.newLine();
                bw.close();              
          }
    }  
}
