package org.example;

import java.util.List;

public interface DocumentRepository {
    void save(LegalDocument document);
    LegalDocument findById(String id);
    List<LegalDocument> findAll();
    void delete(String id);
}
