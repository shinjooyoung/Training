package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreator {

    public static void main(String[] args) { 
        
        // FileWriter 객체 선언
        FileWriter fw = null;
        
        try{
             
            // File 객체 생성
            File file = new File(args[0]);
             
            // FileWriter 객체생성, true값으로 기존 파일에 이어서 출력
            fw = new FileWriter(file, true);
             
            // 파일안에 문자열 쓰기
            fw.write(args[1]);
            
            // 입력받은 버퍼를 파일로 보냄
            fw.flush();
            
            //생성완료 메세지
            System.out.println("생성완료");
             
        } catch(Exception e) {
           System.out.println(e);
        } finally { 
            
            try {
                
             // 마지막에 항상 실행, 객체 닫기
                fw.close();
                
            } catch (IOException e) {
                
                e.printStackTrace();
            }
        }

    }
}
