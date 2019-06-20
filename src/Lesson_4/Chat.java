package Lesson_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chat {
    public static void main(String[] args) {
        new ChatWindow();
    }
}

class ChatWindow extends JFrame {
    public ChatWindow (){
        setTitle("Окно чата");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(200, 200, 300, 400);
        setLayout(new BorderLayout());
        JTextArea jTextArea = new JTextArea();
        jTextArea.setEditable(false);
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        JTextField jTextField = new JTextField(20);
        JButton jButton = new JButton("ОК");
        JPanel jPanel = new JPanel(new FlowLayout());
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.append(jTextField.getText()+"\n");
                jTextField.setText("");
                jTextField.grabFocus();
            }
        });
        jTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.append(jTextField.getText()+"\n");
                jTextField.setText("");
                jTextField.grabFocus();
            }
        });
        jPanel.setBackground(Color.black);
        jPanel.add(jTextField);
        jPanel.add(jButton);
        add(jScrollPane, BorderLayout.CENTER);
        add(jPanel, BorderLayout.SOUTH);
        setVisible(true);
    }
}
