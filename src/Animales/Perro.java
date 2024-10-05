package Animales;

public class Perro extends Canino {
    @Override
    public String getAlimento() {
        return "Carne";
    }

    @Override
    public String getNombreCientifico() {
        return "Caninus";
    }

    @Override
    public String getSonido() {
        return "Wof";
    }

    @Override
    public String getHabitad() {
        return "Domestico";
    }
}
