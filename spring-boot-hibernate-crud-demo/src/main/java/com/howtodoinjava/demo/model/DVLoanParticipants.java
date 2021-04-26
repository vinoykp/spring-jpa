package com.howtodoinjava.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@DynamicUpdate
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "DV_LOAN_PARTICIPANTS")
@Entity
public class DVLoanParticipants implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "LOAN_ID")
	private Long loanId;

	@Id
	@Column(name = "DVP_PARTICIPANT_NAME")
	private String dvpParticipantName;


	@Column(name = "DVP_PARTICIPANT_TYPE")
	private String dvpParticipantType;

	//@ManyToOne
	//@JoinColumn(name="LOAN_ID", insertable = false, updatable = false)
	//private Loans loans;

	public Long getLoanId() {
		return loanId;
	}

	public void setLoanId(Long loanId) {
		this.loanId = loanId;
	}

	public String getDvpParticipantName() {
		return dvpParticipantName;
	}

	public void setDvpParticipantName(String dvpParticipantName) {
		this.dvpParticipantName = dvpParticipantName;
	}

	public String getDvpParticipantType() {
		return dvpParticipantType;
	}

	public void setDvpParticipantType(String dvpParticipantType) {
		this.dvpParticipantType = dvpParticipantType;
	}





}
