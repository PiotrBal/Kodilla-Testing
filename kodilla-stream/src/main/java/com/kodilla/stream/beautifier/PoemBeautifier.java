package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String text, PoemDecorator poemDecorator){
        String text1 = poemDecorator.decorate(text);
        System.out.println("'" + text + "'" + " -> converted to: " + text1);
    }
}
