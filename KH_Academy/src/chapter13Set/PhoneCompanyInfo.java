package chapter13Set;

import java.util.Objects;

public class PhoneCompanyInfo extends PhoneInfo {
	private String company;

	public PhoneCompanyInfo(String name, String phoneNumber, String company) {
		super(name, phoneNumber);
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "PhoneCompanyInfo [" + company + ", " + getName() + ", " + getPhoneNumber() + "]";
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
		PhoneInfo pi = (PhoneInfo) obj;
		return this.getPhoneNumber().equals(pi.getPhoneNumber());
	}

}
