package basic.staticTest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StaticTest {

    
    /**
         현재날짜 구하는 클래스 메소드
    */
    public static String getCurrentDate(String fmt) {
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        return sdf.format(new Date());
    }
    
    
    /**
     main 메소드 
     */
    public static void main(String[] args) {
        // 날짜 출력
        System.out.println(StaticTest.getCurrentDate("yyyyMMdd"));
        
        //싱글톤 패턴 객체
        Singleton singleton = Singleton.getInstance();
        
        singleton.test();
        
    }
    
    

}
