package Test;

public class ObjectMain {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student stu = new Student(1, "이태원", 50, 50, 50);
		Student stu2 = new Student(1, "이태원", 50, 50, 50);
		Student stu3 = (Student) stu2.clone();

		System.out.println(stu);
		System.out.println("" + stu.equals(stu2));

		System.out.println(stu.hashCode());
		System.out.println(stu2.hashCode());
		System.out.println(stu3.hashCode());
	}
}
