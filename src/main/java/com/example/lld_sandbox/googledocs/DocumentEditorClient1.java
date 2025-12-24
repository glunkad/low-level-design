package com.example.lld_sandbox.googledocs;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class DocumentEditor {
    private List<String> documentElements;
    private String renderedDocument;


    DocumentEditor() {
        documentElements = new ArrayList<>();
        renderedDocument = "";
    }

    public void addText(String text) {
        documentElements.add(text);
    }

    public void addImage(String imgPath) {
        documentElements.add(imgPath);
    }

    public String renderDocument() {
        if (renderedDocument.isEmpty()) {
            StringBuilder result = new StringBuilder();
            for (String element : documentElements) {
                if (element.length() > 4 && element.endsWith(".jpg") || element.endsWith(".png")) {
                    result.append("[Image: ").append(element).append("]\n");
                } else {
                    result.append(element).append("\n");
                }
            }
            renderedDocument = result.toString();
        }
        return renderedDocument;
    }

    public void saveToFile() {
        try {
            FileWriter fw = new FileWriter("documents.txt");
            fw.write(renderDocument());
            fw.close();
            System.out.println("Document saved to documents.txt");
        } catch (IOException ex) {
            System.out.println("Error writing to file");
        }
    }
}


public class DocumentEditorClient1 {
    public static void main(String[] args) {
        DocumentEditor editor = new DocumentEditor();
        editor.addText("Hello World");
        editor.addImage("picture.jpg");
        editor.addText("This is a document editor!");
        System.out.println(editor.renderDocument());
    }
}
