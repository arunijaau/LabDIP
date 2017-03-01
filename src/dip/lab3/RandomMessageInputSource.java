/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author Aruni
 */
public class RandomMessageInputSource implements InputSource {

    private final String[] messageArray;
    private int randomNumber;

    public RandomMessageInputSource() {
        this.messageArray = new String[]{"Hello", "Hi there!", "Hello World"};
    }

    @Override
    public String inputMessage() {
        return messageArray[getRandomNumber()];
    }

    private void setRandomNumber() {
        Random randomNumbers = new Random();
        this.randomNumber = randomNumbers.nextInt(messageArray.length - 1);
    }

    private int getRandomNumber() {
        return this.randomNumber;
    }

}
