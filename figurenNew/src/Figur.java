import java.awt.Graphics;

public abstract class Figur {
    protected final int factor = (int) (Math.random() * 10 + 7);
    protected int offsetLeft;
    protected int maxHeightPanel;

    public Figur() {
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

    public abstract int getHeight();

    public abstract int getWidth();

    public abstract void paintOnGraphics(Graphics g);

    public void paintOnGraphics(Graphics g, int offsetLeft, int maxHeightPanel) {
        this.offsetLeft = offsetLeft;
        this.maxHeightPanel = maxHeightPanel;
        paintOnGraphics(g);
    }

}
