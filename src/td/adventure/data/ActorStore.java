/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td.adventure.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import td.adventure.actor.Actor;

/**
 *
 * @author Jacob Aimino
 */
public final class ActorStore {

    private final HashMap<String, Actor> actorMap;
    private final ArrayList<Actor> actorList;

    public ActorStore() {
        this.actorMap = new HashMap<>();
        this.actorList = new ArrayList<>();
    }

    public List<Actor> getAllHumans() {
        ArrayList<Actor> temp = new ArrayList<>();
        for (Actor a : actorList) {
            if (a.isHuman()) {
                temp.add(a);
            }
        }
        return temp;
    }

    public List<Actor> getAllCreatures() {
        ArrayList<Actor> temp = new ArrayList<>();
        for (Actor a : actorList) {
            if (!a.isHuman()) {
                temp.add(a);
            }
        }
        return temp;
    }

    public void putActor(Actor actor) {
        actorList.add(actor);
        actorMap.put(actor.name, actor);
    }

    public Actor getActorByName(String name) {
        return actorMap.get(name);
    }

    public void removeActorByName(String name) {
        Iterator<Actor> i = actorList.iterator();
        while (i.hasNext()) {
            Actor temp = i.next();
            if (temp.name.equals(name)) {
                actorMap.remove(name);
                i.remove();
            }
        }
    }

}
