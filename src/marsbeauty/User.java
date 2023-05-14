package marsbeauty;

import java.awt.BorderLayout;
import java.awt.Font;
import java.io.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;

public class User {

    String name;
    String Fname;
    String Lname;
    String phone;
    String password;
    String Copassword;
    String City;
    String Country;
    int phoneStart;
    String CardNo;
    String Cardholder;
    String Date;
    Register r = new Register();
    static ArrayList<User> u = new ArrayList();
    boolean nameCheck = false;
    JLabel red = new JLabel(new ImageIcon("icons/red-checkmark.png"));
    JLabel green = new JLabel(new ImageIcon("icons/green-checkmark.png"));

    public User() {
    }

    public User(String name, String Fname, String Lname, String phone, String pasword, String Copasword) {
        this.name = name;
        this.Fname = Fname;
        this.Lname = Lname;
        this.phone = phone;
        this.password = pasword;
        this.Copassword = Copasword;
        this.City = "";
        this.Country = "";
        this.phoneStart = 0;
        this.CardNo = "";
        this.Cardholder = "";
        this.Date = "";

    }

    public User register(String name, String Fname, String Lname, String phone, String password, String Copassword) {
        BufferedWriter output;

        User n = new User();
        User user = new User();
        n.ReadFile();

        if (!(name.isEmpty() || Fname.isEmpty() || Lname.isEmpty() || phone.isEmpty() || password.isEmpty() || Copassword.isEmpty())) {
            if (phone.charAt(0) == '0' && phone.charAt(1) == '5' && phone.length() == 10) {
                if (password.length() > 7) {
                    if (password.equals(Copassword)) {
                        for (int i = 0; i < u.size(); i++) {
                            if (!u.get(i).getName().equals(name)) {
                                message(green, "Congrats! Your Registration completed!", "Registration Succeed");
                                try {
                                    output = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Register.txt", true)));
                                    User newU = new User(name, Fname, Lname, phone, password, Copassword);
                                    output.write(newU.toString());
                                    u.add(newU);
                                    output.close();
                                    return newU;
                                } catch (IOException ex) {
                                    Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            } else {
                                message(red, "UserName already exist!", "Registration Failed");
                            }
                        }
                    } else {
                        message(red, "The Confirm Password must match the Password!", "Registration Failed");
                    }
                } else {
                    message(red, "The Password length must be more than 7 digits!", "Registration Failed");
                }
            } else {
                message(red, "The phone number must start with \"05\" and the length is 10!", "Registration Failed");
            }
        } else {
            message(red, "You must fill all the fields!", "Registration Failed");
        }
        return null;
    }

    public Boolean CheckFile(User user) {
        for (int i = 0; i < u.size(); i++) {
            if (u.get(i).getName().equals(user.getName())) {
                return true;
            }
        }
        return false;
    }

    public void ReadFile() {
        u = new ArrayList();
        BufferedReader input;
        try {
            input = new BufferedReader(new InputStreamReader(new FileInputStream("Register.txt")));
            String l;
            while ((l = input.readLine()) != null) {
                String[] s = l.split(",");
                u.add(new User(s[0], s[1], s[2], s[3], s[4], s[5]));
            }
            input.close();
        } catch (IOException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean Login(String username, String password) {
        User n = new User();
        n.ReadFile();
        for (int i = 0; i < u.size(); i++) {
            if (u.get(i).getName().equals(username) && u.get(i).getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public boolean setNewPassword(String username, String password, String copassword) {
        if (!copassword.equals(password)) {
            return false;
        } else {
            BufferedWriter output;
            try {
                User n = new User();
                n.ReadFile();
                output = new BufferedWriter(new FileWriter("Register.txt"));
                for (int i = 0; i < u.size(); i++) {
                    if (u.get(i).getName().equals(username)) {
                        u.get(i).setPassword(password);
                        u.get(i).setCopassword(copassword);
                    }
                    output.write(u.get(i).toString());
                }
                output.close();
            } catch (IOException ex) {
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            }
            return true;
        }
    }

    public void message(JLabel RG, String message, String name) {
        Font f = new Font("Georgia", Font.BOLD, 14);
        JLabel n = new JLabel("  ");
        JPanel p = new JPanel();
        JLabel text = new JLabel(message);
        text.setHorizontalAlignment(text.CENTER);
        text.setFont(f);
        p.setLayout(new BorderLayout());
        p.add(RG, BorderLayout.NORTH);
        p.add(n, BorderLayout.CENTER);
        p.add(text, BorderLayout.PAGE_END);
        JOptionPane.showMessageDialog(null, p, name, JOptionPane.PLAIN_MESSAGE);
    }

    public void setCardNo(String CardNo) {
        this.CardNo = CardNo;
    }

    public void setCardholder(String Cardholder) {
        this.Cardholder = Cardholder;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getCardNo() {
        return CardNo;
    }

    public String getCardholder() {
        return Cardholder;
    }

    public String getDate() {
        return Date;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public void setPhoneStart(int phoneStart) {
        this.phoneStart = phoneStart;
    }

    public String getCity() {
        return City;
    }

    public String getCountry() {
        return Country;
    }

    public int getPhoneStart() {
        return phoneStart;
    }

    public String getName() {
        return name;
    }

    public String getFname() {
        return Fname;
    }

    public String getLname() {
        return Lname;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }

    public String getCopassword() {
        return Copassword;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPassword(String pasword) {
        this.password = pasword;
    }

    public void setCopassword(String Copasword) {
        this.Copassword = Copasword;
    }

    @Override
    public String toString() {
        return name + "," + Fname + "," + Lname + "," + phone + "," + password + "," + Copassword + "\n";
    }

}
