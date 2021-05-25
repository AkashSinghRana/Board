public class FastPiece extends Piece {
    public FastPiece(String n, String c, Position p) {
        super(n, c, p);
    }

    public Position move(String dir, int n) {
        if (((getPoint().getX() + n) <= 8) && (dir.equalsIgnoreCase("right"))) {
            getPoint().setY(getPoint().getY() + n);
            return getPoint();
        } else if ((Math.abs(getPoint().getX() - n) >= 0) && (dir.equalsIgnoreCase("left"))) {
            getPoint().setY(getPoint().getY() - n);
            return getPoint();
        } else {
            System.out.println("Cannot be moved");
            return getPoint();
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
