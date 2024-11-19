package PhoneInfo;

public class PhoneInfo {
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

}
