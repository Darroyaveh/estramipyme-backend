package com.estramipyme.crud.persistence.entities;

import java.time.LocalDateTime;

public class Option {
    private int id;
    private String question_id;
    private String option_text;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    public Option(int id, String question_id, String option_text){
        this.id = id;
        this.question_id = question_id;
        this.option_text = option_text;
    }

    public Option(){}

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getQuestionId(){
        return question_id;
    }

    public void setQuestionId(String question_id){
        this.question_id = question_id;
    }

    public String getOptionText(){
        return option_text;
    }

    public void setOptionText(String option_text){
        this.option_text = option_text;
    }
}
