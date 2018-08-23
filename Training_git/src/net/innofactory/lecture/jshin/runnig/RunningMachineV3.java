package net.innofactory.lecture.jshin.runnig;

import net.innofactory.lecture.jshin.animal.Dog;
import net.innofactory.lecture.jshin.animal.Human;
import net.innofactory.lecture.jshin.animal.Robot;

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
		
	}
	
	/**
	 * 런닝머신 종료 메소드
	 */
	public void stop() {
		
		// 러닝머신 종료 메세지 출력 
		System.out.println("런닝머신 종료");
	
	}

	/**
	 * main 메소드
	 */
	public static void main(String[] args) {
		
		//사람이 런닝머신을 탔을때
		
		// RunningMachineV2 클래스 인스턴스 
		RunningMachineV3 machine = new RunningMachineV3();
		
		// Human 클래스 인스턴스 
		Human human = new Human();
		
		// RunningMachineV1  인스턴스 변수 탑승자  초기화 
		machine.setRunner(human);
		
		// RunningMachineV1 인스턴스 변수 속도 초기화 
		machine.setSpeed(10);
		
		// RunningMachineV1 play 메소드 호출
		machine.play();
		
		// Animal run 메소드 호출
		human.run();
		
		// RunningMachineV1 stop 메소드 호출
		machine.stop();
		
		//------------------------------------------------------------
		
		//강아지가 런닝머신을 탔을때
		
		// Dog 클래스 인스턴스 
		Dog dog = new Dog();
		
		// RunningMachineV1  인스턴스 변수 탑승자  초기화 
		machine.setRunner(dog);
		
		// RunningMachineV1 인스턴스 변수 속도 초기화 
		machine.setSpeed(30);
		
		// RunningMachineV1 play 메소드 호출
		machine.play();
		
		// Animal run 메소드 호출
		dog.run();
		
		// RunningMachineV1 stop 메소드 호출
		machine.stop();
		
		//------------------------------------------------------------
		
		//로봇이 런닝머신을 탔을때
		
		// 로봇 클래스 인스턴스 
		Robot robot = new Robot();
		
		// RunningMachineV1  인스턴스 변수 탑승자  초기화 
		machine.setRunner(robot);
		
		// RunningMachineV1 인스턴스 변수 속도 초기화 
		machine.setSpeed(30);
		
		// RunningMachineV1 play 메소드 호출
		machine.play();
		
		// Animal run 메소드 호출
		robot.run();
		
		// RunningMachineV1 stop 메소드 호출
		machine.stop();
				
		
	}

}
