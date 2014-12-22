package org.nized.web.domain;

public class Note {

	/*
	 * id person_email public_to_person title text
	 */

	private int id;
	private String personEmail;
	private String publicToPerson;
	private String title;
	private String text;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPersonEmail() {
		return personEmail;
	}

	public void setPersonEmail(String personEmail) {
		this.personEmail = personEmail;
	}

	public String getPublicToPerson() {
		return publicToPerson;
	}

	public void setPublicToPerson(String publicToPerson) {
		this.publicToPerson = publicToPerson;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((personEmail == null) ? 0 : personEmail.hashCode());
		result = prime * result + ((publicToPerson == null) ? 0 : publicToPerson.hashCode());
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
		Note other = (Note) obj;
		if (id != other.id) {
			return false;
		}
		if (personEmail == null) {
			if (other.personEmail != null) {
				return false;
			}
		} else if (!personEmail.equals(other.personEmail)) {
			return false;
		}
		if (publicToPerson == null) {
			if (other.publicToPerson != null) {
				return false;
			}
		} else if (!publicToPerson.equals(other.publicToPerson)) {
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
		return "Note [id=" + id + ", personEmail=" + personEmail + ", publicToPerson="
				+ publicToPerson + ", title=" + title + ", text=" + text + "]";
	}

}
