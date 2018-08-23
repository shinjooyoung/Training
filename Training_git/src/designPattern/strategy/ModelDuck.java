package designPattern.strategy;

public class ModelDuck extends Duck{
    
    public ModelDuck(){
        iFlyBehavior = new NoFly(); // "날지못해요"
        iQuackBehavior = new Quack(); // "꾸에에에에에~~엑"
    }
     
    @Override
    public void display() {
        System.out.println("모형오리");
    }
     
}
