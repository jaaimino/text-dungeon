/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td.client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Jacob Aimino
 */
public class DungeonFrame extends JFrame {

    public JFrame frame;
    public JTextArea text;
    public JTextField input;

    public DungeonFrame() {
        initComponents();
        addListeners();
    }

    private void initComponents() {
        frame = new JFrame("FrameDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* Make componenets */
        text = new JTextArea();
        text.setBackground(Color.BLACK);
        text.setForeground(Color.WHITE);
        text.setEditable(false);
        input = new JTextField();
        input.setBorder(null);
        input.setBackground(Color.BLACK);
        input.setForeground(Color.WHITE);
        input.setCaretColor(Color.WHITE);

        frame.setLayout(new BorderLayout());
        frame.setSize(800, 500);
        frame.add(text);
        frame.add(input, BorderLayout.SOUTH);
        frame.setVisible(true);
    }

    private void addListeners() {
        input.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
            
        });
    }

}
