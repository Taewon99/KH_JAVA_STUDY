package chapter06;

import java.util.Arrays;
import java.util.List;

public class Card {
	private List<String> type, num;

	public Card() {
		super();
		type = Arrays.asList("클로버", "다이아몬드", "하트", "스페이드");
		num =  Arrays.asList("에이스", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen",
				"King");
	}

	public List<String> getType() {
		return type;
	}

	public void setType(List<String> type) {
		this.type = type;
	}

	public List<String> getNum() {
		return num;
	}

	public void setNum(List<String> num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Card [type=" + type + ", num=" + num + "]";
	}


}
