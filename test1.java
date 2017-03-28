

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ADWANI on 27-03-2017.
 */
public class test1 {
    private JButton button1;
    private JPanel Panel;

    public test1() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Test1");
            }
        });
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("test1");
        frame.setContentPane(new test1().Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
    }

