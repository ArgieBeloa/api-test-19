package com.example.mary.qandaPackage;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document(collection = "qandadbcollection")
public class QandAModel {


    private String id;
    private String subjectId;
    private List<QuestionAnswerPair> questions;

    // Inner class to represent a question-answer pair
    public static class QuestionAnswerPair {
        private String question;
        private String answer;

        // Constructors, getters, and setters
        public QuestionAnswerPair(String question, String answer) {
            this.question = question;
            this.answer = answer;
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

    // Getters and setters for QandAModel
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

    public List<QuestionAnswerPair> getQuestions() {
        return questions;
    }

    public void setQuestions(List<QuestionAnswerPair> questions) {
        this.questions = questions;
    }

}
