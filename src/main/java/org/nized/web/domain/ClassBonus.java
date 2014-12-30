package org.nized.web.domain;

public class ClassBonus {

	/* 
	 * 
	 */

	private int id;
	private String course_code;
	private String semester;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseCode() {
		return course_code;
	}

	public void setCourseCode(String courseCode) {
		this.course_code = courseCode;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((course_code == null) ? 0 : course_code.hashCode());
		result = prime * result + id;
		result = prime * result + ((semester == null) ? 0 : semester.hashCode());
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
		ClassBonus other = (ClassBonus) obj;
		if (course_code == null) {
			if (other.course_code != null) {
				return false;
			}
		} else if (!course_code.equals(other.course_code)) {
			return false;
		}
		if (id != other.id) {
			return false;
		}
		if (semester == null) {
			if (other.semester != null) {
				return false;
			}
		} else if (!semester.equals(other.semester)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "ClassBonus [id=" + id + ", courseCode=" + course_code + ", semester=" + semester
				+ "]";
	}

}
