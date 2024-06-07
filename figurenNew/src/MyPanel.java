

import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;

    public class MyPanel extends JPanel{
        Figur[] figuren;
        public MyPanel(Figur[] figuren) {
            this.figuren = figuren;
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.BLACK);
            int offsetLeft = 0;
            for (int i = 0; i < figuren.length; i++) {
            figuren[i].paintOnGraphics(g, offsetLeft, this.getHeight());
            offsetLeft += figuren[i].getWidth();
            }
        }
    }
    
    

