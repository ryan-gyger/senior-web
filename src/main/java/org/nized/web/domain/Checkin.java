package org.nized.web.domain;

import java.util.Date;

public class Checkin {

	private String email;
	private Date dateScanned;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateScanned() {
		return dateScanned;
	}

	public void setDateScanned(Date dateScanned) {
		this.dateScanned = dateScanned;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateScanned == null) ? 0 : dateScanned.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
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
		Checkin other = (Checkin) obj;
		if (dateScanned == null) {
			if (other.dateScanned != null) {
				return false;
			}
		} else if (!dateScanned.equals(other.dateScanned)) {
			return false;
		}
		if (email == null) {
			if (other.email != null) {
				return false;
			}
		} else if (!email.equals(other.email)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Checkin [email=" + email + ", dateScanned=" + dateScanned + "]";
	}

}
