package animal;

import runnig.Runner;

public class Robot implements Runner {
	
	/** 건전지 갯수 */
	private int batteryCount;
	
	/**
	 * 디폴트 생성자
	 */
	public Robot() {
		super();
	}
	
	/**
	 * @return batteryCount 건전지 갯수
	 */
	public int getBatteryCount() {
		return batteryCount;
	}

	/**
	 * @param batteryCount 건전지 갯수
	 */
	public void setBatteryCount(int batteryCount) {
		this.batteryCount = batteryCount;
	}
	
	/** 
	 * run 메소드
	 */
	public void run() {
		System.out.println("뛰다!");
	}

	/**
	 * main 메소드
	 */
	public static void main(String[] args) {
		
		// Animal클래 인스턴스  
		Robot robot = new Robot();
		
		// Animal 클래스내 run 메소드 호출 
		robot.run();
		
	}

}
