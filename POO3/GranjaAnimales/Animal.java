public class Animal {
    protected double peso, tamano;
    protected int anos_vida;

    public Animal(double peso, double tamano, int anos_vida) {
        this.peso = peso;
        this.tamano = tamano;
        this.anos_vida = anos_vida;
    }

    public String comer(Ganaderia ganaderia) {
        return "Este animal se alimenta de " + ganaderia.getAlimento();
    }
    
       public int tomar(Ganaderia ganaderia) {
        return  ganaderia.getAgua();
    }
}
