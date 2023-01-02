import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
//import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.JLabel;

public class Switch extends JFrame{
    private JPasswordField textField;
    private Icon image;
    private Icon image1;
    private JButton button;
    private JLabel label1;
    private boolean tvScreen= false;


    public  Switch() {
        super("Remote control tv");
        setLayout(new FlowLayout());

        image= new ImageIcon(getClass().getResource("closetvscreen.png"));
        image1= new ImageIcon(getClass().getResource("tvscreenon.png"));
        label1= new JLabel();
        label1.setIcon(image);
        add(label1);

        textField= new JPasswordField(20);

        add(textField);

        button= new JButton("On");
        add(button);

        final ButtonHandler handler= new ButtonHandler();
        textField.addActionListener(handler);
        button.addActionListener(handler);


    }

    private class ButtonHandler implements ActionListener {
        
        @Override
        public void actionPerformed(final ActionEvent event) {
            String str= String.format("%s", textField.getText());

           if(str.equals("okay")) {
                if(tvScreen) {
                    label1.setIcon(image);
                    tvScreen=false;
                    
                }
            }
                else {
                    label1.setIcon(image1);
                    tvScreen=true;
                }
            {

            JOptionPane.showMessageDialog(Switch.this, "You entered a right Password!!");
            }
          // JOptionPane.showMessageDialog(null, str);
           
            
        }
    }
    
}  
