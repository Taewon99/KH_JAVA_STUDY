package chapter04;

public class TestClass2 {

	public static void main(String[] args) {
		Student lee = new Student("UW Madison","01", "���¿�", 26, 3);
		Student kim = new Student( );
		
		kim.setSchool("KH����������");
		kim.setStudentNum("00");
		kim.setName("��浿");
		kim.setAge(25);
		kim.setGrade(2);
		
		System.out.println(lee.getAll());
		System.out.println(kim.getAll());
		
		
	}

}
