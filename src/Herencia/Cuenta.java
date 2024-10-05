package Herencia;

public class Cuenta {
    float saldo;
    int numeroConsignaciones = 0;
    int numeroRetiros = 0;
    float tazaAnual;
    float comisionMensual = 0;



    public Cuenta(float saldo, float tazaAnual) {
        this.saldo = saldo;
        this.tazaAnual = tazaAnual;
    }

    public Cuenta() {

    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConsignaciones() {
        return numeroConsignaciones;
    }

    public void setNumeroConsignaciones(int numeroConsignaciones) {
        this.numeroConsignaciones = numeroConsignaciones;
    }

    public int getNumeroRetiros() {
        return numeroRetiros;
    }

    public void setNumeroRetiros(int numeroRetiros) {
        this.numeroRetiros = numeroRetiros;
    }

    public float getTazaAnual() {
        return tazaAnual;
    }

    public float setTazaAnual(float anual) {
        this.tazaAnual = tazaAnual;
        return anual;
    }

    public float getComisionMensual() {
        return comisionMensual;
    }

    public void setComisionMensual(float comisionMensual) {
        this.comisionMensual = comisionMensual;
    }
}
