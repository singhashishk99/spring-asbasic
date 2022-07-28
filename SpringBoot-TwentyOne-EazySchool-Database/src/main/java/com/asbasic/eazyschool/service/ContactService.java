package com.asbasic.eazyschool.service;

import com.asbasic.eazyschool.constants.EazySchoolConstants;
import com.asbasic.eazyschool.model.Contact;
import com.asbasic.eazyschool.repository.ContactRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/*
@Slf4j, is a Lombok-provided annotation that will automatically generate an SLF4J
Logger static property in the class at compilation time.
* */
@Slf4j
// service layer - for processing the business logic post controller layer passed the control
@Service
//@RequestScope
//@SessionScope
//@ApplicationScope
public class ContactService {
    /*
    * save contact details into DB
    * @param contact
    * @return boolean
     */
    @Autowired
    private ContactRepository contactRepository;

    public boolean saveMessageDetails(Contact contact){
        boolean isSaved = false;
        contact.setStatus(EazySchoolConstants.OPEN);
        contact.setCreatedBy(EazySchoolConstants.ANONYMOUS);
        contact.setCreatedAt(LocalDateTime.now());
        int result = contactRepository.saveContactMessage(contact);

        if(result>0) {
            isSaved = true;
        }
        return isSaved;
    }

    public List<Contact> findMsgsWithOpenStatus() {
        List<Contact> contactMsgs = contactRepository.findMsgsWithStatus(EazySchoolConstants.OPEN);
        return contactMsgs;
    }

    public boolean updateMsgStatus(int contactId, String updatedBy) {
        boolean isUpdated = false;
        int result = contactRepository.updateMsgStatus(contactId, EazySchoolConstants.CLOSE, updatedBy);
        if(result > 0) {
            isUpdated = true;
        }
        return  isUpdated;
    }

    /*public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }*/
}
