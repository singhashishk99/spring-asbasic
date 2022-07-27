package com.asbasic.eazyschool.model;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/*POJO class for adding contract*/
@Data
public class Contact {

    @NotBlank(message = "Name must not be blank")
    @Size(min=3, message="Name must be atleast 3 character long")
    private String name;

    @NotBlank(message = "Mobile Number must not be blank")
    @Pattern(regexp = "(^$|[0-9]{10})", message= "Mobile Number must be of 10 digits")
    private String mobileNum;

    @NotBlank(message = "Email must not be blank")
    @Email(message = "Please provide a valid email address")
    private String email;

    @NotBlank(message = "Subject must not be blank")
    @Size(min=5, message = "Subject must be atleast 5 character long")
    private String subject;

    @NotBlank(message = "Message must not be blank")
    @Size(min=10, message = "Message must be atleast 10 character long")
    private String message;

}
