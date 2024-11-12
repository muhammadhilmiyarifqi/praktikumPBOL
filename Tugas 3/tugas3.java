import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tugas3 {
    public static void main(String[] args){
        JFrame frame = new JFrame("Login & Register");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CardLayout layout = new CardLayout();
        JPanel Panel = new JPanel(layout);

        // Login panel
        JPanel loginPanel = new JPanel(new GridLayout(5, 1));

        //judul panel login
        JPanel judul = new JPanel();
        JLabel loginLabel = new JLabel("Login");
        loginLabel.setFont(new Font("Poppins", Font.BOLD, 26));
        loginLabel.setForeground(Color.GRAY);
        judul.add(loginLabel);
        loginPanel.add(judul);

        //email
        JPanel email = new JPanel (new GridLayout(2,1));
        email.setBorder(BorderFactory.createEmptyBorder(2, 20, 2, 20));
        JLabel emailLabel = new JLabel("Email");
        JTextField emailInput = new JTextField();
        email.add(emailLabel);
        email.add(emailInput);
        loginPanel.add(email);

        //password
        JPanel password = new JPanel(new GridLayout(2,1));
        password.setBorder(BorderFactory.createEmptyBorder(2, 20, 2, 20));
        JLabel passwordLabel = new JLabel("Password");
        JPasswordField passwordInput = new JPasswordField();
        password.add(passwordLabel);
        password.add(passwordInput);
        loginPanel.add(password);

        //Tombol login
        JPanel loginButton = new JPanel(new FlowLayout());
        loginButton.setBorder(BorderFactory.createEmptyBorder(15, 0, 0, 0));
        JButton submit = new JButton("Login");
        loginButton.add(submit);
        loginPanel.add(loginButton);

        //tombol mengarah ke sign up
        JPanel backSignUp = new JPanel(new FlowLayout());
        JLabel signupText = new JLabel("Belum punya akun?");
        JButton goSignUp = new JButton("Sign Up");
        backSignUp.add(signupText);
        backSignUp.add(goSignUp);
        loginPanel.add(backSignUp);

        //Sign Up panel
        JPanel signUpPanel = new JPanel(new GridLayout(6, 1));

        //Judul Sign Up
        JPanel judulPanel = new JPanel();
        JLabel signLabel = new JLabel("Sign Up");
        signLabel.setFont(new Font("Poppins", Font.BOLD, 24));
        signLabel.setForeground(Color.GRAY);
        judulPanel.add(signLabel);
        signUpPanel.add(judulPanel);

        //Nama
        JPanel nama = new JPanel(new GridLayout(2, 1));
        nama.setBorder(BorderFactory.createEmptyBorder(2, 20, 2, 20));
        JLabel namaLabel = new JLabel("Nama");
        JTextField namaField = new JTextField();
        nama.add(namaLabel);
        nama.add(namaField);
        signUpPanel.add(nama);

        //Input Email
        JPanel inputEmail = new JPanel(new GridLayout(2, 1));
        inputEmail.setBorder(BorderFactory.createEmptyBorder(2, 20, 2, 20));
        JLabel labelEmail = new JLabel("Email");
        JTextField fieldEmail = new JTextField();
        inputEmail.add(labelEmail);
        inputEmail.add(fieldEmail);
        signUpPanel.add(inputEmail);

        //Input Password
        JPanel inputPassword = new JPanel(new GridLayout(2, 1));
        inputPassword.setBorder(BorderFactory.createEmptyBorder(2, 20, 2, 20));
        JLabel labelPassword = new JLabel("Password");
        JPasswordField fieldPassword = new JPasswordField();
        inputPassword.add(labelPassword);
        inputPassword.add(fieldPassword);
        signUpPanel.add(inputPassword);

        //Tombol Sign Up
        JPanel signUpButton = new JPanel(new FlowLayout());
        signUpButton.setBorder(BorderFactory.createEmptyBorder(15, 0, 0, 0));
        JButton submitSignUp = new JButton("Sign Up");
        signUpButton.add(submitSignUp);
        signUpPanel.add(signUpButton);

        //Tombol mengarah ke Login
        JPanel backLogin = new JPanel(new FlowLayout());
        JLabel loginText = new JLabel("Sudah punya akun?");
        JButton goLogin = new JButton("Login");
        backLogin.add(loginText);
        backLogin.add(goLogin);
        signUpPanel.add(backLogin);

        //Tambah panel login dan signup ke card layout
        Panel.add(loginPanel, "LoginPanel");
        Panel.add(signUpPanel, "SignUpPanel");
        goSignUp.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e){
                layout.show(Panel, "SignUpPanel");
            }
        });
        goLogin.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e){
                layout.show(Panel, "LoginPanel");
            }
        });

        frame.add(Panel);
        frame.setVisible(true);
    }
}