
package com.howtodoinjava.demo.model;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.Map;

@DynamicUpdate
@Data
@NoArgsConstructor
@ToString
@Table(name = "LOANS")
@Entity
public class Loans {
	
		
	@Id
	@Column(name = "LOAN_ID")
	private Long loanId;
    
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "LOAN_ID")
	@MapKey(name = "dvpParticipantName")
	//@LazyCollection(LazyCollectionOption.FALSE)
	private Map<String, DVLoanParticipants> dvLoanParticipantsMap;

	public Long getLoanId() {
		return loanId;
	}

	public void setLoanId(Long loanId) {
		this.loanId = loanId;
	}

	public Map<String, DVLoanParticipants> getDvLoanParticipantsMap() {
		return dvLoanParticipantsMap;
	}

	public void setDvLoanParticipantsMap(Map<String, DVLoanParticipants> dvLoanParticipantsMap) {
		this.dvLoanParticipantsMap = dvLoanParticipantsMap;
	}
}
