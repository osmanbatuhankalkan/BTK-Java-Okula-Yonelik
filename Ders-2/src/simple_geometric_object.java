import java.util.SimpleTimeZone;

public class simple_geometric_object {

    private String color ="white";
    private boolean filled;
    private java.util.Date dateCreated;

    public simple_geometric_object(){
        dateCreated =new java.util.Date();

    }
    public simple_geometric_object(String color,boolean filled){
        dateCreated =new java.util.Date();
        this.color = color;
        this.filled = filled;

    }
    public String getColor(){return color;}
    public void setColor(String color){this.color=color;}
    public boolean isFilled(){return  filled;}
    public void setFilled(boolean filled){this.filled=filled;}
    public java.util.Date getDateCreated(){return dateCreated;}
    public String toString(){
        return "create on"+dateCreated+"\ncolor:"+color+"and filled: "+filled;
    }
}
