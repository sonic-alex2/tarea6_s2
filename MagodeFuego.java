package tarea6_s2;
/*
 * @author alx-pc
 */
public class MagodeFuego extends Mago{
    private int vida;
    
    public MagodeFuego() {
    }
    
    public MagodeFuego(int poder, String color) {
        super(poder, color);
    }
    
    public MagodeFuego(String color, int poder, int vida){
        super(poder, color);
        this.vida = vida;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

}
