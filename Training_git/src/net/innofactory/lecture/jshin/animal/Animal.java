package net.innofactory.lecture.jshin.animal;

public class Animal {
	
	/** 체중 */
	private int weight;
	
	/**
	 * 디폴트 생성자
	 */
	public Animal() {
		super();
	}
	
	/** 
	 * run 메소드
	 */
	public void run() {
		System.out.println("뛰다!");
	}

	/**
	 * @return weight 체중
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @param weight 체중
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	} 
	
	
}
