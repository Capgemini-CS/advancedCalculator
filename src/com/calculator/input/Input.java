package com.calculator.input;

import com.calculator.exception.IncorrectOperation;

import java.util.Scanner;

import static com.calculator.validateInputData.ValidateInputData.validateInputData;

public class Input {

    private int firstNumber;
    private int secondNumber;
    private String operationType;

    static Scanner scanner = new Scanner(System.in);

    public Input() {

    }

    public Input(int firstNumber, int secondNumber, String operationType) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operationType = operationType;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public static int createInputNumber() {
        return scanner.nextInt();
    }

    public static String createInputOperationType() throws IncorrectOperation {
        String operationType = scanner.next();
        return validateInputData(operationType);
    }

}


