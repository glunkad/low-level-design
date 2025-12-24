//package com.example.lld_sandbox.googledocs;
//
//import java.util.ArrayList;
//import java.util.List;
//
//interface DocumentElement {
//    public abstract String render();
//}
//
//class TextElement implements DocumentElement {
//
//    private String text;
//
//    TextElement(String text) {
//        this.text = text;
//    }
//
//    @Override
//    public String render() {
//        return text+"\n";
//    }
//}
//
//class ImgElement implements DocumentElement {
//    private String imgPath;
//
//    ImgElement(String imgPath) {
//        this.imgPath = imgPath;
//    }
//
//
//    @Override
//    public String render() {
//        return "[Image: " + imgPath + "]\n";
//    }
//}
//
//interface Persistence {
//    void save(String data);
//}
//
//class FileStorage implements Persistence {
//
//    @Override
//    public void save(String data) {
//        System.out.println("Data saved on file" + data);
//    }
//}
//
//class DBStorage implements Persistence {
//    @Override
//    public void save(String data) {
//        System.out.println("Data saved on DB" + data);
//    }
//}
//
//class Document {
//    private List<DocumentElement> documentElements;
//
//    Document() {
//        documentElements = new ArrayList<>();
//    }
//
//    public void addElement(DocumentElement element) {
//        documentElements.add(element);
//    }
//
//    public String render() {
//        StringBuilder result = new StringBuilder();
//        for (DocumentElement element : documentElements) {
//            result.append(element.render());
//        }
//        return result.toString();
//    }
//}
//
//class DocumentEditor {
//    private Document document;
//    private Persistence storage;
//    private String renderedDocument = "";
//
//    DocumentEditor(Document document, Persistence storage) {
//        this.document = document;
//        this.storage = storage;
//    }
//
//    public void addText(String text) {
//        document.addElement(new TextElement(text));
//    }
//
//    public void addImg(String imgPath) {
//        document.addElement(new ImgElement(imgPath));
//    }
//
//    public String renderDoc() {
//        if (renderedDocument.isEmpty()) {
//            renderedDocument = document.render();
//        }
//        return document.render();
//    }
//
//    public void save() {
//        storage.save(renderDoc());
//    }
//}
//
//public class DocumentEditorClient2 {
//
//    public static void main(String[] args) {
//        Document document = new Document();
//        Persistence storage = new DBStorage();
//        DocumentEditor editor = new DocumentEditor(document, storage);
//
//        editor.addText("Hello World");
//        editor.addImg("picture.jpg");
//
//        System.out.println(editor.renderDoc());
//        editor.save();
//    }
//
//
//}
