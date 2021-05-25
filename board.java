public class Board {
    Piece ar[][];
    public Board(){
        ar=new Piece[8][8];
    }
    public void addPiece(Piece p1)
    {
       if(ar[p1.getPoint().getX()][p1.getPoint().getY()]==null)
       {
           ar[p1.getPoint().getX()][p1.getPoint().getY()]=p1;
       }
       else
        System.out.println("Piece cannot be added");
    }
    public void move(Piece p1,String dir,int n) {
        FastFlexible ob1 = new FastFlexible(p1.getName(), p1.getColour(), p1.getPoint());
        ob1.move(dir, n);

    }

    public void display()
    {//System.out.print(ar[3][3]);
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                if(ar[i][j]==null)
                {
                    System.out.print("-");
                }
                else
                {
                    System.out.print(ar[i][j]);
                }
            }
            System.out.println();
        }
    }
    public Piece objectName(Position p)
    {
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                if(ar[i][j]!=null)
                {
                    if((ar[i][j].getPoint().getX()==p.getX())&&(ar[i][j].getPoint().getY()==p.getY()))
                    {
                        return ar[i][j];
                    }
                }
            }
        }
        return null;
    }


}
