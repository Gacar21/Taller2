package Herencia;

public class CuentaAhorros extends Cuenta{
    boolean activa;


    public CuentaAhorros(float saldo, float tazaAnual) {
        super(saldo, tazaAnual);
        this.activa = true;
    }

    public CuentaAhorros() {
        super();
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
}
