import javax.swing.*;
import java.awt.*;

public class  barsystem extends Thread {
    @Override
    public synchronized void run() {

            JProgressBar bar = Odliczenie.bar;
            int k = 1;
            if(k==1) {
                k = Odliczenie.stop;
                int skur = Odliczenie.skur;
                int d = skur;

                bar.setValue(d);
                bar.setBounds(100, 500, 600, 20);
                bar.setForeground(Color.black);

                //stop 1 sek
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
            //reset
            run();


        }

    }
