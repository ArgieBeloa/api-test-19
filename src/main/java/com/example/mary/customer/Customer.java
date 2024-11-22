package com.example.mary.customer;




import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {

    private String subjectId;

    private String question;
    private String answer;

}
