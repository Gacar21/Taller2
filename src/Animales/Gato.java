package Animales;

public class Gato extends Felino{
    @Override
    public String getAlimento() {
        return "ratones";
    }

    @Override
    public String getNombreCientifico() {
        return "Felinus gaturros";
    }

    @Override
    public String getSonido() {
        return "Miauuuuw";
    }

    @Override
    public String getHabitad() {
        return "Domestico";
    }
}
