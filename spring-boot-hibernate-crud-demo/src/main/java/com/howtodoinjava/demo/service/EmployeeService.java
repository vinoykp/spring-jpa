package com.howtodoinjava.demo.service;

import java.util.*;

import com.howtodoinjava.demo.model.DVLoanParticipants;
import com.howtodoinjava.demo.model.Loans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.howtodoinjava.demo.repository.EmployeeRepository;
 
@Service
public class EmployeeService {
     
    @Autowired
    EmployeeRepository repository;
     
    public List<Loans> getAllEmployees()
    {
        List<Loans> employeeList = repository.findAll();
         
        if(employeeList.size() > 0) {
            return employeeList;
        } else {
            return new ArrayList<Loans>();
        }
    }
     

     
    public Loans createOrUpdateEmployee()
    {
        Optional<Loans> loans = repository.findById(Long.valueOf("196801757")); // 196801757 inserted while running the application , and its using for updating the value.
        // 196801758 is using for insertion , which is failing
            if(!loans.isPresent()){ // insert
                DVLoanParticipants dvLoanParticipants = new DVLoanParticipants();
                dvLoanParticipants.setLoanId(Long.valueOf("196801758"));
                dvLoanParticipants.setDvpParticipantName("VKP");
                dvLoanParticipants.setDvpParticipantType("Developer");
                Loans loanInsert = new Loans();
                loanInsert.setLoanId(Long.valueOf("196801758"));
                Map<String,DVLoanParticipants> partyMap = new HashMap<>();
                partyMap.put("VKP",dvLoanParticipants);
                loanInsert.setDvLoanParticipantsMap(partyMap);
                repository.saveAndFlush(loanInsert);
            }
            /*else{
                Loans loan = loans.get();
                DVLoanParticipants dvLoanParticipants = new DVLoanParticipants();
                dvLoanParticipants.setLoanId(Long.valueOf("196801757"));
                dvLoanParticipants.setDvpParticipantName("VKP_Update");
                dvLoanParticipants.setDvpParticipantType("Developer_Update");
                Map<String,DVLoanParticipants> partyMap = new HashMap<>();
                partyMap.put("VKP",dvLoanParticipants);
                loan.setDvLoanParticipantsMap(partyMap);
                repository.save(loan);
            }*/

             
            return null;

    }

}