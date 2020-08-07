package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionlCalculator;

import java.awt.*;
import java.nio.charset.StandardCharsets;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");
        SaySomething saySomething = new SaySomething();
        saySomething.say();
        Processor processor = new Processor();
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        processor.execute(executeSaySomething);
        Executor codeToExecute = () -> System.out.println("This is an exemple text.");
        processor.execute(codeToExecute);

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionlCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionlCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionlCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionlCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("abc", text -> text.toUpperCase());
        poemBeautifier.beautify("ABC", text -> "\"" + text + "\"");
        poemBeautifier.beautify("It's hard to take it easy", text -> String.valueOf(text.getBytes(StandardCharsets.UTF_8)));
        poemBeautifier.beautify("It's hard to take it easy", text -> text.replaceAll("It's hard to", ""));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
