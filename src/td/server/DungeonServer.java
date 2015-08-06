/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td.server;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;
import com.esotericsoftware.kryonet.Server;
import java.io.IOException;
import td.server.messages.CommandMessage;
import td.server.messages.JoinRequestMessage;
import td.server.messages.JoinResponseMessage;

/**
 *
 * @author Jacob Aimino
 */
public class DungeonServer {

    Server server;

    public DungeonServer(int port) {
        this.server = new Server();
        startAndBind(port);
        registerMessages();
        addListeners();
    }

    private void startAndBind(int port) {
        server.start();

        try {
            server.bind(port, port);
        } catch (IOException i) {
            System.out.println("Couldn't bind server to port " + port + ".");
        }
    }

    private void addListeners() {
        server.addListener(new Listener() {
            @Override
            public void received(Connection connection, Object object) {
                if (object instanceof CommandMessage) {
                    CommandMessage message = (CommandMessage) object;
                    System.out.println(message);
                }
            }
        });
    }

    private void registerMessages() {
        Kryo kryo = server.getKryo();
        kryo.register(CommandMessage.class);
        kryo.register(JoinRequestMessage.class);
        kryo.register(JoinResponseMessage.class);
    }

}
