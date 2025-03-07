public class Cerdo extends Animal {
    public Cerdo(double peso, double tamano, int anos_vida) {
        super(peso, tamano, anos_vida);
    }

    @Override
    public String comer(Ganaderia ganaderia) {
        ganaderia.setAlimento("papa, chuño y mote");
        return "El cerdo está comiendo " + ganaderia.getAlimento();
    }
    
    @Override
    public int tomar(Ganaderia ganaderia) {
        return ganaderia.getAgua() - 10;
    }
}
