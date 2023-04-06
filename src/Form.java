import components.Button;
import components.TextField;

import java.awt.*;
import java.lang.reflect.Method;
import javax.swing.*;

public class Form {

    public static void main(String[] args){
        JFrame container = new JFrame("Registration Form");
        container.setSize(380, 600);
        container.setLayout(new BoxLayout(container.getContentPane(), BoxLayout.Y_AXIS));
        TextField testField = new TextField(container, "Hello world");
        testField.setPlaceholder("Life is very unexpected");
        TextField testField2 = new TextField(container, "Hello world two");
        Button btnTest = new Button(container, "Click me");
        btnTest.onClick(e -> {
            System.out.println("Hello world");
        });

        container.setVisible(true);
        container.setDefaultCloseOperation(container.EXIT_ON_CLOSE);
    }

}
