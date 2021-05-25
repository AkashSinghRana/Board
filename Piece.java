public class Piece {
    String name,colour;
    Position point;
    public Piece(String name,String colour,Position x){
        this.name=name;
        this.colour=colour;
        point=x;
    }

    public String getColour() {
        return colour;
    }

    public Position getPoint() {
        return point;
    }

    public String getName() {
        return name;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoint(Position point) {
        this.point = point;
    }

    public String toString() {
        return "Piece{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", point=" + point ;
    }
}
