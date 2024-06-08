

import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;

    public class MyPanel extends JPanel{
        Figur[] figuren;
        public MyPanel(Figur[] figuren) {
            this.figuren = figuren;
        }
        int r = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);
        Color color = new Color(r, g, b);
        public Color getRandomColor() {
            return color;
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(getRandomColor());
           //paint every figure with ramdom color
           
        
          
            int offsetLeft = 0;
            int spaceBetweenFigures = (int) (Math.random() * 10 + 5);
            for (int i = 0; i < figuren.length; i++) {
            figuren[i].paintOnGraphics(g, offsetLeft, this.getHeight());
            offsetLeft += figuren[i].getWidth()+ spaceBetweenFigures;
            }
        }
    }
    
    

