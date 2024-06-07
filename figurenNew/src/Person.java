import java.awt.Graphics;
import java.awt.Color;

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
        return (int) ((legsHeight + mainBodyHeight + headDurchmesser * 0.75 + neckHeight) * getFactor());
    }

    public int getWidth() {
        return (armsWidth * 2 + mainBodyWidth) * getFactor();
    }

    // eine zufällige Farbe für die Figur erstellen
    public Color getRandomColor() {
        int r = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);
        return new Color(r, g, b);
    }

    // den Kopf zeichnen
    // implementieren methode paintOnGraphics
    public void paintOnGraphics(Graphics g) {
        int offsetTop = getMaxHeightPanel() - getHeight();
        // den Kopf zeichnen
        int kopf_x = offsetLeft+ armsWidth * factor+ (mainBodyWidth / 2) * factor ;
        int kopf_y = offsetTop + headDurchmesser * factor/2;
        int kopf_breite = headDurchmesser * factor;
        int kopf_hoehe = (int) (headDurchmesser * factor * 0.75);
        g.fillOval(kopf_x, kopf_y, kopf_breite, kopf_hoehe);
    
        // den Hals zeichnen
        int hals_x = kopf_x;
        int hals_y = offsetTop + kopf_hoehe+ neckHeight * factor/2;
        int hals_breite = neckWidth * factor;
        int hals_hoehe = neckHeight * factor;
        g.fillRect(hals_x, hals_y, hals_breite, hals_hoehe);
        
        //die Arme zeichnen
        int armL_x = offsetLeft+ armsWidth * factor/2;
        int armL_y = offsetTop + kopf_hoehe+ hals_hoehe+ armsHeight * factor/2;
        int armR_x = offsetLeft + armsWidth * factor + mainBodyWidth * factor+ armsWidth * factor/2;
        int armR_y = armL_y;
        int arm_breite = armsWidth * factor;
        int arm_hoehe = armsHeight * factor;
        g.fillRect(armL_x, armL_y, arm_breite, arm_hoehe);
        g.fillRect(armR_x, armR_y, arm_breite, arm_hoehe);
        
        //den Körper zeichnen
        int koerper_x = offsetLeft + armsWidth * factor+ mainBodyWidth * factor/2;
        int koerper_y = offsetTop + kopf_hoehe+ hals_hoehe+ mainBodyHeight * factor/2;
        int koerper_breite = mainBodyWidth * factor;
        int koerper_hoehe = mainBodyHeight * factor;
        g.fillRect(koerper_x, koerper_y, koerper_breite, koerper_hoehe);

        //die Beine zeichnen
        int beinL_x = offsetLeft+ armsWidth * factor+ legsWidth * factor/2;
        int beinL_y = offsetTop + kopf_hoehe+ hals_hoehe+ koerper_hoehe+ legsHeight * factor/2;
        int beinR_x = offsetLeft + armsWidth * factor + legsWidth * factor + mainBodyWidth * factor - legsWidth * factor*2+ legsWidth * factor/2;
        int beinR_y = beinL_y;
        int bein_breite = legsWidth * factor;
        int bein_hoehe = legsHeight * factor;
        g.fillRect(beinL_x, beinL_y, bein_breite, bein_hoehe);
        g.fillRect(beinR_x, beinR_y, bein_breite, bein_hoehe);




        
    }

    
}
