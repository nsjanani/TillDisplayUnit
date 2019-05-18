package com.till.display;

import java.util.Map;

public class TillDisplayCalculator {

    public static void main(String[] args) {

        System.out.println("Hello ! Welcome to the Till...");
        UserInput userInput = new UserInput();
        Map inputMap = userInput.getNValidateUserInput();

    }

}