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
public class StartUP {
    public static void main(String[] args) {
        InputSource input1 = new RandomMessageInputSource();
        OutputSource output1 = new FileOutputSource("Message.txt");
        
        MessageExchangeService service = new MessageExchangeService(input1, output1);
        service.ExchangeMessage();
        
        System.out.println("Program ended.Input message was successfully delivered.");
    }
}
