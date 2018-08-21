package net.innofactory.lecture.jshin.animal;

public class Dog extends Animal{
	
	/** 품종*/
	private String kind;
	
	/**
	 * 디폴트 생성자
	 */
	public Dog() {
		super();
	}

	/**
	 * bark 메소드
	 */
	public void bark() {
		System.out.println("짖는다!");
	}
	
	/**
	 * @return kind 품종
	 */
	public String getKind() {
		return kind;
	}

	/**
	 * @param kind 품종
	 */
	public void setKind(String kind) {
		this.kind = kind;
	}

	/**
	 * main 메소드
	 */
	public static void main(String[] args) {
		
		/** Dog 클래스 인스턴스 */
		Dog dog = new Dog();
		
		/** Dog클래스내 bark 메소드 호출 */
		dog.bark();
		
		/** Animal클래스 run 메소드 호출 */
		dog.run();
	}

}
