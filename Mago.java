package tarea6_s2;
/*
 * @author alx-pc
 */
public class Mago {
    int poder;
    private String color;
    
    public Mago() {
    }

    public Mago(int poder, String color) {
        this.poder = poder;
        this.color = color;
    }
    
    public void aumentodePoder(){
        this.poder = this.poder + 1;
    }
    
    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
