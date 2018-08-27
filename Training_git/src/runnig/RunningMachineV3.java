package runnig;

import animal.Robot;

public class RunningMachineV3 {
    
    /** 속도 */
    private int speed;
    
    /** 운동하는사람 Controoler 인터페이스 상속받은 class만 탑승가능  */
    private Runner runner;
    
    /**
     * 디폴트 생성자
     */
    public RunningMachineV3() {
        super();
    }
    
    /**
     * @return speed 속도
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * @param speed 속도
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * @return runner 운동하는사람
     */
    public Runner getRunner() {
        return runner;
    }

    /**
     * @param runner 운동하는사람
     */
    public void setRunner(Runner runner) {
        this.runner = runner;
    }
    
    /**
     * 런닝머신 작동 메소드
     */
    public void play() {
        
        // 러닝머신 작동 메세지 출력 
        System.out.println("런닝머신 작동");
        
        // 탑승한 객체가 달림
        this.runner.run();
        
    }
    
    /**
     * 런닝머신 작동 메소드
     */
    public void stop() {
        
        // 러닝머신 작동 메세지 출력 
        System.out.println("런닝머신 정지");
        
    }

    /**
     * main 메소드
     */
    public static void main(String[] args) {
        
        // RunningMachineV3 클래스 인스턴스 
        RunningMachineV3 machine = new RunningMachineV3();
        
        // 탑승자 객체 생성 human, Dog, Robot가능
        Runner runner = new Robot();
        
        // RunningMachineV3  인스턴스 변수 탑승자  초기화 
        machine.setRunner(runner);
        
        // RunningMachineV3 인스턴스 변수 속도 초기화 
        machine.setSpeed(10);
        
        // RunningMachineV3 play 메소드 호출
        machine.play();
        
        // RunningMachineV3 stop 메소드 호출
        machine.stop();
        
    }

}
