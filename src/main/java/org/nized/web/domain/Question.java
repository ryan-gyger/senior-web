package org.nized.web.domain;

import java.util.List;

public class Question {

	/*
	 * id survey_id question_text type possible_answers roles
	 */

	private int id;
	private int surveyId;
	private String questionText;
	private List<PossibleAnswer> possibleAnswers;
	private List<String> roles;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(int surveyId) {
		this.surveyId = surveyId;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public List<PossibleAnswer> getPossibleAnswers() {
		return possibleAnswers;
	}

	public void setPossibleAnswers(List<PossibleAnswer> possibleAnswers) {
		this.possibleAnswers = possibleAnswers;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((possibleAnswers == null) ? 0 : possibleAnswers.hashCode());
		result = prime * result + ((questionText == null) ? 0 : questionText.hashCode());
		result = prime * result + ((roles == null) ? 0 : roles.hashCode());
		result = prime * result + surveyId;
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
		Question other = (Question) obj;
		if (id != other.id) {
			return false;
		}
		if (possibleAnswers == null) {
			if (other.possibleAnswers != null) {
				return false;
			}
		} else if (!possibleAnswers.equals(other.possibleAnswers)) {
			return false;
		}
		if (questionText == null) {
			if (other.questionText != null) {
				return false;
			}
		} else if (!questionText.equals(other.questionText)) {
			return false;
		}
		if (roles == null) {
			if (other.roles != null) {
				return false;
			}
		} else if (!roles.equals(other.roles)) {
			return false;
		}
		if (surveyId != other.surveyId) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", surveyId=" + surveyId + ", questionText=" + questionText
				+ ", possibleAnswers=" + possibleAnswers + ", roles=" + roles + "]";
	}

}
