package com.stackroute;
import java.lang.String;

public class Text implements Editing{
    String text;
    String author;
    int length;

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getLength()
    {
        return length;
    }

    public void setLength(int length)
    {
        this.length = length;
    }

    @Override
    public void allLettersToUpperCase(String text)
    {
     text = text.toUpperCase();
     System.out.println(text);
    }

    @Override
    public void findSubTextAndDelete()
    {
        System.out.println();
    }

}
