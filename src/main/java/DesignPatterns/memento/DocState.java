package DesignPatterns.memento;

public class DocState {
    public String content;
    public String fontName;
    public int fontSize;

    public DocState(String content, String fontName, int fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    
}