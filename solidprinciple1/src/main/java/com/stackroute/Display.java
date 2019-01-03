package com.stackroute;

public class Display extends Text implements Print {
    String text;
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void printText()
    {
        System.out.println(text);
    }
}
