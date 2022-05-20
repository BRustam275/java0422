package ru.gb.bagautdinov.homework8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCalculator extends JFrame {
    private Double liftOperand;
    private String operation;


    public MyCalculator(){
        setTitle("Calculator"); //Создали окошко
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        setLayout(new BorderLayout());
        // Создаем дисплей
        JLabel display = new JLabel("0");
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setFont(new Font("arial", Font.BOLD, 18));
        add(display, BorderLayout.NORTH);

        ActionListener numberListener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource();
                String text = button.getText();
                String displayText = display.getText();

                if (".".equals(text) && displayText.contains(".")){
                    return;
                }
                if ("0".equals(displayText) && !".".equals(text)){
                    displayText = "";
                }
              displayText += text;
                display.setText(displayText);

            }
        };

        ActionListener buttonListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JButton source = (JButton) e.getSource();
                String action = source.getText();
                Double rightOperand = Double.parseDouble(display.getText());

                if ("=".equals(action)){
                    if (liftOperand != null){
                        switch (operation){
                            case "+":
                                display.setText(String.valueOf(liftOperand + rightOperand));
                                break;
                            case "-":
                                display.setText(String.valueOf(liftOperand - rightOperand));
                                break;
                            case "*":
                                display.setText(String.valueOf(liftOperand * rightOperand));
                                break;
                            case "/":
                                display.setText(String.valueOf(liftOperand / rightOperand));
                                break;
                        }
                        liftOperand = Double.parseDouble(display.getText());
                        operation = null;
                    }
                    return;
                }
                liftOperand = Double.parseDouble(display.getText());
                operation = action;
                display.setText("0");
            }
        };
        JPanel numberPanel = new JPanel();
        GridLayout numberLayout = new GridLayout(4,3, 10, 10);
        numberPanel.setLayout(numberLayout);

        for (int i = 0; i < 10; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.addActionListener(numberListener);
            numberPanel.add(button);
        }
        JButton pointButton = new JButton(".");
        pointButton.addActionListener(numberListener);
        JButton negativeButton = new JButton("+/-");

        numberPanel.add(pointButton);
        numberPanel.add(negativeButton);

        JPanel buttonPanel = new JPanel();
        GridLayout buttonLayout = new GridLayout(2, 3, 10, 10);
        buttonPanel.setLayout(buttonLayout);

        for (char c : "C+-*/=".toCharArray()) {
            JButton button = new JButton(String.valueOf(c));
            button.addActionListener(buttonListener);
            buttonPanel.add(button);
        }
        add(numberPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        setVisible(true);

    }

    public static void main(String[] args) {
        new MyCalculator();
    }
}
