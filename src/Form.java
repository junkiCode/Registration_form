import components.Button;
import components.SelectBox;
import components.TextField;
import dbConnection.DB;

import java.awt.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import javax.swing.*;

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

//        TextField gender = new TextField(container, "Male", "Gender");
        String[] genders = {"Male", "Female", "Other"};
        SelectBox gender = new SelectBox(container, genders, "Gender");

        TextField email = new TextField(container, "", "Email");
        email.setPlaceholder("ex: johndoe@gmail.com");

        TextField contactNo = new TextField(container, "", "Contact No.");
        contactNo.setPlaceholder("ex: 98204384");

        TextField parentContactNo = new TextField(container, "", "Parent's Contact No.");
        parentContactNo.setPlaceholder("ex: 48237823");

        String[] course = {"BBA", "BCA", "MBA", "Other"};
        SelectBox appliedCourse = new SelectBox(container, course, "Applied " +
                "Course");

        JPanel panel = new JPanel();
        panel.setAlignmentX(32);
        Button btnSubmit = new Button(panel, "Submit");
        btnSubmit.onClick(e -> {
            Connection con = null;
            try {
                 con = DB.getConnection();
                PreparedStatement stm = con.prepareStatement("INSERT INTO " +
                        "registered_student (first_name, mid_name, last_name," +
                        " " +
                        "father_name, mother_name, address, dob, gender, " +
                        "email, contact_no, parent_contact_no, " +
                        "applied_course) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

                stm.setString(1, firstName.getValue());
                stm.setString(2, midName.getValue());
                stm.setString(3, lastName.getValue());
                stm.setString(4, fatherName.getValue());
                stm.setString(5, motherName.getValue());
                stm.setString(6, address.getValue());
                stm.setString(7,
                        dob.getValue());
                stm.setString(8, gender.getSelected());
                stm.setString(9, email.getValue());
                stm.setString(10, contactNo.getValue());
                stm.setString(11, parentContactNo.getValue());
                stm.setString(12, appliedCourse.getSelected());

                int res = stm.executeUpdate();
                if(res > 0){
                    System.out.println("One Record is added");
                }
                else {
                    System.out.println("Can't add record");
                }
                con.close();
            }
            catch (Exception er){
                er.printStackTrace();
            }

        });
        Button btnCancel = new Button(panel, "CANCEL");
        btnCancel.setBackground(new Color(87, 87, 87));
        container.add(panel);
        root.add(container);
        root.pack();
        root.setVisible(true);
        root.setDefaultCloseOperation(root.EXIT_ON_CLOSE);
    }

}
