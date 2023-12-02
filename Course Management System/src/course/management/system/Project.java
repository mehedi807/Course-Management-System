
package course.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener {

    Project() {
        setSize(1540, 850);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/aa.png"));
        Image i2 = i1.getImage().getScaledInstance(1450, 850, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        JMenuBar mb = new JMenuBar();
        mb.setPreferredSize(new Dimension(100,60));
        mb.setBackground(new Color(43, 44, 90));
        Font f = new Font("Ubuntu", Font.PLAIN, 30);
        Font g = new Font("Ubuntu", Font.PLAIN, 20);
        UIManager.put("Menu.font", f);
        
        // New Information
        JMenu newInformation = new JMenu("New Information");
        newInformation.setForeground(Color.WHITE);
        mb.add(newInformation);

        UIManager.put("MenuItem.font", g);
        
        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.WHITE);
        facultyInfo.addActionListener(this);
        newInformation.add(facultyInfo);
        
        JMenuItem studentInfo = new JMenuItem("New Student Information");
        studentInfo.setBackground(Color.WHITE);
        studentInfo.addActionListener(this);
        newInformation.add(studentInfo);

        UIManager.put("MenuItem.font", g);
        
        // Details
        JMenu details = new JMenu("View Details");
        details.setForeground(Color.WHITE);
        mb.add(details);
        
        JMenuItem facultydetails = new JMenuItem("View Faculty Details");
        facultydetails.setBackground(Color.WHITE);
        facultydetails.addActionListener(this);
        details.add(facultydetails);
        
        JMenuItem studentdetails = new JMenuItem("View Student Details");
        studentdetails.setBackground(Color.WHITE);
        studentdetails.addActionListener(this);
        details.add(studentdetails);

        UIManager.put("MenuItem.font", g);
        
        
        
        // Exams
        JMenu exam = new JMenu("Examination");
        exam.setForeground(Color.WHITE);
        mb.add(exam);
        
        JMenuItem examinationdetails = new JMenuItem("Examination Results");
        examinationdetails.setBackground(Color.WHITE);
        examinationdetails.addActionListener(this);
        exam.add(examinationdetails);
        
        JMenuItem entermarks = new JMenuItem("Enter Marks");
        entermarks.setBackground(Color.WHITE);
        entermarks.addActionListener(this);
        exam.add(entermarks);
        UIManager.put("MenuItem.font", g);
        
        // UpdateInfo
        JMenu updateInfo = new JMenu("Update Details");
        updateInfo.setForeground(Color.WHITE);
        mb.add(updateInfo);
        
        JMenuItem updatefacultyinfo = new JMenuItem("Update Faculty Details");
        updatefacultyinfo.setBackground(Color.WHITE);
        updatefacultyinfo.addActionListener(this);
        updateInfo.add(updatefacultyinfo);
        
        JMenuItem updatestudentinfo = new JMenuItem("Update Student Details");
        updatestudentinfo.setBackground(Color.WHITE);
        updatestudentinfo.addActionListener(this);
        updateInfo.add(updatestudentinfo);
        UIManager.put("MenuItem.font", g);
        
        
        // exit
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.WHITE);
        mb.add(exit);

        UIManager.put("MenuItem.font", g);
        
        JMenuItem ex = new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        exit.add(ex);
        
        setJMenuBar(mb);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();
        
        if (msg.equals("Exit")) {
            setVisible(false);
        }
        else if (msg.equals("New Faculty Information")) {
            new AddTeacher();
        } else if (msg.equals("New Student Information")) {
            new AddStudent();
        } else if (msg.equals("View Faculty Details")) {
            new TeacherDetails();
        } else if (msg.equals("View Student Details")) {
            new StudentDetails();
        }
        else if (msg.equals("Update Faculty Details")) {
            new UpdateTeacher();
        } else if (msg.equals("Update Student Details")) {
            new UpdateStudent();
        } else if (msg.equals("Enter Marks")) {
            new EnterMarks();
        } else if (msg.equals("Examination Results")) {
            new ExaminationDetails();
        }

    }

    public static void main(String[] args) {
        new Project();
    }
}
