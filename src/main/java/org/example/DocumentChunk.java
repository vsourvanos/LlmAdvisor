package org.example;

public class DocumentChunk {
    private final String chunkId;
    private final String parentDocId;
    private final String text;
    private final double[] embedding;

    public DocumentChunk(String chunkId, String parentDocId, String text, double[] embedding){
        this.chunkId = chunkId;
        this.parentDocId = parentDocId;
        this.text = text;
        this.embedding = embedding;
    }

    public String getChunkId(){
        return this.chunkId;
    }

    public String getParentDocId(){
        return this.parentDocId;
    }

    public String getText(){
        return this.text;
    }

    public double[] getEmbedding(){
        return this.embedding;
    }
}
