package com.wangnan.backend.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;


@Entity
@Table(name="TaskList")
public class TaskStore {

	private long tid;
	private String tname;
	@Column(columnDefinition="long varchar")
	private String tcontent;
	private int priority;
	private Date timestamp;
	@Id
	@GeneratedValue
	public long getTid() {
		return tid;
	}
	public void setTid(long tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	@Lob
	public String getTcontent() {
		return tcontent;
	}
	@Lob
	public void setTcontent(String tcontent) {
		this.tcontent = tcontent;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
}
