package basic.io;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class stream {

    public static void main(String[] args) throws Exception {
        
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
        
        String a = br.readLine();
        
        System.out.println(a);
        
        
    }
}
