package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopier {
    
    /** 디폴트 생성자 */
    public FileCopier() {
        super();
    }
    
    /** 파일복사 구현 메소드 
     * @param src, dest 
     */
    public void copy(String src, String dest) {
        
        // InputStream 객체선언
        InputStream input = null;
        
        // OutputStream 객체선언
        OutputStream output = null;
        
        try {
            
            // FileInputStream 객체 생성, 복사할 파일 설정
            input = new FileInputStream(new File(src));
            
            // FileOutputStream 객체 생성, 복사한 파일 경로 이름 설정
            output = new FileOutputStream(new File(dest));
            
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
                //FileInputStream null 체크, 객체 닫기
                if(input != null) input.close();
                
                 //FileOutputStream null 체크, 객체 닫기
                if(output != null)  output.close();
                
            } catch (IOException e) {
                e.printStackTrace();
            }
            
        }
    }
    
    /** main 메소드 */
    public static void main(String[] args) {
        
        // FileCopier 객체 생성
        FileCopier fc = new FileCopier();
        
        // 복사할 파일 정보 src 초기화 
        String src = args[0];
        
        // 복사될 위치, 파일명 dest 초기화
        String dest = args[0];
        
        // FileCopier객체 copy 메소드 호출 
        // src, dest 인자값 전달
        fc.copy(src, dest);
        
    }

}
