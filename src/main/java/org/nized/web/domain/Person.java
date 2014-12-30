package org.nized.web.domain;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
@JsonDeserialize
public class Person {

	private String email;
	private String password;
	private String first_name;
	private String last_name;
	private Date expire_date;
	private String mobile_number;
	private localPaidEnum is_local_paid;
	private boolean is_member;
	private classYearEnum class_year;
	private Date last_sync_date;
	private List<Checkin> checkins;
	private List<ClassBonus> class_bonuses;
	private List<Role> roles;

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
		return first_name;
	}

	public void setFirstName(String firstName) {
		this.first_name = firstName;
	}

	public String getLastName() {
		return last_name;
	}

	public void setLastName(String lastName) {
		this.last_name = lastName;
	}

	public Date getExpireDate() {
		return expire_date;
	}

	public void setExpireDate(Date expireDate) {
		this.expire_date = expireDate;
	}

	public String getMobileNumber() {
		return mobile_number;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobile_number = mobileNumber;
	}

	public localPaidEnum isLocalPaid() {
		return is_local_paid;
	}

	public void setLocalPaid(localPaidEnum isLocalPaid) {
		this.is_local_paid = isLocalPaid;
	}

	public boolean isMember() {
		return is_member;
	}

	public void setMember(boolean isMember) {
		this.is_member = isMember;
	}

	public classYearEnum getClassYear() {
		return class_year;
	}

	public void setClassYear(classYearEnum classYear) {
		this.class_year = classYear;
	}

	public Date getLastSyncDate() {
		return last_sync_date;
	}

	public void setLastSyncDate(Date lastSyncDate) {
		this.last_sync_date = lastSyncDate;
	}

	public List<Checkin> getCheckins() {
		return checkins;
	}

	public void setCheckins(List<Checkin> checkins) {
		this.checkins = checkins;
	}

	public List<ClassBonus> getClassBonuses() {
		return class_bonuses;
	}

	public void setClassBonuses(List<ClassBonus> classBonuses) {
		this.class_bonuses = classBonuses;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public enum classYearEnum {
		FRESHMAN, SOPHOMORE, JUNIOR, SENIOR
	}

	public enum localPaidEnum {
		TRUE, FALSE, PENDING
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((checkins == null) ? 0 : checkins.hashCode());
		result = prime * result + ((class_bonuses == null) ? 0 : class_bonuses.hashCode());
		result = prime * result + ((class_year == null) ? 0 : class_year.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((expire_date == null) ? 0 : expire_date.hashCode());
		result = prime * result + ((first_name == null) ? 0 : first_name.hashCode());
		result = prime * result + ((is_local_paid == null) ? 0 : is_local_paid.hashCode());
		result = prime * result + (is_member ? 1231 : 1237);
		result = prime * result + ((last_name == null) ? 0 : last_name.hashCode());
		result = prime * result + ((last_sync_date == null) ? 0 : last_sync_date.hashCode());
		result = prime * result + ((mobile_number == null) ? 0 : mobile_number.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((roles == null) ? 0 : roles.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Person other = (Person) obj;
		if (checkins == null) {
			if (other.checkins != null) {
				return false;
			}
		} else if (!checkins.equals(other.checkins)) {
			return false;
		}
		if (class_bonuses == null) {
			if (other.class_bonuses != null) {
				return false;
			}
		} else if (!class_bonuses.equals(other.class_bonuses)) {
			return false;
		}
		if (class_year != other.class_year) {
			return false;
		}
		if (email == null) {
			if (other.email != null) {
				return false;
			}
		} else if (!email.equals(other.email)) {
			return false;
		}
		if (expire_date == null) {
			if (other.expire_date != null) {
				return false;
			}
		} else if (!expire_date.equals(other.expire_date)) {
			return false;
		}
		if (first_name == null) {
			if (other.first_name != null) {
				return false;
			}
		} else if (!first_name.equals(other.first_name)) {
			return false;
		}
		if (is_local_paid != other.is_local_paid) {
			return false;
		}
		if (is_member != other.is_member) {
			return false;
		}
		if (last_name == null) {
			if (other.last_name != null) {
				return false;
			}
		} else if (!last_name.equals(other.last_name)) {
			return false;
		}
		if (last_sync_date == null) {
			if (other.last_sync_date != null) {
				return false;
			}
		} else if (!last_sync_date.equals(other.last_sync_date)) {
			return false;
		}
		if (mobile_number == null) {
			if (other.mobile_number != null) {
				return false;
			}
		} else if (!mobile_number.equals(other.mobile_number)) {
			return false;
		}
		if (password == null) {
			if (other.password != null) {
				return false;
			}
		} else if (!password.equals(other.password)) {
			return false;
		}
		if (roles == null) {
			if (other.roles != null) {
				return false;
			}
		} else if (!roles.equals(other.roles)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Person [email=" + email + ", password=" + password + ", firstName=" + first_name
				+ ", lastName=" + last_name + ", expireDate=" + expire_date + ", mobileNumber="
				+ mobile_number + ", isLocalPaid=" + is_local_paid + ", isMember=" + is_member
				+ ", classYear=" + class_year + ", lastSyncDate=" + last_sync_date + ", checkins="
				+ checkins + ", classBonuses=" + class_bonuses + ", roles=" + roles + "]";
	};

}
