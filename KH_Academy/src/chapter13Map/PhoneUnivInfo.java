package chapter13Map;

import java.util.Objects;

public class PhoneUnivInfo extends PhoneInfo {

	private String major;
	private int year;

	public PhoneUnivInfo(String name, String phoneNumber, String major, int year) {
		super(name, phoneNumber);
		this.major = major;
		this.year = year;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "PhoneUnivInfo [" + major + ", " + year + ", " + getName() + ", " + getPhoneNumber() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getPhoneNumber());
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof PhoneInfo)) {
			return false;
		}
		PhoneUnivInfo pi = (PhoneUnivInfo) obj;
		return this.getPhoneNumber().equals(pi.getPhoneNumber());
	}


}
