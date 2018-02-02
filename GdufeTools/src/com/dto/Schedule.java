package com.dto;

public class Schedule {

	String name;
	String teacher;
	String period;
	String location;
	String dayInWeek;
	String startSec;
	String endSec;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDayInWeek() {
		return dayInWeek;
	}

	public void setDayInWeek(String dayInWeek) {
		this.dayInWeek = dayInWeek;
	}

	public String getStartSec() {
		return startSec;
	}

	public void setStartSec(String startSec) {
		this.startSec = startSec;
	}

	public String getEndSec() {
		return endSec;
	}

	public void setEndSec(String endSec) {
		this.endSec = endSec;
	}

	@Override
	public String toString() {
		return "Schedule [name=" + name + ", teacher=" + teacher + ", period=" + period + ", location=" + location
				+ ", dayInWeek=" + dayInWeek + ", startSec=" + startSec + ", endSec=" + endSec + "]";
	}
}
