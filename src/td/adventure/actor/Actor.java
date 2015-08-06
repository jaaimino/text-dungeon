/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package td.adventure.actor;

import td.adventure.room.Container;
import td.adventure.room.Room;

/**
 *
 * @author Jacob Aimino
 */
public abstract class Actor {
    
    public String name;
    Container inventory;
    Room room;
    
    /**
     * Default constructor. Requires name.
     * 
     * @param name
     **/
    public Actor(String name){
        this.name = name;
        this.inventory = new Container();
    }
    
    public abstract boolean isHuman();
    
}
