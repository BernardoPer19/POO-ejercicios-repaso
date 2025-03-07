public class Gallina extends Animal {
    public Gallina(double peso, double tamano, int anos_vida) {
        super(peso, tamano, anos_vida);
    }

    @Override
    public String comer(Ganaderia ganaderia) {
        ganaderia.setAlimento("semillas");
        return "La gallina está comiendo " + ganaderia.getAlimento();
    }
    
    @Override
    public int tomar(Ganaderia ganaderia) {
        return ganaderia.getAgua() - 5;
    }
}