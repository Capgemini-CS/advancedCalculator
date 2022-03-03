package com.calculator.executeCalculation;

import com.calculator.operation.*;
import com.calculator.exception.IncorrectOperation;
import com.calculator.input.Input;

public class ExecuteCalculation extends Input {

    public int executeCalculation(int firstNumber, int secondNumber, String operationType) throws IncorrectOperation {
        OperationInterface operation;

        int result = 0;

        switch (operationType) {
            case "+":
                operation = new Addition();
                result = operation.calculate(firstNumber, secondNumber);
                break;
            case "-":
                operation = new Substraction();
                result = operation.calculate(firstNumber, secondNumber);
                break;
            case "*":
                operation = new Multiplication();
                result = operation.calculate(firstNumber, secondNumber);
                break;
            case "/":
                operation = new Division();
                if (secondNumber != 0) {
                    result = operation.calculate(firstNumber, secondNumber);
                } else {
                    throw new IncorrectOperation("You can't make a division with 0!");
                }
                break;
        }
        return result;
    }
}
