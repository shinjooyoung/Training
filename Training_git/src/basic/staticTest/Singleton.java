package basic.staticTest;

public class Singleton {

    //클래스 변수로 
    private static Singleton one;
    
    //생성자 privated으로 같은 클래스에서만 접근가능
    private Singleton() {
        
    }
    
    //클래스 메소드
    public static Singleton getInstance() {
        
        //클래스 변수가 null일때만 객체 생성
        if(one==null) {
            one = new Singleton();
        }
        return one;
    }
    
    public void test() {
        System.out.println("싱글톤 완료!!!");
    }
}
