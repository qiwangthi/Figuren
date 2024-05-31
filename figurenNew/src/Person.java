public class Person extends Figuren {
    private final int mainBodyWidth = 10;
    private final int mainBodyHeight = 10;
    private final int legsWidth = 4;
    private final int legsHeight = 10;
    private final int headRadius = 6;
    private final int neckWidth = 4;
    private final int neckHeight = 4;
    private final int armsHeight = 8;
    private final int armsWidth = 3;

    public Person(int factor, int offsetLeft, int maxHeightPanel, int mainBodyWidth, int mainBodyHeight, int legsWidth,
            int legsHeight, int headRadius, int neckWidth, int neckHeight, int armsHeight, int armsWidth) {
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

    public int getNeckWidth() {
        return neckWidth;
    }

    public int getNeckHeight() {
        return neckHeight;
    }

    public int getArmsHeight() {
        return armsHeight;
    }

    public int getArmsWidth() {
        return armsWidth;
    }

    public int getHeight() {
        return (int) ((legsHeight + mainBodyHeight + headRadius * 0.75 + neckHeight) * getFactor());
    }

    public int getWidth() {
        return (armsWidth * 2 + mainBodyWidth) * getFactor();
    }
}
