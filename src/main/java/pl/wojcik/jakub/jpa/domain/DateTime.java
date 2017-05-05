package pl.wojcik.jakub.jpa.domain;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class DateTime {

	@Id
	private long id;
	private Date date;
	private Time time;
	private Timestamp timestamp;

	@Temporal(TemporalType.DATE)
	private java.util.Date utilDate;

	@Temporal(TemporalType.TIME)
	private java.util.Date utilTime;

	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date utilTimestamp;

	@Temporal(TemporalType.DATE)
	private java.util.Calendar utilCalendar;

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public java.util.Date getUtilDate() {
		return utilDate;
	}

	public void setUtilDate(java.util.Date utilDate) {
		this.utilDate = utilDate;
	}

	public java.util.Date getUtilTime() {
		return utilTime;
	}

	public void setUtilTime(java.util.Date utilTime) {
		this.utilTime = utilTime;
	}

	public java.util.Date getUtilTimestamp() {
		return utilTimestamp;
	}

	public void setUtilTimestamp(java.util.Date utilTimestamp) {
		this.utilTimestamp = utilTimestamp;
	}

	public java.util.Calendar getUtilCalendar() {
		return utilCalendar;
	}

	public void setUtilCalendar(java.util.Calendar utilCalendar) {
		this.utilCalendar = utilCalendar;
	}

}
