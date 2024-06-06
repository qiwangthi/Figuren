import java.awt.Graphics;
import java.awt.Color;

public class Person extends Figur {
    private final int mainBodyWidth = 10;
    private final int mainBodyHeight = 10;
    private final int legsWidth = 4;
    private final int legsHeight = 10;
    private final int headRadius = 6;
    private final int neckWidth = 4;
    private final int neckHeight = 4;
    private final int armsHeight = 8;
    private final int armsWidth = 3;

    public int getHeight() {
        return (int) ((legsHeight + mainBodyHeight + headRadius * 0.75 + neckHeight) * getFactor());
    }

    public int getWidth() {
        return (armsWidth * 2 + mainBodyWidth) * getFactor();
    }

    // @Override
    // public void paintOnGraphics(Graphics g) {
    // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method
    // 'paintOnGraphics'");
    // }

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
        drawHead(g);
        // drawNeck(g);
        // drawArms(g);
        // drawMainBody(g);
        // drawLegs(g);
    }

    public void drawHead(Graphics g) {
        g.setColor(getRandomColor());
        g.drawOval(offsetLeft + (mainBodyWidth / 2) * factor - headRadius * factor / 2,
                maxHeightPanel - getHeight() + legsHeight * factor + mainBodyHeight + neckHeight - headRadius * factor,
                headRadius * factor,
                headRadius * factor);
    }

}
