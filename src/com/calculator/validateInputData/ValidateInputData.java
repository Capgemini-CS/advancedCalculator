package com.calculator.validateInputData;

import com.calculator.exception.IncorrectOperation;
import com.calculator.input.Input;

public class ValidateInputData extends Input {


    public static String validateInputData(String operationType) throws IncorrectOperation {
        if (!operationType.matches("[-+*/]+")) {
            throw new IncorrectOperation("Such operation doesn't exist!");
        }
        return operationType;
    }



}
