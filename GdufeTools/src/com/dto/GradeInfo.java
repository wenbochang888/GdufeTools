package com.dto;

public class GradeInfo {

	String name;
	String time;
	int score;
	float credit;
	int classCode;
	int dailyScore;
	int expScore;
	int paperScore;
	String examType;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public float getCredit() {
		return credit;
	}

	public void setCredit(float credit) {
		this.credit = credit;
	}

	public int getClassCode() {
		return classCode;
	}

	public void setClassCode(int classCode) {
		this.classCode = classCode;
	}

	public int getDailyScore() {
		return dailyScore;
	}

	public void setDailyScore(int dailyScore) {
		this.dailyScore = dailyScore;
	}

	public int getExpScore() {
		return expScore;
	}

	public void setExpScore(int expScore) {
		this.expScore = expScore;
	}

	public int getPaperScore() {
		return paperScore;
	}

	public void setPaperScore(int paperScore) {
		this.paperScore = paperScore;
	}

	public String getExamType() {
		return examType;
	}

	public void setExamType(String examType) {
		this.examType = examType;
	}

	@Override
	public String toString() {
		return "GradeInfo [name=" + name + ", time=" + time + ", score=" + score + ", credit=" + credit + ", classCode="
				+ classCode + ", dailyScore=" + dailyScore + ", expScore=" + expScore + ", paperScore=" + paperScore
				+ ", examType=" + examType + "]";
	}
}
