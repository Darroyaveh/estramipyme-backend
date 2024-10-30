package com.estramipyme.crud.models;

public class Question {
    private int id;
    private String section;
    private String statement;
    private String subsection;

    public Question(int id, String section, String statement, String subsection){
        this.id = id;
        this.section = section;
        this.statement = statement;
        this.subsection = subsection;
    }

    public Question(){}

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getSection(){
        return section;
    }

    public void setSection(String section){
        this.section = section;
    }

    public String getStatement(){
        return statement;
    }

    public void setStatement(String statement){
        this.statement = statement;
    }

    public String getSubsection(){
        return subsection;
    }

    public void setSubsection(String subsection){
        this.subsection = subsection;
    }
}
