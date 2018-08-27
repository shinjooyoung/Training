package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreator {
    
    /** 디폴트 생성자 */
    public FileCreator() {
        super();
    }
    
    /** 파일생성 구현 메소드
     * @param filePath, content  
     */
    public void create(String filePath, String content) {
        
        // FileWriter 객체 선언
        FileWriter fw = null;
        
        try{
             
            // File 객체 생성
            File file = new File(filePath);
             
            // FileWriter 객체생성, true 기존 파일 이어서 출력
            fw = new FileWriter(file, true);
             
            // 파일안에 문자열 쓰기
            fw.write(content);
            
            // 입력받은 버퍼를 파일로 보냄
            fw.flush();
            
            //완료 메세지
            System.out.println("생성완료");
             
        } catch(Exception e) {
           System.out.println(e);
        } finally { 
            
            try {
                
                // FileWriter 객체 null 체크, 닫기
                if(fw != null) fw.close();
                
            } catch (IOException e) {
                
                e.printStackTrace();
            }
        }
    }
    
    /** main 메소드 */
    public static void main(String[] args) { 
        
        //FileCreator 객체 생성
        FileCreator fc = new FileCreator();
        
        //파일경로 초기화
        String filePath = args[0];
        
        //입력내용 초기화
        String content = args[1];
        
        //FileCreator객체 create 메소드 호출 
        //filePath, content 인자값 전달
        fc.create(filePath, content);

    }
}
