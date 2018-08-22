package net.innofactory.lecture.jshin.runnig;

import net.innofactory.lecture.jshin.animal.Human;

public class RunningMachineV1 {
	
	/** 속도 */
	private int speed;
	
	/** 운동하는사람 */
	private Human runner;
	
	/**
	 * 디폴트 생성자
	 */
	public RunningMachineV1() {
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
	public Human getRunner() {
		return runner;
	}

	/**
	 * @param runner 운동하는사람
	 */
	public void setRunner(Human runner) {
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
		
		// RunningMachineV1 클래스 인스턴스 
		RunningMachineV1 machine = new RunningMachineV1();
		
		// Human 클래스 인스턴스 
		Human human = new Human();
		
		// RunningMachineV1  인스턴스 변수 탑승자  초기화 
		machine.setRunner(human);
		
		// RunningMachineV1 인스턴스 변수 속도 초기화 
		machine.setSpeed(10);
		
		// RunningMachineV1 play 메소드 호출
		machine.play();
		
		// RunningMachineV1 stop 메소드 호출
		machine.stop();
		
	}

}
