package Herencia;

public class CuentaCorriente extends  Cuenta{
    float sobregiro;



    public CuentaCorriente(float saldo, float tazaAnual) {
        super(saldo, tazaAnual);
        this.sobregiro = sobregiro;
    }


    public float getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(float sobregiro) {
        this.sobregiro = sobregiro;
    }
}
