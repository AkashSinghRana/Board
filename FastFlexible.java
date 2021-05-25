public class FastFlexible extends FastPiece{
    public FastFlexible(String n,String c,Position p){
        super(n,c,p);
    }
    public Position move(String dir,int n){
        if((dir.equalsIgnoreCase("right"))||(dir.equalsIgnoreCase("left")))
        {
            return super.move(dir,n);
        }
        else if((getPoint().getY()<=8)&&(dir.equalsIgnoreCase("down")))
        {
            getPoint().setX(getPoint().getX() + n);
            return getPoint();
        }
        else if((getPoint().getY()>=0)&&(dir.equalsIgnoreCase("up")))
        {
            getPoint().setX(getPoint().getX() - n);
            return getPoint();
        }
        else
        {
            System.out.println("Cannot be moved");
            return getPoint();
        }

    }
    public String toString()
    {
        return super.toString();
    }
}
