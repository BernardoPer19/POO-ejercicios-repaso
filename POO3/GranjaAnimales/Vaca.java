public class Vaca extends Animal {
    public Vaca(double peso, double tamano, int anos_vida) {
        super(peso, tamano, anos_vida);
    }

    @Override
    public String comer(Ganaderia ganaderia) {
        ganaderia.setAlimento("pasto");  // Cambia el alimento según el tipo de animal
        return "La vaca está comiendo " + ganaderia.getAlimento();
    }
    
       @Override
    public int tomar(Ganaderia ganaderia) {
        int res = 0;
        res = ganaderia.getAgua() - 20;
        return  res;
    }
}