package com.dto;

public class Book {

	String barId;
	String name;
	String author;
	String borrowedTime;
	String returnTime;
	String renewTimes;
	String location;
	String checkId;

	public String getBarId() {
		return barId;
	}

	public void setBarId(String barId) {
		this.barId = barId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBorrowedTime() {
		return borrowedTime;
	}

	public void setBorrowedTime(String borrowedTime) {
		this.borrowedTime = borrowedTime;
	}

	public String getReturnTime() {
		return returnTime;
	}

	public void setReturnTime(String returnTime) {
		this.returnTime = returnTime;
	}

	public String getRenewTimes() {
		return renewTimes;
	}

	public void setRenewTimes(String renewTimes) {
		this.renewTimes = renewTimes;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCheckId() {
		return checkId;
	}

	public void setCheckId(String checkId) {
		this.checkId = checkId;
	}

	@Override
	public String toString() {
		return "Book [barId=" + barId + ", name=" + name + ", author=" + author + ", borrowedTime=" + borrowedTime
				+ ", returnTime=" + returnTime + ", renewTimes=" + renewTimes + ", location=" + location + ", checkId="
				+ checkId + "]";
	}
}
