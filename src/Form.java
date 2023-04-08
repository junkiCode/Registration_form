import components.Button;
import components.Flex;
import components.TextField;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.text.GapContent;

import java.util.ArrayList;
import java.util.List;

public class Form {

    public static void main(String[] args){
        JFrame root = new JFrame("Registration Form");
        JPanel container = new JPanel();
        container.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), 16));
        container.setSize(900, 600);

        GridLayout grid = new GridLayout(0, 3);

        grid.setHgap(24);
        grid.setVgap(24);
        container.setLayout(grid);

        TextField firstName = new TextField(container, "", "First Name");
        firstName.setPlaceholder("ex: John");

        TextField midName = new TextField(container, "", "Mid Name");
        midName.setPlaceholder("ex: K.");

        TextField lastName = new TextField(container, "", "Last Name");
        lastName.setPlaceholder("ex: Doe");

        TextField fatherName = new TextField(container, "", "Father Name");
        fatherName.setPlaceholder("ex: Bob Doe");

        TextField motherName = new TextField(container, "", "Mother Name");
        motherName.setPlaceholder("ex: Merry Doe");

        TextField address = new TextField(container, "", "Permanent Address");
        address.setPlaceholder("ex: 32 street, Shinjiku district, Tokyo");

        TextField dob = new TextField(container, "", "Date Of Birth");
        dob.setPlaceholder("ex: 13/02/2001");

        TextField gender = new TextField(container, "Male", "Gender");

        TextField email = new TextField(container, "", "Email");
        email.setPlaceholder("ex: johndoe@gmail.com");

        TextField contactNo = new TextField(container, "", "Contact No.");
        contactNo.setPlaceholder("ex: 98204384");

        TextField parentContactNo = new TextField(container, "", "Parent's Contact No.");
        parentContactNo.setPlaceholder("ex: 48237823");

        TextField appliedCourse = new TextField(container, "", "Applied Course");
        appliedCourse.setPlaceholder("ex: MBA");

        JPanel panel = new JPanel();
        panel.setAlignmentX(32);
        Button btnSubmit = new Button(panel, "Submit");
        Button btnCancel = new Button(panel, "CANCEL");
        btnCancel.setBackground(new Color(87, 87, 87));
        container.add(panel);
        root.add(container);
        root.pack();
        root.setVisible(true);
        root.setDefaultCloseOperation(root.EXIT_ON_CLOSE);
    }

}
