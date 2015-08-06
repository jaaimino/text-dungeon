/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td.client;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryonet.Client;
import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;
import java.io.IOException;
import td.server.messages.CommandMessage;
import td.server.messages.JoinRequestMessage;
import td.server.messages.JoinResponseMessage;

/**
 *
 * @author Jacob Aimino
 */
public class DungeonClient {

    Client client;
    DungeonFrame frame;

    public DungeonClient() {
        client = new Client();
        registerMessages();
        addListeners();
    }

    private void startAndConnect(String address, int port) {
        client.start();
        try {
            client.connect(1000, address, port);
        } catch (IOException ex) {
            System.out.println("Couldn't connect to server at " + address + port);
        }
    }

    private void addListeners() {
        client.addListener(new Listener() {
            @Override
            public void received(Connection connection, Object object) {
                if (object instanceof CommandMessage) {
                    CommandMessage message = (CommandMessage) object;
                    connection.sendTCP(message);
                }
            }
        });
    }

    private void registerMessages() {
        Kryo kryo = client.getKryo();
        kryo.register(CommandMessage.class);
        kryo.register(JoinRequestMessage.class);
        kryo.register(JoinResponseMessage.class);
    }

    private void startGUI() {
        frame = new DungeonFrame();
    }

    public static void main(String[] args) {
        DungeonClient client = new DungeonClient();
        client.startGUI();
    }

}
