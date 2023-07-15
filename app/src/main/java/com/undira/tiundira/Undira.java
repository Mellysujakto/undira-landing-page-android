package com.undira.tiundira;

public class Undira {

    // variables for our coursename,
    // description, tracks and duration, id.
    private String header;
    private String content;
    private int id;

    // creating getter and setter methods
    public String getHeader() { return header; }

    public void setHeader(String header)
    {
        this.header = header;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    // constructor
    public Undira(String header,
                       String content)
    {
        this.header = header;
        this.content = content;
    }
}
