/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package td.adventure.triggers;

/**
 *
 * @author Jacob Aimino
 * 
 * Generic super type for triggers
 * All types of triggers should inherit from this
 */
public abstract class Trigger {
    
    private final boolean blocking;
    
    public Trigger(){
        this.blocking = false;
    }
    
    public Trigger(boolean blocking){
        this.blocking = blocking;
    }
    
    public boolean isBlocking(){
        return blocking;
    }
    
}
