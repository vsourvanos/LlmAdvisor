package org.example;

import java.util.List;

public class LegalResponse {
    private final String answer;
    private final List<LegalDocument> sourceDocs;
    private final double confidence;

    public LegalResponse(String answer,List<LegalDocument> sourceDocs, double confidence){
        this.answer = answer;
        this.sourceDocs = sourceDocs;
        this.confidence = confidence;
    }

    public String getAnswer(){
        return this.answer;
    }

    public List<LegalDocument> getSourceDocs(){
        return this.sourceDocs;
    }

    public double getConfidence(){
        return this.confidence;
    }
}
