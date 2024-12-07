
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm implements ActionListener{
    RegistrationForm(){
        // إنشاء إطار JFrame
        JFrame frame = new JFrame("نموذج التسجيل");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(3, 2));

        // إنشاء مكونات النموذج
        JLabel usernameLabel = new JLabel("اسم المستخدم:");
        JTextField usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("كلمة المرور:");
        JPasswordField passwordField = new JPasswordField();

        JButton registerButton = new JButton("تسجيل");

        // إضافة حدث الزر
        registerButton.addActionListener(this);

        // إضافة المكونات إلى الإطار
        frame.add(usernameLabel);
        frame.add(usernameField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(new JLabel()); // لإضافة فراغ
        frame.add(registerButton);

        // جعل الإطار مرئيًا
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}