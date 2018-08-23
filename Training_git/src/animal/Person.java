package animal;

public class Person {

	private String name;	//이름
	private String gender;	//성별
	private int age;		//나이
	
	
	//main 메쏘드 
		public static void main(String[] args) {

			// 이름 "홍길동", 나이 18세, 성별은 남자 Person형 객체 hong 생성
			Person hong = new Person("홍길동", "남자", 18);	
			// args배열의 첫번쨰 요소가 walk경우 walk 메소드 실행
			if( args[0].equals("walk")) { 
				hong.walk();
			//args배열의 첫번쨰 요소가 walk아닌경우 say 메소드 실행
			}else {
				hong.say(args[0]);
			}
			
		}
	
	
	// 인자가 없는 디폴트 생성자
	public Person() {		
		super();
	}
	
	//name, gender, age 를 인자로 받는 생성자
	public Person(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	// walk 메소드
	public void walk() {
		System.out.println("walk 메쏘드");
	}
	// say 메소드 word 인자를 받아 출력 가능
	public void say( String word ) {
		System.out.println("say 메쏘드 : " + word);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	

	
}
