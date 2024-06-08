import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;

public abstract class Figur {
    protected final int factor = (int) (Math.random() * 10 + 7);
    protected int offsetLeft;
    protected int maxHeightPanel;
    protected Color color;


    public Figur() {
        Random rand = new Random();
        this.color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    }
    public Figur(int factor, int offsetLeft, int maxHeightPanel) {
        this.offsetLeft = offsetLeft;
        this.maxHeightPanel = maxHeightPanel;

    }

    public int getFactor() {
        return factor;
    }

    public int getOffsetLeft() {
        return offsetLeft;
    }

    public int getMaxHeightPanel() {
        return maxHeightPanel;
    }
    public Color getColor() {
        return color;
    }

    public abstract int getHeight();

    public abstract int getWidth();

    public abstract void paintOnGraphics(Graphics g);

    public void paintOnGraphics(Graphics g, int offsetLeft, int maxHeightPanel) {
        // int offsetTop = maxHeightPanel - this.getHeight();
        this.offsetLeft = offsetLeft;
        this.maxHeightPanel = maxHeightPanel;
        paintOnGraphics(g);
    }

}
