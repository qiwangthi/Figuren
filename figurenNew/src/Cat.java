import java.awt.Graphics;

public class Cat extends Figur {

    private final int mainBodyWidth = 10;
    private final int mainBodyHeight = 4;
    private final int legsWidth = 2;
    private final int legsHeight = 4;
    private final int headRadius = 4;
    private final int earsHeight = 2;
    private final int earsWidth = 2;
    private final int tailWidth = 1;
    private final int tailHeight = 4;

    public int getHeight() {
        return ((legsHeight + mainBodyHeight + tailHeight) * factor);
    }

    public int getWidth() {
        return (int) ((tailWidth + mainBodyWidth + headRadius * 0.75) * factor);
    }

    public void paintOnGraphics(Graphics g) {
        int offsetTop = getMaxHeightPanel() - getHeight();
        // den Kopf zeichnen
        int kopf_x = offsetLeft + (int) (tailWidth * factor + mainBodyWidth * factor-legsWidth * factor * 0.5+headRadius * factor * 0.75/2);
        int kopf_y = offsetTop + 1/4*tailHeight+headRadius * factor / 2;
        int kopf_breite = headRadius * factor;
        int kopf_hoehe = headRadius * factor;
        g.fillOval(kopf_x, kopf_y, kopf_breite, kopf_hoehe);

        // die Ohren zeichnen
        int ohr_x = offsetLeft + (int) (tailWidth * factor + mainBodyWidth * factor-legsWidth * factor * 0.5+headRadius * factor * 0.75/2);
        int ohr_y = offsetTop + +1/4 *tailHeight+ earsHeight * factor/2;
        int ohr_breite = earsWidth * factor;
        int ohr_hoehe = earsHeight * factor;
        g.fillRect(ohr_x, ohr_y, ohr_breite, ohr_hoehe);

        //den Schwanz zeichnen
        int schwanz_x = offsetLeft;
        int schwanz_y = offsetTop + tailHeight/2;
        int schwanz_breite = tailWidth * factor;
        int schwanz_hoehe = tailHeight * factor;
        g.fillRect(schwanz_x, schwanz_y, schwanz_breite, schwanz_hoehe);

        //den Körper zeichnen
        
        int koerper_x = offsetLeft + tailWidth * factor+ mainBodyWidth * factor/2;
        int koerper_y = offsetTop + tailHeight + mainBodyHeight * factor/2;
        int koerper_breite = mainBodyWidth * factor;
        int koerper_hoehe = mainBodyHeight * factor;
        g.fillRect(koerper_x, koerper_y, koerper_breite, koerper_hoehe);
        

        // die Beine zeichnen
        int beinL_x = offsetLeft+tailWidth * factor;
        int beinL_y = offsetTop + tailHeight + mainBodyHeight * factor;
        int beinR_x = offsetLeft + tailWidth * factor + mainBodyWidth * factor-legsWidth * factor*2+legsWidth * factor/2;
        int beinR_y = beinL_y;
        int bein_breite = legsWidth * factor;
        int bein_hoehe = legsHeight * factor;
        g.fillRect(beinL_x, beinL_y, bein_breite, bein_hoehe);
        g.fillRect(beinR_x, beinR_y, bein_breite, bein_hoehe);




    }

}
