package br.com.calc.javacore.classes;

import javax.swing.*;
import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);
    float num1, num2, resultado;
    String language, operac;
    char verifi;

    public void saberQualOperacao() {
        do {
            language = JOptionPane.showInputDialog("Welcome to Mayco's Calculator \n " +
                    "\n This program work in two different languages (Portuguese and English)\n" +
                    "\n What language do you want ? ('P' para Português || 'E' to English )\n ");

            if (language.equals("E")) {

                operac = JOptionPane.showInputDialog("What operation do you want to perform? (Add, Divide, Multiply, Subtract)");

                switch (operac) {
                    case "Add":
                        JOptionPane.showMessageDialog(null, "enter the numbers you want to add:");
                        somarNumeroE();
                        break;
                    case "Divide":
                        JOptionPane.showMessageDialog(null, " Enter the numbers you want to Divide:");
                        dividirNumeroE();
                        break;
                    case "Multiply":
                        JOptionPane.showMessageDialog(null, " Enter the numbers you want to Multiply:");
                        multiplicarNumeroE();
                        break;
                    case "Subtract":
                        JOptionPane.showMessageDialog(null, "Enter the numbers you want to Subtract:");
                        subtrairNumeroE();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Please, enter exactly as it is written");
                }
                verifi = JOptionPane.showInputDialog(" Do you want to do some other operation ? (y para YES / n para NO) ").charAt(0);
            }

            if (language.equals("P")) {
                operac = JOptionPane.showInputDialog("Qual operação você deseja realizar ? (Adição, Divisão, Multiplicação, Subtração)");

                switch (operac) {
                    case "Adição":
                        JOptionPane.showMessageDialog(null, "Insira os números que você deseja somar:");
                        somarNumeroP();
                        break;
                    case "Divisão":
                        JOptionPane.showMessageDialog(null, "Insira os números que você deseja Dividir:");
                        dividirNumeroP();
                        break;
                    case "Multiplicação":
                        JOptionPane.showMessageDialog(null, "Insira os números que você deseja Multiplicar:");
                        multiplicarNumeroP();
                        break;
                    case "Subtração":
                        JOptionPane.showMessageDialog(null, "Insira os números que você deseja subtrair:");
                        subtrairNumeroP();
                    default:
                        JOptionPane.showMessageDialog(null, "Por favor, insira exatamente como está escrito");
                }

                verifi = JOptionPane.showInputDialog(" Você deseja realizar outra operação ? (y para SIM / n para NÃO) ").charAt(0);
            }
        } while (verifi == 'y');
    }

    public float somarNumeroP() {
        num1 = Float.parseFloat(JOptionPane.showInputDialog(" Insira o primeiro número que deseja somar"));
        num2 = Float.parseFloat(JOptionPane.showInputDialog(" Insira o segundo número que deseja somar"));
        resultado = num1 + num2;
        JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + resultado);
        return resultado;
    }

    public float somarNumeroE() {
        num1 = Float.parseFloat(JOptionPane.showInputDialog(" Enter the first number you want to add"));
        num2 = Float.parseFloat(JOptionPane.showInputDialog(" Enter the second number you want to add"));
        resultado = num1 + num2;
        JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + resultado);
        return resultado;
    }

    public float multiplicarNumeroP() {
        num1 = Float.parseFloat(JOptionPane.showInputDialog(" Insira o primeiro número que deseja multiplicar"));
        num2 = Float.parseFloat(JOptionPane.showInputDialog(" Insira o segundo número que deseja multiplicar"));
        resultado = num1 * num2;

        JOptionPane.showMessageDialog(null, num1 + " * " + num2 + " = " + resultado);
        return resultado;
    }

    public float multiplicarNumeroE() {

        num1 = Float.parseFloat(JOptionPane.showInputDialog(" Enter the first number you want to multiply"));
        num2 = Float.parseFloat(JOptionPane.showInputDialog(" Enter the second number you want to multiply"));

        resultado = num1 * num2;

        JOptionPane.showMessageDialog(null, num1 + " * " + num2 + " = " + resultado);
        return resultado;
    }

    public float dividirNumeroP() {
        num1 = Float.parseFloat(JOptionPane.showInputDialog(" Insira o primeiro número que deseja dividir"));
        num2 = Float.parseFloat(JOptionPane.showInputDialog(" Insira o segundo número que deseja dividir"));

        resultado = num1 / num2;
        JOptionPane.showMessageDialog(null, num1 + " / " + num2 + " = " + resultado);
        return resultado;

    }

    public float dividirNumeroE() {

        num1 = Float.parseFloat(JOptionPane.showInputDialog(" Enter the first number you want to divide"));
        num2 = Float.parseFloat(JOptionPane.showInputDialog(" Enter the second number you want to divide"));

        resultado = num1 / num2;
        JOptionPane.showMessageDialog(null, num1 + " / " + num2 + " = " + resultado);
        return resultado;

    }

    public float subtrairNumeroP() {

        num1 = Float.parseFloat(JOptionPane.showInputDialog(" Insira o primeiro número que deseja subtrair"));
        num2 = Float.parseFloat(JOptionPane.showInputDialog(" Insira o segundo número que deseja subtrair"));
        resultado = num1 - num2;
        JOptionPane.showMessageDialog(null, num1 + " - " + num2 + " = " + resultado);
        return resultado;
    }

    public float subtrairNumeroE() {

        num1 = Float.parseFloat(JOptionPane.showInputDialog(" Enter the first number you want to subtract"));
        num2 = Float.parseFloat(JOptionPane.showInputDialog(" Enter the second number you want to subtract"));

        resultado = num1 - num2;
        JOptionPane.showMessageDialog(null, num1 + " - " + num2 + " = " + resultado);
        return resultado;
    }
}
