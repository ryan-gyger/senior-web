package org.nized.web.domain;

public class ClassBonus {

	/*
	 * id course_code semester
	 */

	private int id;
	private String courseCode;
	private String semester;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
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
		result = prime * result + ((courseCode == null) ? 0 : courseCode.hashCode());
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
		if (courseCode == null) {
			if (other.courseCode != null) {
				return false;
			}
		} else if (!courseCode.equals(other.courseCode)) {
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
		return "ClassBonus [id=" + id + ", courseCode=" + courseCode + ", semester=" + semester
				+ "]";
	}

}
