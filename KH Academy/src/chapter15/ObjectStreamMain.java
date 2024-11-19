package chapter15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fos = new FileOutputStream("object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		Student stu = new Student(10, "kdj", 100);
		oos.writeObject(stu);

		oos.close();
		fos.close();

		System.out.println("the end");

		FileInputStream fis = new FileInputStream("object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Object object = ois.readObject();

		if (object instanceof Student) {
			Student stu2 = (Student) object;
			System.out.println(stu2);
		} else {
			System.out.println("��ü�ӿ� student Ÿ���� �����ϴ�." + object.toString());
		}
		ois.close();
		fis.close();
		System.out.println("the end");
	}

}
