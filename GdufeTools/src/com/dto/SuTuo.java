package com.dto;

public class SuTuo {

	String name;
	String requireScore;
	String score;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRequireScore() {
		return requireScore;
	}

	public void setRequireScore(String requireScore) {
		this.requireScore = requireScore;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "SuTuo [name=" + name + ", requireScore=" + requireScore + ", score=" + score + "]";
	}
}
