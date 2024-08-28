import java.awt.Graphics;

class CustomLine {
    private int startX, startY, endX, endY;

    public CustomLine(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public int getStartX() { return startX; }
    public int getStartY() { return startY; }
    public int getEndX() { return endX; }
    public int getEndY() { return endY; }

    public void draw(Graphics g) {
        g.drawLine(startX, startY, endX, endY);
    }
}