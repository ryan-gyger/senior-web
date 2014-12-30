package org.nized.web.domain;

import java.util.Date;
import java.util.List;

public class Announcement {

	private int id;
	private Person creator; // email of person who created it is what's passed to serializer
	private String title;
	private String text;
	private Date start_date;
	private Date end_date;
	private List<Role> roles;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Person getCreator() {
		return creator;
	}

	public void setCreator(Person creator) {
		this.creator = creator;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getStartDate() {
		return start_date;
	}

	public void setStartDate(Date startDate) {
		this.start_date = startDate;
	}

	public Date getEndDate() {
		return end_date;
	}

	public void setEndDate(Date endDate) {
		this.end_date = endDate;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((creator == null) ? 0 : creator.hashCode());
		result = prime * result + ((end_date == null) ? 0 : end_date.hashCode());
		result = prime * result + id;
		result = prime * result + ((roles == null) ? 0 : roles.hashCode());
		result = prime * result + ((start_date == null) ? 0 : start_date.hashCode());
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Announcement other = (Announcement) obj;
		if (creator == null) {
			if (other.creator != null) {
				return false;
			}
		} else if (!creator.equals(other.creator)) {
			return false;
		}
		if (end_date == null) {
			if (other.end_date != null) {
				return false;
			}
		} else if (!end_date.equals(other.end_date)) {
			return false;
		}
		if (id != other.id) {
			return false;
		}
		if (roles == null) {
			if (other.roles != null) {
				return false;
			}
		} else if (!roles.equals(other.roles)) {
			return false;
		}
		if (start_date == null) {
			if (other.start_date != null) {
				return false;
			}
		} else if (!start_date.equals(other.start_date)) {
			return false;
		}
		if (text == null) {
			if (other.text != null) {
				return false;
			}
		} else if (!text.equals(other.text)) {
			return false;
		}
		if (title == null) {
			if (other.title != null) {
				return false;
			}
		} else if (!title.equals(other.title)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Announcement [id=" + id + ", creator=" + creator + ", title=" + title + ", text="
				+ text + ", startDate=" + start_date + ", endDate=" + end_date + ", roles=" + roles
				+ "]";
	}

}
