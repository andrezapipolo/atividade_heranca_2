package Heranca2;

public class Animal {
    public String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void andar() {
        System.out.println("Todos andam, mas o modo é variado");
    }
}
