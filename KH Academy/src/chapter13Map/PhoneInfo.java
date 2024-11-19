package chapter13Map;

import java.util.Objects;

public class PhoneInfo implements Comparable<PhoneInfo> {
	private String name, phoneNumber, birthday;

	public PhoneInfo(String name, String phoneNumber) {
		this(name, phoneNumber, null);
	}

	public PhoneInfo(String name, String phoneNumber, String birthday) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "PhoneInfo [" + name + ", " + phoneNumber + ", " + birthday + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(phoneNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof PhoneInfo)) {
			return false;
		}
		PhoneInfo pi = (PhoneInfo) obj;
		return this.phoneNumber.equals(pi.phoneNumber);
	}

	@Override
	public int compareTo(PhoneInfo o) {
		return this.phoneNumber.compareTo(o.phoneNumber);
	}



}
