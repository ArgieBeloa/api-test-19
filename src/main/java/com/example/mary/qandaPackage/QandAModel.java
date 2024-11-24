package com.example.mary.qandaPackage;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "qandadbcollection")
public class QandAModel {




    @Id
    private String id;
    private String question;
    private String answer;
    private String subjectId;


    // Constructors
    public QandAModel () {}

    public QandAModel(String subjectId, String question, String answer) {
        this.subjectId = subjectId;
        this.question = question;
        this.answer = answer;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }




    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
