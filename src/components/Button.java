package components;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JButton {
    private static final Color defaultColor = new Color(102, 43, 214);
    protected static Border border = BorderFactory.createLineBorder(defaultColor, 8, true);

    public Button( String label){
        this.setText(label);
        defaultConfig(this);
    }

    public void setBg(Color c){
        this.setBackground(c);
        Border border = BorderFactory.createLineBorder(c, 8, true);

        this.setBorder(border);
    }
    public void setFg(Color c){
        this.setForeground(c);
    }
    private static void defaultConfig(JButton btn){
        // Set the default background
        btn.setBackground(defaultColor);
        btn.setForeground(Color.white);

//        Set default border and border color

        btn.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
        btn.setBorder(border);

//        disable border text highlight and outline during click
        btn.setRolloverEnabled(false);
        btn.setIgnoreRepaint(true);
        btn.setFocusPainted(false);


        btn.setSize(new Dimension(120, 42));
        btn.setMaximumSize(new Dimension(200, 42));
        btn.setMinimumSize(new Dimension(120, 42));
        btn.setPreferredSize(new Dimension(120, 42));

    }

    public void onClick(OnClick cb){
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)  {
                cb.click(actionEvent);
            }
        });
    }

}

