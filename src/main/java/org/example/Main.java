package org.example;
import com.google.gson.Gson;

public class Main {
    public static void main() {
        // Create a repository
        DocumentRepository repo = new InMemoryDocumentRepository();

// Create some test documents
        LegalDocument doc1 = new LegalDocument("GR-001", "Content of article 1", "Civil Code", "682", "AK");
        LegalDocument doc2 = new LegalDocument("GR-002", "Content of article 2", "Labour Law", "1a", "EK");

// Test save
        repo.save(doc1);
        repo.save(doc2);
        System.out.println("Saved 2 documents");

// Test findAll
        System.out.println("Total documents: " + repo.findAll().size());

// Test findById
        LegalDocument found = repo.findById("GR-001");
        System.out.println("Found: " + found.getTitle());

// Test delete
        repo.delete("GR-001");
        System.out.println("After delete, total: " + repo.findAll().size());

        try {
            LegalDocument notFound = repo.findById("GR-999");
        } catch (DocumentNotFoundException e){
            System.out.println(e.getMessage());
        }

    }
}
