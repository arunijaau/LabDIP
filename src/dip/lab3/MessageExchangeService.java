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
public class MessageExchangeService {
    public MessageInputSource input;
    public MessageOutputSource output;

    public MessageExchangeService(MessageInputSource input, MessageOutputSource output) {
        this.input = input;
        this.output = output;
    }
    
    public void exchangeMessage(){
        String message = input.inputMessage();
        output.outputMessage(message);
    }
    
}
