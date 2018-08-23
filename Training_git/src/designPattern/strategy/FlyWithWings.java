package designPattern.strategy;

public class FlyWithWings implements IFlyBehavior{
    
    @Override
    public void fly() {
        System.out.println("날고있어요");
    }
 
}