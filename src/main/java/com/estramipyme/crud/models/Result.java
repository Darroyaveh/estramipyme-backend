package com.estramipyme.crud.models;

import java.util.HashMap;
import java.util.Map;

public class Result {
    private int id;
    private String user_id;
    private Map<String, Object> result_data;

    public Result (int id, String user_id){
        this.id = id;
        this.user_id = user_id;
        this.result_data = new HashMap<>();
    }

    public Result(){}

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

    public Map<String, Object> getResultData(){
        return result_data;
    }

    public void setResultData(Map<String, Object> result_data){
        this.result_data = result_data;
    }
}
