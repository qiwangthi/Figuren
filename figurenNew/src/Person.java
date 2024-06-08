import java.awt.Graphics;

public class Person extends Figur {
    private final int mainBodyWidth = 10;
    private final int mainBodyHeight = 10;
    private final int legsWidth = 4;
    private final int legsHeight = 10;
    private final int headDurchmesser = 6;
    private final int neckWidth = 4;
    private final int neckHeight = 4;
    private final int armsHeight = 8;
    private final int armsWidth = 3;

    public int getHeight() {
        return (int) ((legsHeight + mainBodyHeight + headDurchmesser * 0.75 + neckHeight) * factor);
    }

    public int getWidth() {
        return (armsWidth * 2 + mainBodyWidth) * factor;
    }

    // den Kopf zeichnen
    // implementieren methode paintOnGraphics
    public void paintOnGraphics(Graphics g) {
        int offsetTop = getMaxHeightPanel() - this.getHeight();
        // den Kopf zeichnen
        int kopf_x = (int)(offsetLeft+ armsWidth * factor+ (mainBodyWidth / 2) * factor - headDurchmesser/2 * factor);
        int kopf_y = offsetTop;
        int kopf_breite = headDurchmesser * factor;
        int kopf_hoehe = headDurchmesser * factor;
        g.fillOval(kopf_x, kopf_y, kopf_breite, kopf_hoehe);
    
        // den Hals zeichnen
        int hals_x = offsetLeft+ armsWidth * factor+ (mainBodyWidth / 2) * factor - neckWidth * factor/2;
        int hals_y =(int) (offsetTop + kopf_hoehe*0.75);
        int hals_breite = neckWidth * factor;
        int hals_hoehe = neckHeight * factor;
        g.fillRect(hals_x, hals_y, hals_breite, hals_hoehe);
        
        //die Arme zeichnen
        int armL_x = offsetLeft;
        int armL_y = hals_y + hals_hoehe;
        int armR_x = offsetLeft + armsWidth * factor + mainBodyWidth * factor;
        int armR_y = armL_y;
        int arm_breite = armsWidth * factor;
        int arm_hoehe = armsHeight * factor;
        g.fillRect(armL_x, armL_y, arm_breite, arm_hoehe);
        g.fillRect(armR_x, armR_y, arm_breite, arm_hoehe);
        
        //den Körper zeichnen
        int koerper_x = armL_x + armsWidth * factor;
        int koerper_y = armL_y;
        int koerper_breite = mainBodyWidth * factor;
        int koerper_hoehe = mainBodyHeight * factor;
        g.fillRect(koerper_x, koerper_y, koerper_breite, koerper_hoehe);

        //die Beine zeichnen
        int beinL_x = koerper_x;
        int beinL_y = koerper_y + koerper_hoehe;
        int beinR_x = beinL_x + mainBodyWidth * factor - legsWidth * factor*2+ legsWidth * factor;
        int beinR_y = beinL_y;
        int bein_breite = legsWidth * factor;
        int bein_hoehe = legsHeight * factor;
        g.fillRect(beinL_x, beinL_y, bein_breite, bein_hoehe);
        g.fillRect(beinR_x, beinR_y, bein_breite, bein_hoehe);

        //set color
        g.setColor(getColor());




        
    }

    
}
