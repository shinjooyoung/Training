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
	public void play(RunningMachineV1 machine) {
		
		/** 탑승자확인 if문 */
		if(machine.getRunner() == null) {
			
			/** 작동불가 메세지 */
			System.out.println("작동 불가");
			
			/** 메소드 종료 */
			return;
			
		} else {
			
			/** 탑승자 정보, 속도 메세지 출력 */
			System.out.println("탑승자 : "+ machine.getRunner().getName() +" 속도 : " + machine.getSpeed());
			
			/** 런닝머신 작동 메세지 출력*/
			System.out.println("런닝머신 작동");
			
			/** Animal run 메소드 호출*/
			machine.getRunner().run();
			
			/** RunningMachineV1 stop 메소드 호출*/
			machine.stop();
			
		}
		
	}
	
	/**
	 * 런닝머신 종료 메소드
	 */
	public void stop() {
		
		/** 러닝머신 종료 메세지 출력 */
		System.out.println("런닝머신 종료");
	
	}

	/**
	 * main 메소드
	 */
	public static void main(String[] args) {
		
		/** RunningMachineV1 클래스 인스턴스 */
		RunningMachineV1 machine = new RunningMachineV1();
		
		/** Human 클래스 인스턴스 */
		Human human = new Human();
		
		/** Human 인스턴스 변수 탑승자 이름 초기화 */
		human.setName("신주용");
		
		/** RunningMachineV1  인스턴스 변수 탑승자  초기화 */
		machine.setRunner(human);
		
		/** RunningMachineV1 인스턴스 변수 속도 초기화 */
		machine.setSpeed(10);
		
		/** RunningMachineV1 메소드 호출
		 * @param machine RunningMachineV1 클래스 인스턴스
		 */
		machine.play(machine);
	}

}
