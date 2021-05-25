import java.util.*;
public class GameDemo {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String command="";
        Board ob=new Board();
        System.out.println("Enter a command (type help for details.)");
        command=sc.nextLine();
        while(!command.equalsIgnoreCase("exit")) {

            if (command.equalsIgnoreCase("help")) {
                System.out.println("Possible commands are as follows:\n" + "create location [fast][flexible]: Creates a new piece.\n" + "move location direction [spaces]: Moves a piece.\n" + "print: Displays the board.\n" + "help: Displays help\n" + "exit: Exits the program");
            } else if (command.equalsIgnoreCase("exit")) {
                System.out.println("done");
                break;
            } else if (command.equalsIgnoreCase("print")) {
                ob.display();
            } else {
                String n, c;
                String st = command.substring(0, command.indexOf(' '));
                if (st.equalsIgnoreCase("create")) {
                    System.out.println("Enter name of the piece");
                    n = sc.nextLine();
                    System.out.println("Enter color of the piece");
                    c = sc.nextLine();
                    int x = Character.getNumericValue(command.charAt(command.indexOf(" ") + 1));
                    int y = Character.getNumericValue(command.charAt(command.indexOf(" ") + 3));
                    Position p = new Position(x, y);
                    Piece p1 = new Piece(n, c, p);
                    ob.addPiece(p1);
                    String movement;


                    if (Character.isDigit(command.charAt(command.length()-1))) {
                        movement = "slow";
                    } else {
                        movement = command.substring(command.lastIndexOf(' ') + 1);
                        if (movement.equalsIgnoreCase("flexible")) {
                            movement = "slow flexible";
                        }
                    }
                }
                else if (st.equalsIgnoreCase("move")) {
                    int move;
                    String dir;
                    if (Character.isDigit(command.charAt(command.length() - 1))) {
                        move = Character.getNumericValue(command.charAt(command.length() - 1));
                        String str=command.substring(0,command.lastIndexOf(' '));
                        dir =str.substring(str.lastIndexOf(' ')+1);

                    } else {
                        move = 1;
                        dir = command.substring(command.lastIndexOf(' ') + 1);

                    }
                    int x = Character.getNumericValue(command.charAt(command.indexOf(" ") + 1));
                    int y = Character.getNumericValue(command.charAt(command.indexOf(" ") + 3));
                    Position p1 = new Position(x, y);
                    Piece p = ob.objectName(p1);
                    Piece pp=p;
                    ob.move(p,dir,move);
                    if((p.getPoint().getX()>8)||(p.getPoint().getX()<0)||(p.getPoint().getY()>8)||(p.getPoint().getY()<0))
                    {
                        System.out.println("Cannot be moved");
                        p.getPoint().setX(pp.getPoint().getX());
                        p.getPoint().setY(pp.getPoint().getY());
                    }
                    if(ob.ar[p.getPoint().getX()][p.getPoint().getY()]==null) {
                        ob.ar[p.getPoint().getX()][p.getPoint().getY()] = p;
                        ob.ar[x][y] = null;
                    }
                    else
                    {
                        System.out.println("Cannot be added");
                    }
                }
            }
                System.out.println("Enter a command (type help for details.)");
                command = sc.nextLine();

        }
    }
}
