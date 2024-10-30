package com.estramipyme.crud.models;

public class Response {
    private int id;
    private String user_id;
    private String question_id;
    private String response_text;

    public Response (int id, String user_id, String question_id, String response_text){
        this.id = id;
        this.user_id = user_id;
        this.question_id = question_id;
        this.response_text = response_text;
    }

    public Response(){}

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getUserId(){
        return user_id;
    }

    public void setUserId(String user_id){
        this.user_id = user_id;
    }

    public String getQuestionId(){
        return question_id;
    }

    public void setQuestionId(String question_id){
        this.question_id = question_id;
    }

    public String getResponseText(){
        return response_text;
    }

    public void setResponseText(String response_text){
        this.response_text = response_text;
    }
}
