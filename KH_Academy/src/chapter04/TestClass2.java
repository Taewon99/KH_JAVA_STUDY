package chapter04;

public class TestClass2 {

	public static void main(String[] args) {
		Student lee = new Student("UW Madison","01", "이태원", 26, 3);
		Student kim = new Student( );
		
		kim.setSchool("KH정보교육원");
		kim.setStudentNum("00");
		kim.setName("김길동");
		kim.setAge(25);
		kim.setGrade(2);
		
		System.out.println(lee.getAll());
		System.out.println(kim.getAll());
		
		
	}

}
