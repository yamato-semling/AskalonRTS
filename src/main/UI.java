package main;

import javax.swing.*;
import java.awt.*;

public class UI {

    JFrame window;
    JPanel titleNamePanel, startButtonPanel, mainTextPanel,mainImgPanel, choiceButtonPanel, playerPanel;
    JLabel titleNameLabel, mainImgLabel;
    JLabel goldLabel, taxLabel, foodLabel, woodLabel, pplLabel, soldierLabel, powerLabel;
    JButton startButton, choice1, choice2, choice3, choice4;
    JTextArea mainTextArea;

    Font titleFont = new Font("Book Antiqua", Font.PLAIN, 70);
    Font textFont = new Font("Book Antiqua", Font.PLAIN, 24);

    public void createUI(Game.ChoiceHandler cHandler){


        // WINDOW
        window = new JFrame();
        window.setSize(1280,720);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        window.setLayout(null);
        window.setVisible(true);

        // TITLE SCREEN
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100,100,1080,150);
        titleNamePanel.setBackground(Color.BLACK);
        titleNameLabel = new JLabel("Fürsten und so");
        titleNameLabel.setBounds(0,0,700,150);
        titleNameLabel.setForeground(Color.WHITE);
        titleNameLabel.setFont(titleFont);
        titleNamePanel.add(titleNameLabel);

        // START BUTTON
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(500,400,200,100);
        startButtonPanel.setBackground(Color.BLACK);
        startButton = new JButton("START");
        startButton.setBounds(20,20,140,30);
        startButton.setBackground(Color.BLACK);
        startButton.setForeground(Color.WHITE);
        startButton.setFont(textFont);
        startButton.setFocusPainted(false);
        startButton.addActionListener(cHandler);
        startButton.setActionCommand("start");
        startButtonPanel.add(startButton);

        window.add(titleNamePanel);
        window.add(startButtonPanel);

        // window.setVisible(true);

        //GAME SCREEN
        mainImgPanel = new JPanel();
        mainImgPanel.setBounds(50,50,800,400);
        mainImgPanel.setBackground(Color.BLACK);
        mainImgPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE, 3));
        mainImgLabel = new JLabel();
        mainImgLabel.setBackground(Color.BLACK);
        mainImgLabel.setBounds(2,2,790,390);
        mainImgPanel.add(mainImgLabel);
        window.add(mainImgPanel);

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(50,500,800,200);
        mainTextPanel.setBackground(Color.BLACK);
        window.add(mainTextPanel);

        mainTextArea = new JTextArea("Main-text-area");
        mainTextArea.setBounds(0,0,800,200);
        mainTextArea.setBackground(Color.BLACK);
        mainTextArea.setForeground(Color.WHITE);
        mainTextArea.setFont(textFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextArea.setEditable(false);
        mainTextArea.setFocusable(false);
        mainTextPanel.add(mainTextArea);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(900,500,300,150);
        choiceButtonPanel.setBackground(Color.BLACK);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        choiceButtonPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE, 3));
        window.add(choiceButtonPanel);

        choice1 = new JButton("Choice 1");
        choice1.setBounds(0,0,300,30);
        choice1.setBackground(Color.BLACK);
        choice1.setForeground(Color.WHITE);
        choice1.setFont(textFont);
        choice1.setFocusPainted(false);
        choice1.addActionListener(cHandler);
        choice1.setActionCommand("c1");
        choiceButtonPanel.add(choice1);
        choice2 = new JButton("Choice 2");
        choice2.setBounds(0,0,300,30);
        choice2.setBackground(Color.BLACK);
        choice2.setForeground(Color.WHITE);
        choice2.setFont(textFont);
        choice2.setFocusPainted(false);
        choice2.addActionListener(cHandler);
        choice2.setActionCommand("c2");
        choiceButtonPanel.add(choice2);
        choice3 = new JButton("Choice 3");
        choice3.setBounds(0,0,300,30);
        choice3.setBackground(Color.BLACK);
        choice3.setForeground(Color.WHITE);
        choice3.setFont(textFont);
        choice3.setFocusPainted(false);
        choice3.addActionListener(cHandler);
        choice3.setActionCommand("c3");
        choiceButtonPanel.add(choice3);
        choice4 = new JButton("Choice 4");
        choice4.setBounds(0,0,300,30);
        choice4.setBackground(Color.BLACK);
        choice4.setForeground(Color.WHITE);
        choice4.setFont(textFont);
        choice4.setFocusPainted(false);
        choice4.addActionListener(cHandler);
        choice4.setActionCommand("c4");
        choiceButtonPanel.add(choice4);

        playerPanel = new JPanel();
        playerPanel.setBounds(900,50,300,400);
        playerPanel.setBackground(Color.BLACK);
        playerPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE, 3));
        playerPanel.setLayout(new GridLayout(6,1));
        window.add(playerPanel);

        goldLabel = new JLabel();
        goldLabel.setFont(textFont);
        goldLabel.setForeground(Color.WHITE);
        goldLabel.setBounds(0,0,300,20);
        playerPanel.add(goldLabel);
        taxLabel = new JLabel();
        taxLabel.setFont(textFont);
        taxLabel.setForeground(Color.WHITE);
        taxLabel.setBounds(0,0,300,20);
        playerPanel.add(taxLabel);
        foodLabel = new JLabel();
        foodLabel.setFont(textFont);
        foodLabel.setForeground(Color.WHITE);
        foodLabel.setBounds(0,0,300,20);
        playerPanel.add(foodLabel);
        woodLabel = new JLabel();
        woodLabel.setFont(textFont);
        woodLabel.setForeground(Color.WHITE);
        woodLabel.setBounds(0,0,300,20);
        playerPanel.add(woodLabel);
        pplLabel = new JLabel();
        pplLabel.setFont(textFont);
        pplLabel.setForeground(Color.WHITE);
        pplLabel.setBounds(0,0,300,20);
        playerPanel.add(pplLabel);
        soldierLabel = new JLabel();
        soldierLabel.setFont(textFont);
        soldierLabel.setForeground(Color.WHITE);
        soldierLabel.setBounds(0,0,300,20);
        playerPanel.add(soldierLabel);
    }
}
