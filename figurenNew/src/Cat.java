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

    public Cat() {
        super();
    }

    public Cat(int factor, int offsetLeft, int maxHeightPanel, int mainBodyWidth,
            int mainBodyHeight, int legsWidth,
            int legsHeight, int headRadius, int earsHeight, int earsWidth, int tailWidth,
            int tailHeight) {
        super(factor, offsetLeft, maxHeightPanel);
    }

    public int getMainBodyWidth() {
        return mainBodyWidth;
    }

    public int getMainBodyHeight() {
        return mainBodyHeight;
    }

    public int getLegsWidth() {
        return legsWidth;
    }

    public int getLegsHeight() {
        return legsHeight;
    }

    public int getHeadRadius() {
        return headRadius;
    }

    public int getEarsHeight() {
        return earsHeight;
    }

    public int getEarsWidth() {
        return earsWidth;
    }

    public int getTailWidth() {
        return tailWidth;
    }

    public int getTailHeight() {
        return tailHeight;
    }

    public int getHeight() {
        return ((legsHeight + mainBodyHeight + tailHeight) * getFactor());
    }

    public int getWidth() {
        return (int) ((tailWidth + mainBodyWidth + headRadius * 0.75) * getFactor());
    }

    @Override
    public void paintOnGraphics(Graphics g) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'paintOnGraphics'");
    }

}
