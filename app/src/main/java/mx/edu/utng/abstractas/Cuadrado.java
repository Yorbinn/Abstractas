package mx.edu.utng.abstractas;

/**
 * Created by George on 22/01/2016.
 */
public class Cuadrado extends Figura{
    private float lado;
    private float altura;
    @Override
    public float  calcularArea(){
        return(lado*altura);
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }
}
