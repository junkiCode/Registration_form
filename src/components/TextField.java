package components;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

final public class TextField extends java.awt.TextField {
    private final JTextField input = new JTextField();
    public String value = null;
    public TextField(Container container){
        addComponent(container);
    }

    public TextField(Container container, String str){
        addComponent(container);
        TextField.paint(input);
        if(!str.trim().isEmpty()){
        value = str;
        input.setText(value);
        input.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
               value = input.getText();
            }
        });
        }
    }
    public void setPlaceholder(String text){
        input.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                if(value.trim().isEmpty()){
                    input.setText(text);
                    input.setForeground(new Color(231, 20, 20));
                }
            }

            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                if(value.trim().isEmpty()){
                input.setText("");
                }
            }
        });
    }
    private void addComponent(Container c){
        c.add(TextField.this.input);
    }

    private static void paint(JTextField j){
        j.setSize(new Dimension(250, 50));
    }
}
