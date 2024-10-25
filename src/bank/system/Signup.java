package bank.system;
import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JLabel l3,l4,l5,l6,l7,l8,l9,l10,labelAdd;
    JRadioButton r1,r2,r3,m1,m2,m3;
    JButton next;
    JTextArea textAdd;
    JTextField textName ,textFname, textEmail,textPin,textPan,textAdhar;
    JDateChooser dateChooser;
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5,comboBox6;
    Random ran = new Random();
    long first4 =(ran.nextLong() % 9000L) +1000L;
    String first = " " + Math.abs(first4);
    Signup(){

        JLabel label1 = new JLabel("APPLICATION FORM :"+ first);
        label1.setBounds(190,45,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("");
        label2.setFont(new Font("Ralway",Font.BOLD, 22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel labelName = new JLabel("Name ");
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelName.setBounds(100,150,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD, 14));
        textName.setBounds(300,150,400,30);
        add(textName);
        
        JLabel DOB = new JLabel("Date of Birth");
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        DOB.setBounds(100,200,200,30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,200,400,30);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender");
        labelG.setFont(new Font("Raleway", Font.BOLD, 20));
        labelG.setBounds(100,250,200,30);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD,14));
        r1.setBounds(300,250,60,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD,14));
        r2.setBounds(450,250,90,30);
        add(r2);
        
        r3 = new JRadioButton("Other");
        r3.setFont(new Font("Raleway", Font.BOLD,14));
        r3.setBounds(600,250,90,30);
        add(r3);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        
        JLabel labelEmail = new JLabel("Email address ");
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        labelEmail.setBounds(100,300,200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD, 14));
        textEmail.setBounds(300,300,400,30);
        add(textEmail);
        
        JLabel labelAdd = new JLabel("Address ");
        labelAdd.setFont(new Font("Raleway", Font.BOLD, 20));
        labelAdd.setBounds(100,350,200,30);
        add(labelAdd);

        textAdd = new JTextArea(); 
        textAdd.setFont(new Font("Raleway", Font.BOLD, 14));
        JScrollPane scrollPaneAdd = new JScrollPane(textAdd);
        scrollPaneAdd.setBounds(300, 350, 400, 90); // Adjusted position and size
        add(scrollPaneAdd);
        
        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("Raleway", Font.BOLD,18));
        l3.setBounds(100,460,100,30);
        add(l3);

        String religion[] = {"Hindu","Muslim","Sikh", "Christian", "Other"};
        comboBox = new JComboBox(religion);
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(200,460,200,30);
        add(comboBox);
        
        JLabel l4 = new JLabel("Category : ");
        l4.setFont(new Font("Raleway", Font.BOLD,18));
        l4.setBounds(100,520,100,30);
        add(l4);

        String Category [] = {"General","OBC","SC", "ST", "Other"};
        comboBox2 = new JComboBox(Category);
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(200,520,200,30);
        add(comboBox2);
        
        JLabel l5 = new JLabel("Income : ");
        l5.setFont(new Font("Raleway", Font.BOLD,18));
        l5.setBounds(450,460,100,30);
        add(l5);

        String income [] = {"Null","under 1,00,000","under 5,00,000", "Uptp 10,00,000","Above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(560,460,200,30);
        add(comboBox3);
        
        JLabel l6 = new JLabel("Education: ");
        l6.setFont(new Font("Raleway", Font.BOLD,18));
        l6.setBounds(450,520,150,30);
        add(l6);

        String educational [] = {"Non-Graduate","Graduate","Post-Graduate", "Doctrate", "Others"};
        comboBox4 = new JComboBox(educational);
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(560,520,200,30);
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation : ");
        l7.setFont(new Font("Raleway", Font.BOLD,18));
        l7.setBounds(100,580,150,30);
        add(l7);

        String Occupation [] = {"Salaried","Self-Employed","Business", "Student", "Retired", "Other"};
        comboBox5 = new JComboBox(Occupation);
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(220,580,200,30);
        add(comboBox5);
        
        JLabel l8 = new JLabel("AccType: ");
        l8.setFont(new Font("Raleway", Font.BOLD,18));
        l8.setBounds(450,580,150,30);
        add(l8);

        String aType[] = {"Saving","Fixed","Current"};
        comboBox6= new JComboBox(aType);
        comboBox6.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox6.setBounds(560,580,200,30);
        add(comboBox6);
        
        JLabel l9 = new JLabel("PAN Number : ");
        l9.setFont(new Font("Raleway", Font.BOLD,18));
        l9.setBounds(100,640,150,30);
        add(l9);

        textPan = new JTextField();
        textPan.setFont(new Font("Raleway", Font.BOLD,18));
        textPan.setBounds(300,640,400,30);
        add(textPan);
        
        JLabel l10 = new JLabel("AadharNumber : ");
        l10.setFont(new Font("Raleway", Font.BOLD,18));
        l10.setBounds(100,690,150,30);
        add(l10);

        textAdhar = new JTextField();
        textAdhar.setFont(new Font("Raleway", Font.BOLD,18));
        textAdhar.setBounds(300,690,400,30);
        add(textAdhar);
        
        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(630,730,80,30);
        next.addActionListener(this);
        add(next);
        
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
        String cardno = "" + Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L)+ 1000L;
        String pin = "" + Math.abs(first3);
        
        String formno = first;
        String name = textName.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        }else if (r2.isSelected()){
            gender = "Female";
        }
        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();
        String atype = (String) comboBox6.getSelectedItem();
        String pan = textPan.getText();
        String addhar = textAdhar.getText();
        String email = textEmail.getText();
        String address = textAdd.getText();
        
        try{
            if (textName.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            } else if (!isValidEmail(email)) {
                JOptionPane.showMessageDialog(null, "Invalid email address");
            } else if (!isValidPAN(pan)) {
                JOptionPane.showMessageDialog(null, "Invalid PAN number");
            } else if (!isValidAadhar(addhar)) {
                JOptionPane.showMessageDialog(null, "Invalid Aadhar number");
            } else {
                Connn c = new Connn();
                String q = "insert into signup values('"+formno+"', '"+name+"','"+dob+"','"+gender+"','"+email+"','"+address+"','"+rel+"','"+inc+"','"+edu+"','"+occ+"','"+atype+"','"+pan+"','"+addhar+"')";
                String q1 = "insert into details values('"+formno+"', '"+atype+"','"+cardno+"','"+pin+"')";
                c.statement.executeUpdate(q);
                c.statement.executeUpdate(q1);
                JOptionPane.showMessageDialog(null,"Card Number : "+cardno+"\n Pin : "+pin);
                new Deposit(pin);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }
    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        return email.matches(emailRegex);
    }
    private boolean isValidPAN(String pan) {
        String panRegex = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
        return pan.matches(panRegex);
    }
    private boolean isValidAadhar(String aadhar) {
        String aadharRegex = "^[0-9]{12}$";
        return aadhar.matches(aadharRegex);
    }

    public static void main(String[] args) {
        new Signup();
    }
}