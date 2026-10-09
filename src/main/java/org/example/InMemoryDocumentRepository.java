package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InMemoryDocumentRepository implements DocumentRepository{
    private final List<LegalDocument> documents = new ArrayList<>();

    @Override
    public void save(LegalDocument document) {
        documents.add(document);
    }

    @Override
    public void delete(String id) {
        Iterator<LegalDocument> iterator = documents.iterator();
        while (iterator.hasNext()){
            LegalDocument doc = iterator.next();
            if (doc.getId().equals(id)){
                iterator.remove();
            }
        }
    }

    @Override
    public LegalDocument findById(String id) {
        for (LegalDocument doc : documents){
            if(doc.getId().equals(id)){
                return doc;
            }
        }
        throw new DocumentNotFoundException("Document with id: "+ id + " was not found.");
    }

    public List<LegalDocument> getDocuments() {
        return documents;
    }

    @Override
    public List<LegalDocument> findAll() {
        return documents;
    }
}
