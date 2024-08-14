package s01Algoritmos;

public class Trabajador extends Persona {
    private float horas;
    private float precio;

    public float getHoras() {
        return horas;
    }

    public void setHoras(float horas) {
        this.horas = horas;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public float calcularGanancia() {
        return horas*precio;
    }
}
