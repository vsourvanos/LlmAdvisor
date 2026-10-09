package org.example;

import java.time.LocalDateTime;

public class UserQuery {
    private final String queryText;
    private final LocalDateTime timeStamp;
    private final String language;

    public UserQuery(String queryText, String language){
        this.queryText = queryText;
        this.timeStamp = LocalDateTime.now();
        this.language = language;
    }

    public String getQueryText(){
        return this.queryText;
    }

    public String getLanguage(){
        return this.language;
    }

    public LocalDateTime getTimeStamp(){
        return this.timeStamp;
    }
}
