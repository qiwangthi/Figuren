import javax.swing.JFrame;
import java.awt.Color;

public static void main(String[] args) throws Exception {

    Figur[] figuren = new Figur[10];
    // 0-4 are cats, 5-9 are persons
    for (int i = 0; i < figuren.length; i++) {
        if (i < 5) {
            figuren[i] = new Cat();
        } else {
            figuren[i] = new Person();
        }
    }
    // sort the figures by height
    for (int i = 0; i < figuren.length; i++) {
        for (int j = 1 + i; j < figuren.length; j++) {
            if (figuren[i].getHeight() > figuren[j].getHeight()) {
                Figur temp = figuren[i];
                figuren[i] = figuren[j];
                figuren[j] = temp;
            }
        }
    }
    int totalWidthPanel = 0;
    int maxHeightPanel = 0;
    int spaceBetweenFigures = (int) (Math.random() * 10 + 5);
    for (int i = 0; i < figuren.length; i++) {
        totalWidthPanel += figuren[i].getWidth() + spaceBetweenFigures;
        if (figuren[i].getHeight() > maxHeightPanel) {
            maxHeightPanel = figuren[i].getHeight();
        }
    }
    JFrame frame = new JFrame();
    MyPanel panel = new MyPanel(figuren);
    frame.add(panel);
    frame.setSize(totalWidthPanel, maxHeightPanel);
    panel.setBackground(Color.BLACK);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
;

   // int offsetLeft = spaceBetweenFigures;
   // for (int i = 0; i < figuren.length; i++) {
       // figuren[i].paintOnGraphics(panel.getGraphics(), offsetLeft, maxHeightPanel);
       // offsetLeft += figuren[i].getWidth() + spaceBetweenFigures;
    //}

}
