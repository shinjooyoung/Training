package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopier {

    public static void main(String[] args) {
        
        // InputStream 객체선언
        InputStream input = null;
        
        // OutputStream 객체선언
        OutputStream output = null;
        
        try {
            
            // InputStream 객체 생성, 복사할 파일 설정
            input = new FileInputStream(new File(args[0]));
            
            // OutputStream 객체 생성, 복사한 파일 경로 이름 설정
            output = new FileOutputStream(new File(args[1]));
            
            // 길이 변수 선언
            int length = 0;
            
            // buffer 배열 512지정
            byte [] buffer = new byte[512];
            
            //0번째부터 512 크기만큼 읽음
            while((length = input.read(buffer)) != -1) {
                
                // 읽어온 데이터를 출력
                output.write(buffer, 0, length);
                
            }
            
            //복사완료 메세지
            System.out.println("복사 완료");

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            
            try {
                
                // input 객체 닫기
                input.close();
                
                // output 객체 닫기
                output.close();
                
            } catch (IOException e) {
                e.printStackTrace();
            }
            
        }
        
    }

}
