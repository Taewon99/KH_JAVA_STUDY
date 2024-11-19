package Test;

public class SelectStudent implements StudentPredicate{

	@Override
	public boolean test(Student student, int no) {
		return student.getNo() == no;
	}

}
