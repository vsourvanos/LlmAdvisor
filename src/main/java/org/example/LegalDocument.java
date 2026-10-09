package org.example;

public class LegalDocument {
    private final String id;
    private final String content;
    private final String title;
    private final String articleNumber;
    private final String lawcode;

    public LegalDocument(String id, String content, String title, String articleNumber, String lawcode){
        this.id = id;
        this.content = content;
        this.title = title;
        this.articleNumber = articleNumber;
        this.lawcode = lawcode;
    }

    public String getId(){
        return this.id;
    }

    public String getContent(){
        return this.content;
    }

    public String getTitle(){
        return this.title;
    }

    public String getArticleNumber(){
        return this.articleNumber;
    }

    public String getLawcode(){
        return this.lawcode;
    }
}
