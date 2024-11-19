package chapter07;

import java.util.ArrayList;

public class ShpaeMain {

	public static void main(String[] args) {
		ArrayList<Shape> list = new ArrayList<Shape>();
		list.add(new Rectangle(10, 20));
		list.add(new Circle(10, 20, 7));
		
		for(Shape data : list) {
			data.draw();
		}

	}

}
