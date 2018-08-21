package net.innofactory.lecture.jshin.animal;

public class Robot {
	
	/** batteryCount 건전지 갯수 */
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
	 * main 메소드
	 */
	public static void main(String[] args) {
		
		/** Animal클래 인스턴스 
		 * Robot 클래스는 Animal 클래스와 포함관계로 상속이 아닌 인스턴스 사용
		 */
		Animal animal = new Animal();
		
		/** Animal 클래스내 run 메소드 호출 */
		animal.run();
		
	}

}
