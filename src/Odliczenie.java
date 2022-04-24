import javax.swing.*;
import java.awt.*;

public class Odliczenie extends Thread {
    public static JProgressBar bar = new JProgressBar();
    public static JButton button = new Button();
    public static Window window = new Window();
    public static int skur=0;
    public static int stop=1;
    @Override public synchronized void run() {

        window.add(bar);

        for (int i=30; i >= 0; i--) {

            int j;
            j = (int) Thread.currentThread().getId();
            String jod = Integer.toString(j);
            String iod = Integer.toString(i);


            JLabel lodliczanie = new JLabel(jod);
            lodliczanie.setBounds(760, 5, 1000, 20);

            JLabel llicz = new JLabel(iod);
            llicz.setBounds(250, 20,400 , 400);


            Font f = llicz.getFont();
            llicz.setFont(new Font(f.getFontName(), f.getStyle(),200 ));
            window.add(lodliczanie);
            window.add(llicz);
            try {
                Thread.sleep(1000);
                skur=skur+3;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (i==15){
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                skur=50;
            }

            if (i==0){
                stop=0;
                skur=100;
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
               window.add(button);

                bar.setVisible(false);
            }

            llicz.setText("");
            lodliczanie.setText("");
            window.repaint();



            }
        }

    }

