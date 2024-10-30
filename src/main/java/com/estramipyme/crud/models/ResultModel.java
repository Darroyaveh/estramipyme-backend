package com.estramipyme.crud.models;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class ResultModel {
    private int id;
    private String user_id;
    private Map<String, Object> result_data;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public ResultModel(int id, String user_id){
        this.id = id;
        this.user_id = user_id;
        this.result_data = new HashMap<>();
    }

    public ResultModel(){}

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
