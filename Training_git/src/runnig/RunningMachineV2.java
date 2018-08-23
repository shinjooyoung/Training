package runnig;

import animal.Animal;
import animal.Dog;
import animal.Human;

public class RunningMachineV2 {
	
	/** 속도 */
	private int speed;
	
	/** 운동하는사람 Animal 상속받은 class 모두 탑승가능  */
	private Animal runner;
	
	/**
	 * 디폴트 생성자
	 */
	public RunningMachineV2() {
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
	public Animal getRunner() {
		return runner;
	}

	/**
	 * @param runner 운동하는사람
	 */
	public void setRunner(Animal runner) {
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
		RunningMachineV2 machine = new RunningMachineV2();
		
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
		human.run();
		
		// RunningMachineV1 stop 메소드 호출
		machine.stop();
		
	}

}
