public class SlowPiece extends Piece {
    public SlowPiece(String n, String c, Position p) {
        super(n, c, p);
    }

    public Position move(String direction) {
        if ((getPoint().getX()!=8)&&(direction.equalsIgnoreCase("right"))) {
            getPoint().setY(getPoint().getY() + 1);
            return getPoint();
        } else if ((getPoint().getX()!=0)&&(direction.equalsIgnoreCase("left"))){
            getPoint().setY(getPoint().getY() - 1);
            return getPoint();
        }
        else{
            return getPoint();
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}