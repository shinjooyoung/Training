package basic.io;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite {



    public static void main(String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream("D:/out.txt");
        
            //FileOutputStream
            for (int i = 1; i < 11; i++) {
                String data = i + " 번째 줄입니다./r/n";
                output.write(data.getBytes());
            }
                output.close();
            
            
            // FileWriter
        FileWriter fw = new FileWriter("d:/file.txt");
            for (int i = 1; i < 11; i++) {
                String data = i + " 번째 줄입니다./r/n";
                fw.write(data);
            }
            fw.close();
            
        PrintWriter pw = new PrintWriter("d:/print.txt");
            for (int i = 1; i < 11; i++) {
                String data = i+"번쨰 줄입니다.";
                pw.println(data);
            }
            pw.close();
             
    }
    
}
