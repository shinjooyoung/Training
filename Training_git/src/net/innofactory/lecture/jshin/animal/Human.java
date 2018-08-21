package net.innofactory.lecture.jshin.animal;

public class Human extends Animal{

	/** 혈액형 */
	private String bloodType;
	
	/** 이름 */
	private String name;
	
	/**
	 * 디폴트 생성자
	 */
	public Human() {
		super();
	}

	/**
	 * woard 메소드
	 * @param word 말하다
	 */
	public void say( String word ) {
		System.out.println(word);
	}
	
	/**
	 * @return bloodType 혈액형
	 */
	public String getBloodType() {
		return bloodType;
	}

	/**
	 * @param bloodType 혈액형
	 */
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	
	/**
	 * @return name 이름
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name 이름
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * main 메소드
	 */
	public static void main(String[] args) {
		
		/** Human 클래스 인스턴스 */
		Human human = new Human();
		
		/** Human 클래스내 say 메소드 호출 */
		human.say("안녕하세요");
		
		/** Animal 클래스내 run 메소드 호출 */
		human.run();

	}

}
