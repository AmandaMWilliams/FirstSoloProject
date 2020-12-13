package InteractiveStory.tools;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private JFrame jFrame;
    private Container con;
    private JPanel startingPanel, startButtonPanel, mainTextPanel, choiceButtonPanel;
    private JLabel text;
    private Font textfont = new Font("Times New Roman", Font.PLAIN, 60);
    private Font buttonFont = new Font("Times New Roman", Font.PLAIN, 40);
    private JButton startButton, choice1, choice2;
    private JTextArea mainTextArea;

    TitleScreenHandler tsHandler = new TitleScreenHandler();

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
        startButtonPanel.setBackground(Color.BLACK);


        startButton = new JButton("START");
        startButton.setBackground(Color.BLACK);
        startButton.setForeground(Color.GRAY);
        startButton.setFont(buttonFont);
        startButton.addActionListener(tsHandler);
        startButton.setFocusPainted(false);

        startingPanel.add(text);
        startButtonPanel.add(startButton);

        con.add(startingPanel);
        con.add(startButtonPanel);
    }

    public void createGameScreen(){
        startingPanel.setVisible(false);
        startButtonPanel.setVisible(false);

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(Color.black);
        con.add(mainTextPanel);

        mainTextArea = new JTextArea("Text Prompt");
        mainTextArea.setBounds(100,100,600,250);
        mainTextArea.setBackground(Color.BLACK);
        mainTextArea.setForeground(Color.WHITE);
        mainTextArea.setFont(buttonFont);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250,250,300,150);
        choiceButtonPanel.setBackground(Color.black);
        choiceButtonPanel.setLayout(new GridLayout(2,1));
        con.add(choiceButtonPanel);

        choice1 = new JButton("Choice 1");
        choice1.setBackground(Color.white);
        choice1.setForeground(Color.gray);
        choice1.setFont(buttonFont);
        choice1.setFocusPainted(false);
        choiceButtonPanel.add(choice1);

        choice2 = new JButton("Choice 2");
        choice2.setBackground(Color.white);
        choice2.setForeground(Color.gray);
        choice2.setFont(buttonFont);
        choice2.setFocusPainted(false);
        choiceButtonPanel.add(choice2);


    }

    public class TitleScreenHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            createGameScreen();
        }
    }
}
