package tarea6_s2;

/**
 *
 * @author alx-pc
 */
public class MagodeHielo extends Mago{
    private int vida;

    public MagodeHielo() {
    }

    public MagodeHielo(int poder, String color, int vida) {
        super (poder, color);
        this.vida = vida;
         
    }
    
    public void aumentodePoder(){
        super.poder = super.poder + 2;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

   
    
    
    
}
