package ball;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x1, int y1, int width, int height) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x1 + width;
        this.y2 = y1 + height;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return x2 - x1;
    }

    public int getHeight() {
        return y2 - y1;
    }

    public boolean collides(Ball ball) {
        if (ball.getX() - ball.getRadius() >= x1 &&
                ball.getX() + ball.getRadius() <= x2 &&
                ball.getY() - ball.getRadius() >= y1 &&
                ball.getY() + ball.getRadius() <= y2) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Container[(" + x1 + "," + y1 + "),(" + x2 + "," + y2 + ")]";
    }

    @Override
    public boolean equals(Object obj) {
        if( this == obj) return true;
        if( obj == null) return false;
        if( getClass() != obj.getClass()) return false;
        Container ball = (Container) obj;
        return x1 == ball.x1 && x2 == ball.x2 && y1 == ball.y1 && y2 == ball.y2;
    }

    @Override
    public int hashCode(){
        int result = x1;
        result += x2;
        result += y1;
        result += y2;
        return result;
    }
}
