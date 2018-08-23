package designPattern.strategy;

public abstract class Duck {
//출처: http://arabiannight.tistory.com/entry/자바Java-패턴-1스트래티지-패턴Strategy-Pattern [아라비안나이트]
    
    IFlyBehavior iFlyBehavior;
    IQuackBehavior iQuackBehavior;
     
    public Duck(){
    }
     
    public abstract void display();
     
    public void performFly(){
        iFlyBehavior.fly();
    }
     
    public void performQuack(){
        iQuackBehavior.quack();
    }
     
    // 나는 행동 변화
    public void setFlyBehavior(IFlyBehavior fb){
        iFlyBehavior = fb;
    }
     
    // 소리 변화
    public void setQuackBehavior(IQuackBehavior fb){
        iQuackBehavior = fb;
    }



}
