package com.homecorporation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {

    //Текстовое поле
    private JTextField textFieldResult;

    //MC, MR, MS, M+, M-
    private JButton buttonMemoryClear, buttonMemoryRead, buttonMemorySave, buttonMemoryAdd, buttonMemoryDeduct;

    //<-, C
    private JButton buttonClearNumber, buttonClear;

    //+, -, *, /, =, %, +-, sqrt, .
    private JButton buttonPlus, buttonMinus, buttonMultiple, buttonDivide, buttonResult,
            buttonRemainderDivision, buttonPlusMinus, buttonSQRT, buttonPoint;

    //0, 1, 2, 3, 4, 5, 6, 7, 8, 9
    private JButton button0, button1, button2, button3, button4, button5, button6, button7,
            button8, button9;



    private String memorySave = "0";
    //Знак
    private char sign = '+';
    //Первое вводимое число
    private double firstNumber = 0;
    //Второе вводимое число
    private double lastNumber = 0;
    //Рузельтат вічислений
    private double result = 0;
    //Флаг чисел (для записи firstNumber, lastNumber)
    private boolean flagNumber = false;
    //Флаг очистки textField
    private boolean flagClear = true;
    //Количество введенных чисел (для проверки ввода firstNumber и lastNumber)
    private int countNumber = 0;

    /**
     * Главный мотод (точка входа в программу)
     * @param args
     */
    public static void main(String args[]) {

        //Создаем эказемпляр класса
        Calculator calculator = new Calculator();
    }


    /**
     * Конструктор
     */
    public Calculator() {
        super("Calculator");
        setLayout(null);

        //Вызываем методы (создание, добавление, размещение элементов на фрейме)
        createElements();
        addElements();
        layoutElements();
        stylesElements();

        //Вешаем события на кнопки
        PushButton pushButton = new PushButton();
        AdditionalFunctionality additionalFunctionality = new AdditionalFunctionality();


        buttonMemoryClear.addActionListener(additionalFunctionality);
        buttonMemoryRead.addActionListener(additionalFunctionality);
        buttonMemorySave.addActionListener(additionalFunctionality);
        buttonMemoryAdd.addActionListener(additionalFunctionality);
        buttonMemoryDeduct.addActionListener(additionalFunctionality);

        buttonClearNumber.addActionListener(additionalFunctionality);
        buttonClear.addActionListener(additionalFunctionality);

        buttonPlus.addActionListener(pushButton);
        buttonMinus.addActionListener(pushButton);
        buttonMultiple.addActionListener(pushButton);
        buttonDivide.addActionListener(pushButton);
        buttonResult.addActionListener(pushButton);
        buttonRemainderDivision.addActionListener(pushButton);
        buttonPlusMinus.addActionListener(additionalFunctionality);
        buttonSQRT.addActionListener(additionalFunctionality);
        buttonPoint.addActionListener(pushButton);

        //
        button0.addActionListener(pushButton);
        button1.addActionListener(pushButton);
        button2.addActionListener(pushButton);
        button3.addActionListener(pushButton);
        button4.addActionListener(pushButton);
        button5.addActionListener(pushButton);
        button6.addActionListener(pushButton);
        button7.addActionListener(pushButton);
        button8.addActionListener(pushButton);
        button9.addActionListener(pushButton);


        //Параметры главного фрейма
        setSize(265, 305);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * Метод отвечает за создание всех компонентов
     */
    private void createElements() {
        //Текстовое поле
        textFieldResult = new JTextField("0");

        //MC, MR, MS, M+, M-
        buttonMemoryClear = new JButton("MC");
        buttonMemoryRead = new JButton("MR");
        buttonMemorySave = new JButton("MS");
        buttonMemoryAdd = new JButton("M+");
        buttonMemoryDeduct = new JButton("M-");

        //<-, C
        buttonClearNumber = new JButton("<-");
        buttonClear = new JButton("C");

        //+, -, *, /, =, %, +-, sqrt, .
        buttonPlus = new JButton("+");
        buttonMinus = new JButton("-");
        buttonMultiple = new JButton("*");
        buttonDivide = new JButton("/");
        buttonResult = new JButton("=");
        buttonRemainderDivision = new JButton("%");
        buttonPlusMinus = new JButton("(-)");
        buttonSQRT = new JButton("sqrt");
        buttonPoint = new JButton(".");

        //0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
    }

    /**
     * Метод отвечает за добавление элементов на фрейм
     */
    private void addElements() {
        //Текстовое поле
        add(textFieldResult);

        //MC, MR, MS, M+, M-
        add(buttonMemoryClear);
        add(buttonMemoryRead);
        add(buttonMemorySave);
        add(buttonMemoryAdd);
        add(buttonMemoryDeduct);

        //<-, C
        add(buttonClearNumber);
        add(buttonClear);

        //+, -, *, /, =, %, +-, sqrt, .
        add(buttonPlus);
        add(buttonMinus);
        add(buttonMultiple);
        add(buttonDivide);
        add(buttonResult);
        add(buttonRemainderDivision);
        add(buttonPlusMinus);
        add(buttonSQRT);
        add(buttonPoint);

        //0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        add(button0);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);
        add(button9);
    }

    /**
     * Метод отвечает за размещение элементов на текущем фрейме
     */
    private void layoutElements() {
        //Кординаты(x, y, w, h)
        //Текстовое поле
        textFieldResult.setBounds(10, 10, 245, 40);

        //MC, MR, MS, M+, M-
        buttonMemoryClear.setBounds(10, 60, 45, 35);
        buttonMemoryRead.setBounds(60, 60, 45, 35);
        buttonMemorySave.setBounds(110, 60, 45, 35);
        buttonMemoryAdd.setBounds(160, 60, 45, 35);
        buttonMemoryDeduct.setBounds(210, 60, 45, 35);

        //<-, C
        buttonClearNumber.setBounds(10, 100, 45, 35);
        buttonClear.setBounds(60, 100, 95, 35);

        //+, -, *, /, =, %, +-, sqrt, .
        buttonPlus.setBounds(160, 260, 45, 35);
        buttonMinus.setBounds(160, 220, 45, 35);
        buttonMultiple.setBounds(160, 180, 45, 35);
        buttonDivide.setBounds(160, 140, 45, 35);
        buttonResult.setBounds(210, 180, 45, 115);
        buttonRemainderDivision.setBounds(210, 140, 45, 35);
        buttonPlusMinus.setBounds(160, 100, 45, 35);
        buttonSQRT.setBounds(210, 100, 45, 35);
        buttonPoint.setBounds(110, 260, 45, 35);

        //0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        button0.setBounds(10, 260, 95, 35);
        button1.setBounds(10, 220, 45, 35);
        button2.setBounds(60, 220, 45, 35);
        button3.setBounds(110, 220, 45, 35);

        button4.setBounds(10, 180, 45, 35);
        button5.setBounds(60, 180, 45, 35);
        button6.setBounds(110, 180, 45, 35);
        button7.setBounds(10, 140, 45, 35);
        button8.setBounds(60, 140, 45, 35);
        button9.setBounds(110, 140, 45, 35);
    }

    /**
     * Метод отвечает за оформлениее элементов
     */
    private void stylesElements() {
        //
        textFieldResult.setEditable(false);
        textFieldResult.setFont(new Font("Times new Roman", Font.BOLD, 20));
        textFieldResult.setHorizontalAlignment ( JTextField.RIGHT );

        //MC, MR, MS, M+, M-
        JButton buttonMemory[] = {buttonMemoryClear, buttonMemoryRead, buttonMemorySave, buttonMemoryAdd, buttonMemoryDeduct};
        for(int i=0; i<buttonMemory.length; i++) {
            buttonMemory[i].setMargin(new Insets(0,0,0,0));
        }

        //buttonMemoryAdd.setEnabled(false);
        //buttonMemoryDeduct.setEnabled(false);
        buttonMemoryRead.setToolTipText(memorySave);

        //<-, C
        JButton buttonCLS[] = {buttonClearNumber, buttonClear};
        for(int i=0; i<buttonCLS.length; i++) {
            buttonCLS[i].setMargin(new Insets(0,0,0,0));
        }

        //+, -, *, /, =, %, +-, sqrt, .
        JButton buttonSign[] = {buttonPlus, buttonMinus, buttonMultiple, buttonDivide, buttonResult,
                buttonRemainderDivision, buttonPlusMinus, buttonSQRT, buttonPoint};
        for(int i=0; i<buttonSign.length; i++) {
            buttonSign[i].setMargin(new Insets(0,0,0,0));
        }

        //0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        JButton buttonNumber[] = {button0, button1, button2, button3, button4, button5, button6, button7,
                button8, button9};
        for(int i=0; i<buttonNumber.length; i++) {
            buttonNumber[i].setMargin(new Insets(0,0,0,0));
        }

    }


    /**
     *
     * @param firstNumber
     * @param lastNumber
     * @param sign
     */
    private double calculate(double firstNumber, double lastNumber, char sign) {

        double result = 0;

        switch (sign) {
            case '+':
                result = firstNumber + lastNumber;
                break;
            case '-':
                result = firstNumber - lastNumber;
                break;
            case '*':
                result = firstNumber * lastNumber;
                break;
            case '/':
                result = firstNumber / lastNumber;
                break;
        }

        return result;
    }


    /**
     * Метод проверки типа на double
     * @param number
     * @return
     */
    private boolean isDouble(double number) {
        int buff = (int) number;
        if((number - buff) > 0)
            return true;
        return false;
    }

    /**
     * Метод которые проверяет является ли число символом
     * @param z
     * @return
     */
    private boolean isSign(char z) {
        switch(z) {
            case '+':
            case '-':
            case '*':
            case '/':
            case '=':
                return true;
            default: return false;
        }
    }

    /**
     * Логика работі калькулятора
     */

    private class PushButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            //Кнопка которая нажата в данный момент
            JButton button = (JButton) actionEvent.getSource();


            //Если пользователь вводт числа то записуем их в текстовое поле
            if(!isSign(button.getText().charAt(0))) {
                //Очищаем поле когда флаг очистки равен true
                if(flagClear) {
                    textFieldResult.setText("");
                    countNumber++;
                }
                //Ограничиваем количество введенніх символов
                if(textFieldResult.getText().length() < 10)
                    textFieldResult.setText(textFieldResult.getText() + button.getText());
                //Делаем флаг очискти false для дозаписи символов в поле
                flagClear = false;

            } else {
                if(!flagNumber) {
                    firstNumber = Double.parseDouble(textFieldResult.getText());
                    flagNumber = true;
                    flagClear = true;
                } else if(countNumber == 2) {
                    lastNumber = Double.parseDouble(textFieldResult.getText());
                    //System.out.println(lastNumber);
                    result = calculate(firstNumber, lastNumber, sign);
                    firstNumber = result;
                    textFieldResult.setText(String.valueOf(result).replace(".0", ""));
                    flagClear = true;
                    System.out.println(firstNumber);
                    System.out.println(lastNumber);
                    countNumber = 1;
                }
                sign = button.getText().charAt(0);
            }
        }
    }


    /**
     * Класс который отвечает за дополнительній функционал калькулятора
     * MC, MR, MS, M+, M-, <-, C, sqrt, %/
     */
    private class AdditionalFunctionality implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            JButton button = (JButton)actionEvent.getSource();

            //Memory
            if(button.getText().equals("MS")) {
                memorySave = textFieldResult.getText();
            } else if(button.getText().equals("MR")) {
                textFieldResult.setText("");
                textFieldResult.setText(memorySave);
                countNumber = 2;
            } else if(button.getText().equals("MC")) {
                memorySave = "0";
            } else if(button.getText().equals("M+")) {
                result = result + Double.parseDouble(memorySave);
                textFieldResult.setText(String.valueOf(result).replace(".0", ""));
                firstNumber = result;
            } else if(button.getText().equals("M-")) {
                result = result - Double.parseDouble(memorySave);
                textFieldResult.setText(String.valueOf(result).replace(".0", ""));
                firstNumber = result;
            } else if(button.getText().equals("C")) {
                clearTextField();
            } else if(button.getText().equals("<-")) {
                clearNumber();
            } else if(button.getText().equals("sqrt")) {
                double sqrt = Math.sqrt(Double.parseDouble(textFieldResult.getText()));
                firstNumber = sqrt;
                textFieldResult.setText(String.valueOf(sqrt).replace(".0", ""));
            } else if(button.getText().equals("(-)")) {
                textFieldResult.setText("-" + textFieldResult.getText());
            }

        }

        /**
         * Метод который очищает текстовое поле
         */
        private void clearTextField() {
            textFieldResult.setText("0");
            flagClear = true;
            flagNumber = false;
            countNumber = 0;
        }

        /**
         * Метод который очищает посимвольно
         */
        private void clearNumber() {
            if(textFieldResult.getText().length()-1 <= 0 ) {
                textFieldResult.setText("0");
                flagClear = true;
                flagNumber = false;
                countNumber = 0;
            } else {
                String buff = textFieldResult.getText().substring(0, textFieldResult.getText().length() - 1);
                textFieldResult.setText(buff);
                firstNumber = Double.parseDouble(buff);
            }
        }

    }
}
