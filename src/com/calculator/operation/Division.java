package com.calculator.operation;

import com.calculator.executeCalculation.ExecuteCalculation;

public class Division extends ExecuteCalculation implements OperationInterface {

    @Override
    public int calculate(int firstNumber, int secondNumber) {
        int result = firstNumber / secondNumber;
        return result;
    }
}
