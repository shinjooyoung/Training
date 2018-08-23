package designPattern.strategy;

public class NoFly implements IFlyBehavior{
    
    @Override
    public void fly() {
        System.out.println("날지못해요");
    }
 
}

