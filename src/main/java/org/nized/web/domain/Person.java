package org.nized.web.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.nized.web.api.PersonDeserializer;
import org.nized.web.api.PersonSerializer;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using = PersonSerializer.class)
@JsonDeserialize(using = PersonDeserializer.class)
public class Person {

	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private Date expireDate;
	private BigDecimal mobileNumber;
	private boolean isLocalPaid;
	private boolean isMember;
	private classYearEnum classYear;
	private Date lastSyncDate;
	private List<Checkin> checkins;
	private List<String> classBonuses;
	private List<String> roles;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public BigDecimal getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(BigDecimal mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public boolean isLocalPaid() {
		return isLocalPaid;
	}

	public void setLocalPaid(boolean isLocalPaid) {
		this.isLocalPaid = isLocalPaid;
	}

	public boolean isMember() {
		return isMember;
	}

	public void setMember(boolean isMember) {
		this.isMember = isMember;
	}

	public classYearEnum getClassYear() {
		return classYear;
	}

	public void setClassYear(classYearEnum classYear) {
		this.classYear = classYear;
	}

	public Date getLastSyncDate() {
		return lastSyncDate;
	}

	public void setLastSyncDate(Date lastSyncDate) {
		this.lastSyncDate = lastSyncDate;
	}

	public List<Checkin> getCheckins() {
		return checkins;
	}

	public void setCheckins(List<Checkin> checkins) {
		this.checkins = checkins;
	}

	public List<String> getClassBonuses() {
		return classBonuses;
	}

	public void setClassBonuses(List<String> classBonuses) {
		this.classBonuses = classBonuses;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public enum classYearEnum {
		FRESHMAN, SOPHOMORE, JUNIOR, SENIOR
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((checkins == null) ? 0 : checkins.hashCode());
		result = prime * result + ((classBonuses == null) ? 0 : classBonuses.hashCode());
		result = prime * result + ((classYear == null) ? 0 : classYear.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((expireDate == null) ? 0 : expireDate.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + (isLocalPaid ? 1231 : 1237);
		result = prime * result + (isMember ? 1231 : 1237);
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((lastSyncDate == null) ? 0 : lastSyncDate.hashCode());
		result = prime * result + ((mobileNumber == null) ? 0 : mobileNumber.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((roles == null) ? 0 : roles.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (checkins == null) {
			if (other.checkins != null)
				return false;
		} else if (!checkins.equals(other.checkins))
			return false;
		if (classBonuses == null) {
			if (other.classBonuses != null)
				return false;
		} else if (!classBonuses.equals(other.classBonuses))
			return false;
		if (classYear != other.classYear)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (expireDate == null) {
			if (other.expireDate != null)
				return false;
		} else if (!expireDate.equals(other.expireDate))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (isLocalPaid != other.isLocalPaid)
			return false;
		if (isMember != other.isMember)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (lastSyncDate == null) {
			if (other.lastSyncDate != null)
				return false;
		} else if (!lastSyncDate.equals(other.lastSyncDate))
			return false;
		if (mobileNumber == null) {
			if (other.mobileNumber != null)
				return false;
		} else if (!mobileNumber.equals(other.mobileNumber))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (roles == null) {
			if (other.roles != null)
				return false;
		} else if (!roles.equals(other.roles))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [email=" + email + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", expireDate=" + expireDate + ", mobileNumber="
				+ mobileNumber + ", isLocalPaid=" + isLocalPaid + ", isMember=" + isMember
				+ ", classYear=" + classYear + ", lastSyncDate=" + lastSyncDate + ", checkins="
				+ checkins + ", classBonuses=" + classBonuses + ", roles=" + roles + "]";
	};

}
