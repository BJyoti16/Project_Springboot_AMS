package com.digipods.agency.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="agencydetails")
public class Agency {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long agencyid;
	private String agencyname;
	private String agencytype;
	private String agencyaddress;
	private String agencydesc;
	private LocalDateTime  createddate;
	private LocalDateTime  modifieddate;

	public Agency() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Agency(long agencyid, String agencyname, String agencytype, String agencyaddress, String agencydesc,
			LocalDateTime createddate, LocalDateTime modifieddate) {
		super();
		this.agencyid = agencyid;
		this.agencyname = agencyname;
		this.agencytype = agencytype;
		this.agencyaddress = agencyaddress;
		this.agencydesc = agencydesc;
		this.createddate = createddate;
		this.modifieddate = modifieddate;
	}
	
	public long getAgencyid() {
		return agencyid;
	}
	public void setAgencyid(long agencyid) {
		this.agencyid = agencyid;
	}
	public String getAgencyname() {
		return agencyname;
	}
	public void setAgencyname(String agencyname) {
		this.agencyname = agencyname;
	}
	public String getAgencytype() {
		return agencytype;
	}
	public void setAgencytype(String agencytype) {
		this.agencytype = agencytype;
	}
	public String getAgencyaddress() {
		return agencyaddress;
	}
	public void setAgencyaddress(String agencyaddress) {
		this.agencyaddress = agencyaddress;
	}
	public String getAgencydesc() {
		return agencydesc;
	}
	public void setAgencydesc(String agencydesc) {
		this.agencydesc = agencydesc;
	}
	public LocalDateTime getCreateddate() {
		return createddate;
	}
	public void setCreateddate(LocalDateTime createddate) {
		this.createddate = createddate;
	}
	public LocalDateTime getModifieddate() {
		return modifieddate;
	}
	public void setModifieddate(LocalDateTime modifieddate) {
		this.modifieddate = modifieddate;
	}
	
	
	
	
}
