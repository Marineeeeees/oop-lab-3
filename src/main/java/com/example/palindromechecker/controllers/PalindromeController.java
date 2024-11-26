package com.example.palindromechecker.controllers;

import com.example.palindromechecker.util.PalindromeChecker;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;


/**
 * The PalindromeController class handles user interactions for the Palindrome Checker application.
 * It processes input from the user, checks if the input is a palindrome, and displays the result.
 */
public class PalindromeController {

    /**
     * A TextField for user input. Users enter the string they want to check for palindrome properties here.
     */
    @FXML
    private TextField wordInput;

    /**
     * Checks if the input string entered by the user is a palindrome.
     * Utilizes the PalindromeChecker utility class for the validation.
     * Displays the result in an alert dialog:
     * - Information alert if the string is a palindrome.
     * - Error alert if the string is not a palindrome.
     */
    @FXML
    private void check() {
        String input = wordInput.getText();
        boolean isPalindrome = PalindromeChecker.check(input);
        if (isPalindrome) {
            new Alert(Alert.AlertType.INFORMATION, "The given string is a palindrome.").showAndWait();
        } else {
            new Alert(Alert.AlertType.ERROR, "The given string is not a palindrome.").showAndWait();
        }
    }
}