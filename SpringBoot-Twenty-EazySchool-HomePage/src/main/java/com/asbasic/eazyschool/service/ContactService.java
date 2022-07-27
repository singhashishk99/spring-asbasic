package com.asbasic.eazyschool.service;

import com.asbasic.eazyschool.controller.ContractController;
import com.asbasic.eazyschool.model.Contact;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

// service layer - for processing the business logic post controller layer passed the control
@Service
//@RequestScope
@SessionScope
//@ApplicationScope
public class ContactService {
    /*
    * save contact details into DB
    * @param contact
    * @return boolean
     */
    private static Logger log = LoggerFactory.getLogger(ContactService.class);
    private int counter = 0;

    public ContactService(){
        System.out.println("Contact service has been initialized");
    }

    public boolean saveMessageDetails(Contact contact){
        boolean isSaved = true;
        // ToDo - need to persist data into database
        log.info(contact.toString());
        return isSaved;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
