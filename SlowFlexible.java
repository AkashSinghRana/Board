public class SlowFlexible extends SlowPiece {
    public SlowFlexible(String n, String c, Position p){
        super(n,c,p);
    }
    public Position move(String dir)
    {
        if((dir.equalsIgnoreCase("right"))||(dir.equalsIgnoreCase("left")))
        {
            return super.move(dir);
        }
        else if((getPoint().getX()!=8)&&(dir.equalsIgnoreCase("down")))
        {
            getPoint().setX(getPoint().getX() + 1);
            return getPoint();
        }
        else if((getPoint().getX()!=0)&&(dir.equalsIgnoreCase("up")))
        {
            getPoint().setX(getPoint().getX() - 1);
            return getPoint();
        }
        else
        {
            return getPoint();
        }
    }
    public String toString()
    {
        return super.toString();
    }
}
