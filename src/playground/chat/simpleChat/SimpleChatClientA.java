package Playground.chat.simpleChat;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;

public class SimpleChatClientA {
    private JTextField outgoing;
    private PrintWriter writer;

    public void go() {
        // Call the setUpNetworking() method
        // Make gui and register a listener with the send button
        setUpNetworking();

        outgoing = new JTextField(20);

        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(e -> sendMessage());

        JPanel mainPanel = new JPanel();
        mainPanel.add(outgoing);
        mainPanel.add(sendButton);
        JFrame frame = new JFrame("Ludicrously Simple Chat Client");
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(400, 100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void setUpNetworking() {
        // Open a SocketChannel to the server
        // Make a PrintWriter and assign to writer instance variable
        try {
            InetSocketAddress serverAddress = new InetSocketAddress("127.0.0.1", 5000);

            SocketChannel socketChannel = SocketChannel.open(serverAddress);
            writer = new PrintWriter(Channels.newWriter(socketChannel, StandardCharsets.UTF_8));
            System.out.println("Networking established");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void sendMessage() {
        // Get the text from the text fiend and send int to server
        // using the writer (a PrintWriter)

        writer.println(outgoing.getText());
        writer.flush();
        outgoing.setText("");
        outgoing.requestFocus();
    }

    public static void main(String[] args) {
        new SimpleChatClientA().go();
    }
}
