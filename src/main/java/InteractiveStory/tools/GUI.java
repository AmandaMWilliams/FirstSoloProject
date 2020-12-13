package InteractiveStory.tools;

import javax.swing.*;
import java.awt.*;

public class GUI {
    private static JFrame jFrame;
    private static Container con;
    private static JPanel startingPanel, startButtonPanel;
    private static JLabel text;
    private static Font textfont = new Font("Times New Roman", Font.PLAIN, 40);
    private static JButton startButton;

    public void GUICreator() {
        jFrame = new JFrame();
        jFrame.setSize(800, 600);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.getContentPane().setBackground(Color.BLACK);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        con = jFrame.getContentPane();

        startingPanel = new JPanel();
        startingPanel.setBounds(100, 100, 600, 150);
        startingPanel.setBackground(Color.BLACK);
        text = new JLabel("My Interactive Story");
        text.setForeground(Color.WHITE);
        text.setFont(textfont);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 100);
        startButtonPanel.setBackground(Color.GRAY);

        startButton = new JButton();
        startButton.setBackground(Color.GRAY);
        startButton.setForeground(Color.WHITE);

        startingPanel.add(text);
        startButtonPanel.add(startButton);
        con.add(startingPanel);
        con.add(startButtonPanel);
    }
}
