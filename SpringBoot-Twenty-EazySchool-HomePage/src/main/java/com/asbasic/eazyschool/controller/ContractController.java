package com.asbasic.eazyschool.controller;

import com.asbasic.eazyschool.model.Contact;
import com.asbasic.eazyschool.service.ContactService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class ContractController {

    private static Logger log = LoggerFactory.getLogger(ContractController.class);

    private final ContactService contactService;

    @Autowired
    public ContractController(ContactService contactService) {
        this.contactService = contactService;
    }

    @RequestMapping("/contact")
    public String displayContractPage(Model model) {
        model.addAttribute("contact", new Contact());

        return "contact.html";
    }

    /*
    //@RequestMapping(value="saveMsg", method = POST)
    @PostMapping("saveMsg")
    public ModelAndView saveMessage(@RequestParam String name, @RequestParam String mobileNum,
                                    @RequestParam String email, @RequestParam String subject,
                                    @RequestParam String message) {
        log.info("Name : " + name);
        log.info("Mobile Number : " + mobileNum);
        log.info("Email Id : " + email);
        log.info("Subject : " + subject);
        log.info("Message : " + message);
        return new ModelAndView("redirect:/contact");

    }
    */

    //using POJO class Contract.class rather than passing individual parameters
    @PostMapping("saveMsg")
    public String saveMessage(@Valid @ModelAttribute("contact") Contact contact, Errors errors){
        if(errors.hasErrors()) {
            log.error("Contact form validation failed due to : " +errors.toString());
            return "contact.html";
        }

        contactService.saveMessageDetails(contact);
        contactService.setCounter(contactService.getCounter()+1);
        log.info("Number of times the contact form is submitted : " +contactService.getCounter());
        return "redirect:/contact";
    }
}
