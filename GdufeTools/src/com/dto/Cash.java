package com.dto;

public class Cash {

	String cardNum;
	String cash;
	String cardState;
	String checkState;
	String lossState;
	String freezeState;

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public String getCash() {
		return cash;
	}

	public void setCash(String cash) {
		this.cash = cash;
	}

	public String getCardState() {
		return cardState;
	}

	public void setCardState(String cardState) {
		this.cardState = cardState;
	}

	public String getCheckState() {
		return checkState;
	}

	public void setCheckState(String checkState) {
		this.checkState = checkState;
	}

	public String getLossState() {
		return lossState;
	}

	public void setLossState(String lossState) {
		this.lossState = lossState;
	}

	public String getFreezeState() {
		return freezeState;
	}

	public void setFreezeState(String freezeState) {
		this.freezeState = freezeState;
	}

	@Override
	public String toString() {
		return "Cash [cardNum=" + cardNum + ", cash=" + cash + ", cardState=" + cardState + ", checkState=" + checkState
				+ ", lossState=" + lossState + ", freezeState=" + freezeState + "]";
	}
}
