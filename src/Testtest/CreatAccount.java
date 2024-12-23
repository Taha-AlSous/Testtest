
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class CreatAccount extends JFrame implements ActionListener ,MouseListener{

        private JLabel mainBG;
        private ImageIcon posterImage;
        private JLayeredPane layeredPane;

        private JLabel logoLabel;
        private ImageIcon logoImage;
        
        private JLabel usernameLabel;
        private JTextField usernameTextField;
        private JLabel passwordLabel;
        private JPasswordField passwordField;
        private JLabel confirmPasswordLabel;
        private JPasswordField confirmPasswordField;

        private JLabel eyeLabel1;
        private ImageIcon eyeImage1;
        private ImageIcon NoeyeImage1;

        private JLabel eyeLabel2;
        private ImageIcon eyeImage2;
        private ImageIcon NoeyeImage2;

        JButton confirmButton;
        JButton cancelButton;

    public CreatAccount(){
        this.setSize(500,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        layeredPane=new JLayeredPane();
        mainBG = new JLabel();
        posterImage= new ImageIcon(this.getClass().getResource("./Images/mainBG.png"));

        logoLabel = new JLabel();
        logoImage= new ImageIcon(this.getClass().getResource("./Images/firstLogo.png"));



        usernameLabel = new JLabel("username:");
        usernameTextField = new JTextField();
        passwordLabel = new JLabel("passowrd:");
        passwordField = new JPasswordField();
        confirmPasswordLabel = new JLabel("confirm Password:");
        confirmPasswordField = new JPasswordField();

        eyeLabel1 = new JLabel();
        eyeImage1 = new ImageIcon(this.getClass().getResource("./Images/eye.png"));
        NoeyeImage1 = new ImageIcon(this.getClass().getResource("./Images/noeye.png"));

        eyeLabel2 = new JLabel();
        eyeImage2 = new ImageIcon(this.getClass().getResource("./Images/eye.png"));
        NoeyeImage2 = new ImageIcon(this.getClass().getResource("./Images/noeye.png"));

        confirmButton = new JButton("confirm");
        cancelButton = new JButton("cancel");
        ///////////
        /// 
        layeredPane.setPreferredSize(new Dimension(500,750));
        mainBG.setBounds(0, 0, 500, 750);
        mainBG.setIcon(posterImage);
        layeredPane.add(mainBG,JLayeredPane.DEFAULT_LAYER);

         //logo
         logoLabel.setBounds(0, -10, 200, 200);
         logoLabel.setIcon(logoImage);
         layeredPane.add(logoLabel,JLayeredPane.PALETTE_LAYER);
 

        // usernameLabel
        usernameLabel.setBounds(200, 200, 100, 30);
        usernameLabel.setForeground(Color.white);
        usernameLabel.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        layeredPane.add(usernameLabel,JLayeredPane.PALETTE_LAYER);
        //usernameTextField
        usernameTextField.setBounds(150, 250, 200, 30);
        usernameTextField.setForeground(Color.BLACK);
        usernameTextField.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        layeredPane.add(usernameTextField,JLayeredPane.PALETTE_LAYER);
        
        //passwordLabel
        passwordLabel.setBounds(200, 300, 100, 30);
        passwordLabel.setForeground(Color.white);
        passwordLabel.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        layeredPane.add(passwordLabel,JLayeredPane.PALETTE_LAYER);
        //passwordField
        passwordField.setBounds(150, 350, 200, 30);
        passwordField.setEchoChar('*');
        passwordField.setForeground(Color.BLACK);
        passwordField.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        layeredPane.add(passwordField,JLayeredPane.PALETTE_LAYER);
        
        //eyeLabel1
        eyeLabel1.setBounds(400, 335, 60, 60);
        eyeLabel1.addMouseListener(this);
        eyeLabel1.setIcon(eyeImage1);
        layeredPane.add(eyeLabel1,JLayeredPane.PALETTE_LAYER);

        //confirmPasswordLabel
        confirmPasswordLabel.setBounds(150, 400, 200, 30);
        confirmPasswordLabel.setForeground(Color.white);
        confirmPasswordLabel.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        layeredPane.add(confirmPasswordLabel,JLayeredPane.PALETTE_LAYER);
        //confirmPasswordField
        confirmPasswordField.setBounds(150, 450, 200, 30);
        confirmPasswordField.setEchoChar('*');
        confirmPasswordField.setForeground(Color.BLACK);
        confirmPasswordField.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        layeredPane.add(confirmPasswordField,JLayeredPane.PALETTE_LAYER);

        //eyeLabel2
        eyeLabel2.setBounds(400, 435, 60, 60);
        eyeLabel2.addMouseListener(this);
        eyeLabel2.setIcon(eyeImage2);
        layeredPane.add(eyeLabel2,JLayeredPane.PALETTE_LAYER);

         //confirmButton
         confirmButton.setBounds(145, 550, 100, 30);
         confirmButton.addActionListener(this);
         confirmButton.setForeground(Color.BLACK);
         confirmButton.setBackground(new Color(242,186,0));
         confirmButton.setFont(new Font("Comic Sans MS",Font.BOLD,15));
         confirmButton.setFocusPainted(false);
         layeredPane.add(confirmButton,JLayeredPane.PALETTE_LAYER);

         //cancelButton
         cancelButton.setBounds(250,550,100,30);
         cancelButton.addActionListener(this);
         cancelButton.setForeground(Color.BLACK);
         cancelButton.setBackground(new Color(242,186,0));
         cancelButton.setFont(new Font("Comic Sans MS",Font.BOLD,15));
         cancelButton.setFocusPainted(false);
         layeredPane.add(cancelButton,JLayeredPane.PALETTE_LAYER);


        //add layerdPane to the frame
        this.add(layeredPane);
        this.setVisible(true);
        //
    }


    //mouse listener
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource()==eyeLabel1)
        {
            if(eyeLabel1.getIcon()==eyeImage1)
                {
                    eyeLabel1.setIcon(NoeyeImage1);
                    passwordField.setEchoChar((char)0);
                }
             else
                {
                    eyeLabel1.setIcon(eyeImage1);
                    passwordField.setEchoChar('*');
                }
        }
        else if(e.getSource()==eyeLabel2)
        {
            if(eyeLabel2.getIcon()==eyeImage2)
                {
                    eyeLabel2.setIcon(NoeyeImage2);
                    confirmPasswordField.setEchoChar((char)0);
                }
             else
                {
                    eyeLabel2.setIcon(eyeImage2);
                    confirmPasswordField.setEchoChar('*');
                }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

    boolean confirmAndSavePassword(String username , String password , String confirmPassword)
    {
        if(password.equals(confirmPassword))
        {
            if(Second.checkUsernameAndPassword(username, password))
            {
                App.users.add(new User(username, password));
                App.saveUsernamesAndPasswords();
                this.setVisible(false);
                return true;
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"no match between passwords\nplease rewrite confirm password !","no match",JOptionPane.WARNING_MESSAGE);
        }
        return false;
    }

    //action listener
    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource()==confirmButton)
        {
            if(confirmAndSavePassword(usernameTextField.getText(),passwordField.getText(),confirmPasswordField.getText()))
            {   
                Second.creatNewAccount.setEnabled(true);
                this.setVisible(false);
            }
        }
        else if(e.getSource()==cancelButton)
        {
            this.setVisible(false);
            Second.creatNewAccount.setEnabled(true);
        }
    }

}
