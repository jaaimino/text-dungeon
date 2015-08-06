/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td.io;

/**
 *
 * @author Jacob Aimino
 */
public class IOEventPrompt extends IOEvent {

    String prompt;

    public IOEventPrompt(String prompt) {
        this.prompt = prompt;
    }

}
