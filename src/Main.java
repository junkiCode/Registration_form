import dbConnection.DB;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import components.Button;

public class Main {
	private static final JTable table = new JTable();
	private static final JFrame root = new JFrame("Recorda");
	private static final BorderLayout rootLayout = new BorderLayout();

	public static void main(String[] args){
		rootLayout.setVgap(12);
		root.setLayout(rootLayout);
		root.setSize(new Dimension(1190, 600));

		root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel heading = new JPanel();

		BorderLayout lt = new BorderLayout();
		heading.setLayout(lt);
		JLabel title = new JLabel("Registered Student", SwingConstants.CENTER);
		title.setFont(new Font(null, Font.BOLD, 42));
		title.setForeground(new Color(119, 40, 182, 255));
		heading.add(title, BorderLayout.PAGE_START);
		Button btnAddRecord = new Button("Add New Record");

		btnAddRecord.setLocation(200, 200);
		btnAddRecord.onClick(e -> {
			new Form();
		});
		heading.add(btnAddRecord, BorderLayout.EAST);
		root.add(heading, BorderLayout.PAGE_START);


		Vector<Vector<java.io.Serializable>> record = getRecords();
		renderRecord(record);
		root.setVisible(true);
	}
	private static void renderRecord(Vector<Vector<java.io.Serializable>> records){
		final String[] columns = {"ID", "First Name", "Mid Name",
				"Last " +
						"Name","Father Name", "Mother Name", "Address" +
				"Date " +
				"Of Birth", "Gender", "Email",
				 "Contact No.", "Parent Contact No", "Applied Course"};
		table.setVisible(true);
		DefaultTableModel model = new DefaultTableModel(columns, 1){
			@Override
			public boolean isCellEditable(int row, int column){
				return false;
			}
		};

		for (Vector<java.io.Serializable> record : records) {
			model.addRow(record);
		}
		table.setModel(model);
		table.setRowHeight(42);
		table.setRowSelectionAllowed(false);
		table.setRowMargin(6);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.setFont(new Font(null, Font.PLAIN, 14));
		root.add(table, BorderLayout.CENTER);
	}
	private static Vector<Vector<java.io.Serializable>> getRecords(){
		Vector<Vector<java.io.Serializable>> records = new Vector<Vector<java.io.Serializable>>();
		try {
			Connection con= DB.getConnection();
			Statement stm = con.createStatement();
			ResultSet res = stm.executeQuery("SELECT * FROM " +
					"registered_student");
			while(res.next()){
				Vector<java.io.Serializable> v = new Vector<java.io.Serializable>();
				v.add(res.getInt("id"));
				v.add(res.getString("first_name"));
				v.add(res.getString("mid_name"));
				v.add(res.getString("last_name"));
				v.add(res.getString("father_name"));
				v.add(res.getString("mother_name"));
				v.add(res.getString("address"));
				v.add(res.getString("dob"));
				v.add(res.getString("gender"));
				v.add(res.getString("email"));
				v.add(res.getString("contact_no"));
				v.add(res.getString("parent_contact_no"));
				v.add(res.getString("applied_course"));
				records.add(v);
			}
		}
		catch(Exception err){
			System.out.println("Something went wrong");
			err.printStackTrace();
		}
		return records;
	}

}
