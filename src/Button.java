import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Button extends JButton  {
    JButton button = new JButton();
    Button(){
        setBounds(200, 80,400 , 400);
        setText("START");
        setFocusable(false);
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("end");
                System.exit(0);
            }
        });
    }

}
