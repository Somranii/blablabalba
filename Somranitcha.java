

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Somranitcha extends JFrame  implements ActionListener {

    JFrame frame = new JFrame("The X4ACB");
    // The name stands for nothing, I just think it's cool 
    JLabel input_text = new JLabel("Write your text here");
    JLabel output_text = new JLabel("Result");
    JTextField input = new JTextField(15);
    JTextField output = new JTextField(15);
    JButton b_cr = new JButton("Crypt");
    JButton b_dcr = new JButton("Decrypt");
    JButton b_del = new JButton("Delete");
    JPanel p_input = new JPanel();
    JPanel p_output = new JPanel();
    JPanel p_buttons = new JPanel();
    JPanel p_main = new JPanel();
    String result;

    Somranitcha(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400, 150, 400,200);
        // text fields
        output.setEditable(false);

        // panels 
        p_input.add(input_text);
        p_input.add(input);
        p_output.add(output_text);
        p_output.add(output);
        p_buttons.add(b_cr);
        p_buttons.add(b_dcr);
        p_buttons.add(b_del);
        p_main.add(p_input);
        p_main.add(p_output);
        p_main.add(p_buttons);
        p_main.setBorder(new EmptyBorder(26, 10, 10, 10));


        // buttons 
        b_cr.addActionListener(this);
        b_dcr.addActionListener(this);
        b_del.addActionListener(this);
        //frame 
        frame.add(p_main);
        frame.setVisible(true);
    }
    public static void main(String[]args){
        new Somranitcha();
    }

    public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b_cr) {
            output.setText(crypt(input.getText())) ;
			}
        if(e.getSource()==b_dcr) {
                output.setText(decrypt(input.getText())) ;
                }
        if(e.getSource()==b_del) {
                    output.setText("") ;
                    input.setText("") ;
                    }    
		}
    String crypt(String text){
        result ="";
        char[] tab= text.toCharArray();
        for (char c:tab){
            c+=  5; 
            result+=c;
        }

        return result;
    }

    String decrypt(String text){
        result ="";
        char[] tab= text.toCharArray();
        for (char c:tab){
            int ascii = c;
            ascii -=5;
            c= (char) ascii ; 
            System.out.println(c);

            result+=c;
        }

        return result;
    }
}
