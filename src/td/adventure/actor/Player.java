/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package td.adventure.actor;

/**
 *
 * @author Jacob Aimino
 */
public class Player extends Actor{

    public Player(String name) {
        super(name);
    }
    
    @Override
    public boolean isHuman(){
        return true;
    }
    
    
    
}
