/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author ajayasooriya
 */
public class KeyboardOutputSource implements MessageOutputSource {

    @Override
    public void outputMessage(String message) {
        if(message == null || message.isEmpty()){
            throw new IllegalArgumentException("Enter a valid input which is not null or empty.");
        }
        System.out.println("Message entered: ");
        System.out.println(message);
    }
    
}
