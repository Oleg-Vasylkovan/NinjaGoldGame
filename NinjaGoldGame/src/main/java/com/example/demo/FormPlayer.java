package com.example.demo;

import java.util.ArrayList;

public class FormPlayer {
	public Integer gold = 0;
	public ArrayList<String> msg;
	
	
	public FormPlayer() {
		this.msg=new ArrayList<String>();
	}

	public void addmsg(String msg1) {
		msg.add(msg1);
	}
	
	public Integer getGold() {
		return gold;
	}

	public void setGold(Integer gold) {
		this.gold = gold;
	}

	public ArrayList<String> getMsg() {
		return msg;
	}

	public void setMsg(ArrayList<String> msg) {
		this.msg = msg;
	}
	
}
