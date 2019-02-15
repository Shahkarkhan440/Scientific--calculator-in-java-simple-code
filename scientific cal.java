/**
 * Scientific Calculator By Shahkar Khan (khanstein) p15-6150
 * Different Basic Scientific functions
 * Also user can see history of his/her operation
 * Easy and simple GUI
 * 
 */

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

 
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.lang.Math.*;

class Calc extends JFrame implements ActionListener {

    String str_number = "";
    String buff[];
    String entries[];
    int operation = 0;
    char opeartor = '\0';
    double num1, num2;
    double result;

    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    JButton b0 = new JButton("0");

    JButton add = new JButton("+");
    JButton sub = new JButton("-");
    JButton mul = new JButton("*");
    JButton div = new JButton("/");
    JButton equ = new JButton("=");
    JButton clr = new JButton("CLR");
    JButton dec = new JButton(".");

    JButton sini = new JButton("sin");
    JButton cosi = new JButton("cos");
    JButton tani = new JButton("tan");
    JButton lni = new JButton("ln");
    JButton logi = new JButton("log");
    JButton pii = new JButton("pi");
    JButton cbt = new JButton("cbrt");
    JButton sqt = new JButton("sqrt");
    JButton xsq = new JButton("X^2");
    JButton yt = new JButton("History");
    JButton mc = new JButton("MC");
    JButton mr = new JButton("MR");
    JButton mp = new JButton("M+");
    JButton exit= new JButton("Exit");

    JFrame f = new JFrame("Scientific Calculator");
    JList list = new JList(entries);
    JScrollPane scrollPane;
    JPanel Numberpanel = new JPanel();
    JPanel Resultpanel = new JPanel();
    JPanel Memorypanel = new JPanel();

    JTextField text = new JTextField(15);
    JTextField memt = new JTextField(15);

    public Calc() {

        f.setLayout(new BorderLayout());
        Numberpanel.setLayout(new GridLayout(7, 9));
        Resultpanel.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Numberpanel.add(b1);
        b1.addActionListener(this);
        Numberpanel.add(b2);
        b2.addActionListener(this);
        Numberpanel.add(b3);
        b3.addActionListener(this);
        Numberpanel.add(b4);
        b4.addActionListener(this);
        Numberpanel.add(b5);
        b5.addActionListener(this);
        Numberpanel.add(b6);
        b6.addActionListener(this);
        Numberpanel.add(b7);
        b7.addActionListener(this);
        Numberpanel.add(b8);
        b8.addActionListener(this);
        Numberpanel.add(b9);
        b9.addActionListener(this);
        Numberpanel.add(b0);
        b0.addActionListener(this);
        Numberpanel.add(add);
        add.addActionListener(this);
        Numberpanel.add(sub);
        sub.addActionListener(this);
        Numberpanel.add(mul);
        mul.addActionListener(this);
        Numberpanel.add(div);
        div.addActionListener(this);
        Numberpanel.add(equ);
        equ.addActionListener(this);
        Numberpanel.add(clr);
        clr.addActionListener(this);
        Numberpanel.add(dec);
        dec.addActionListener(this);
        Numberpanel.add(sini);
        sini.addActionListener(this);
        Numberpanel.add(cosi);
        cosi.addActionListener(this);
        Numberpanel.add(tani);
        tani.addActionListener(this);
        Numberpanel.add(logi);
        logi.addActionListener(this);
        Numberpanel.add(lni);
        lni.addActionListener(this);
        Numberpanel.add(pii);
        pii.addActionListener(this);
        Numberpanel.add(cbt);
        cbt.addActionListener(this);
        Numberpanel.add(sqt);
        sqt.addActionListener(this);
        Numberpanel.add(xsq);
        xsq.addActionListener(this);
        Numberpanel.add(yt);
        yt.addActionListener(this);
        Numberpanel.add(mc);
        mc.addActionListener(this);
        Numberpanel.add(mr);
        mr.addActionListener(this);
        Numberpanel.add(mp);
        mp.addActionListener(this);
        Numberpanel.add(exit);
        exit.addActionListener(this);

        text.setFocusable(true);
        text.addKeyListener(new KeyAdapter() {
            public void KeyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (c == KeyEvent.VK_ENTER) {
                    equalto();

                } else if (c == KeyEvent.VK_BACK_SPACE) {
                    str_number = "";
                    text.setText("");

                } else {
                    str_number += c;
                }
            }
        });

        Resultpanel.add(text);
        Resultpanel.add(equ);
         Memorypanel.add(memt);
        equ.addActionListener(this);

        f.add(Numberpanel, BorderLayout.CENTER);
        f.add(Resultpanel, BorderLayout.NORTH);
        f.add(Memorypanel, BorderLayout.SOUTH);

    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            text.setText("1");
            str_number += text.getText();
            text.setText(str_number);
        }
        if (e.getSource() == b2) {
            text.setText("2");
            str_number += text.getText();
            text.setText(str_number);
        }
        if (e.getSource() == b3) {
            text.setText("3");
            str_number += text.getText();
            text.setText(str_number);
        }
        if (e.getSource() == b4) {
            text.setText("4");
            str_number += text.getText();
            text.setText(str_number);
        }
        if (e.getSource() == b5) {
            text.setText("5");
            str_number += text.getText();
            text.setText(str_number);
        }
        if (e.getSource() == b6) {
            text.setText("6");
            str_number += text.getText();
            text.setText(str_number);
        }
        if (e.getSource() == b7) {
            text.setText("7");
            str_number += text.getText();
            text.setText(str_number);
        }
        if (e.getSource() == b8) {
            text.setText("8");
            str_number += text.getText();
            text.setText(str_number);
        }
        if (e.getSource() == b9) {
            text.setText("9");
            str_number += text.getText();
            text.setText(str_number);
        }
        if (e.getSource() == b0) {
            text.setText("0");
            str_number += text.getText();
            text.setText(str_number);
        }
        if (e.getSource() == yt) {
            try {
                JTextArea ta = new JTextArea(20, 60);
                ta.read(new FileReader("C:/Users/MSI/Documents/history.txt"), null);
                ta.setEditable(false);
                JOptionPane.showMessageDialog(yt, new JScrollPane(ta));

            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
        if (e.getSource() == clr) {

            text.setText("");
            operation = 0;
            num1 = 0;
            num2 = 0;
            result = 0;
            opeartor = '\0';
            str_number = "";
        }
        if (e.getSource() == dec) {
            text.setText(".");
            str_number += text.getText();
            text.setText(str_number);
        }
        if (e.getSource() == add) {
            text.setText("+");
            str_number += text.getText();
            text.setText(str_number);

        }
        if (e.getSource() == sub) {
            text.setText("-");
            str_number += text.getText();
            text.setText(str_number);

        }
        if (e.getSource() == mul) {
            text.setText("*");
            str_number += text.getText();
            text.setText(str_number);
        }
        if (e.getSource() == div) {
            text.setText("/");
            str_number += text.getText();
            text.setText(str_number);
        }
        if (e.getSource() == logi) {
            num1 = Double.parseDouble(str_number);
            result = Math.log10(num1);
            try {
                String filename = "C:/Users/MSI/Documents/history.txt";
                FileWriter fw = new FileWriter(filename, true);
                System.out.println(text.getText());
                fw.write("\r\n");
                fw.write("log (" + str_number + ") = " + Double.toString(result));
                fw.write("\r\n");
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            text.setText(Double.toString(result));
            str_number = text.getText();
        }
        if (e.getSource() == lni) {
            num1 = Double.parseDouble(str_number);
            result = Math.log(num1);
            try {
                String filename = "C:/Users/MSI/Documents/history.txt";
                FileWriter fw = new FileWriter(filename, true);
                System.out.println(text.getText());
                fw.write("\r\n");
                fw.write("log (" + str_number + ") = " + Double.toString(result));
                fw.write("\r\n");
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

            }
            text.setText(Double.toString(result));
            str_number = text.getText();
        }
        if (e.getSource() == cosi) {
            num1 = Double.parseDouble(str_number);
            result = Math.log(num1);
            try {
                String filename = "C:/Users/MSI/Documents/history.txt";
                FileWriter fw = new FileWriter(filename, true);
                System.out.println(text.getText());
                fw.write("\r\n");
                fw.write("cos (" + str_number + ") = " + Double.toString(result));
                fw.write("\r\n");
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            text.setText(Double.toString(result));
            str_number = text.getText();
        }
        if (e.getSource() == sini) {
            num1 = Double.parseDouble(str_number);
            result = Math.log(num1);
            try {
                String filename = "C:/Users/MSI/Documents/history.txt";
                FileWriter fw = new FileWriter(filename, true);
                System.out.println(text.getText());
                fw.write("\r\n");
                fw.write("sin (" + str_number + ") = " + Double.toString(result));
                fw.write("\r\n");
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            text.setText(Double.toString(result));
            str_number = text.getText();
        }
        if (e.getSource() == tani) {
            num1 = Double.parseDouble(str_number);
            result = Math.log(num1);
            try {
                String filename = "C:/Users/MSI/Documents/history.txt";
                FileWriter fw = new FileWriter(filename, true);
                System.out.println(text.getText());
                fw.write("\r\n");
                fw.write("tan (" + str_number + ") = " + Double.toString(result));
                fw.write("\r\n");
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            text.setText(Double.toString(result));
            str_number = text.getText();
        }
        if (e.getSource() == pii) {
            text.setText(str_number + Double.toString(Math.PI));
            str_number = text.getText();

        }
        if (e.getSource() == sqt) {
            num1 = Double.parseDouble(str_number);
            result = Math.sqrt(num1);
            try {
                String filename = "C:/Users/MSI/Documents/history.txt";
                FileWriter fw = new FileWriter(filename, true);
                System.out.println(text.getText());
                fw.write("\r\n");
                fw.write("sqrt (" + str_number + ") = " + Double.toString(result));
                fw.write("\r\n");
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            text.setText(Double.toString(result));
            str_number = text.getText();
        }
        if (e.getSource() == cbt) {
            num1 = Double.parseDouble(str_number);
            result = Math.log(num1);
            try {
                String filename = "C:/Users/MSI/Documents/history.txt";
                FileWriter fw = new FileWriter(filename, true);
                System.out.println(text.getText());
                fw.write("\r\n");
                fw.write("cbrt (" + str_number + ") = " + Double.toString(result));
                fw.write("\r\n");
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            text.setText(Double.toString(result));
            str_number = text.getText();
        }
        if (e.getSource() == xsq) {

            num1 = Double.parseDouble(str_number);
            result = num1 * num1;
            try {
                String filename = "C:/Users/MSI/Documents/history.txt";
                FileWriter fw = new FileWriter(filename, true);
                System.out.println(text.getText());
                fw.write("\r\n");
                fw.write(str_number + "^2= " + Double.toString(result));
                fw.write("\r\n");
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

            }
            text.setText(Double.toString(result));
            str_number = text.getText();
        }
        if (e.getSource() == mp) {
            memt.setText(str_number);
        }
        if (e.getSource() == mr) {
            str_number += memt.getText();
            text.setText(str_number);
        }
        if (e.getSource() == mc) {
            memt.setText("");
        }
        if (e.getSource() == equ) {
            equalto();
        }
        if (e.getSource() == exit) {
            System.exit(0);
        }
    }
    public void equalto() {
        if (str_number != "") {
            text.setText(str_number);
            System.out.println(str_number);
            operation = 0;

            ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("javascript");
            try {
                result = Double.parseDouble(engine.eval(str_number).toString());
            } catch (ScriptException ex) {
                Logger.getLogger(Calc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                String filename = "C:/Users/MSI/Documents/history.txt";
                FileWriter fw = new FileWriter(filename, true);
                System.out.println(text.getText());
                fw.write("\r\n");
                fw.write(str_number + "^2= " + Double.toString(result));
                fw.write("\r\n");
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

            text.setText(Double.toString(result));
            str_number = text.getText();
        }
    }
    public static void main(String[] args) {
        Calc c = new Calc();
    }
}