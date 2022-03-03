package com.calculator;

import com.calculator.exception.IncorrectOperation;
import com.calculator.executeCalculation.ExecuteCalculation;
import com.calculator.input.Input;

public class Calculator extends Input {
    public static void main(String[] args) throws IncorrectOperation {

        System.out.println("Please insert Input Data( two numbers and then one mathematical operator symbol )\n+\n-\n*\n/");
        ExecuteCalculation executeCalculation = new ExecuteCalculation();

        Input input1 = new Input(createInputNumber(), createInputNumber(), createInputOperationType());
        System.out.println("The result is: " + executeCalculation.executeCalculation(input1.getFirstNumber(), input1.getSecondNumber(), input1.getOperationType()));

        Input input2 = new Input(createInputNumber(), createInputNumber(), createInputOperationType());
        System.out.println("The result is: " + executeCalculation.executeCalculation(input2.getFirstNumber(), input2.getSecondNumber(), input2.getOperationType()));

        Input input3 = new Input(createInputNumber(), createInputNumber(), createInputOperationType());
        System.out.println("The result is: " + executeCalculation.executeCalculation(input3.getFirstNumber(), input3.getSecondNumber(), input3.getOperationType()));

    }
}
