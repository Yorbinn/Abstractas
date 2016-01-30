package mx.edu.utng.abstractas;

/**
 * Created by George on 22/01/2016.
 */
public class Triangulo extends Figura{
    private float lado;
    private float altura;
    @Override
    public float  calcularArea(){
        return(lado*altura)/2;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLado() {
        return lado;
    }

    public float getAltura() {
        return altura;
    }
}
