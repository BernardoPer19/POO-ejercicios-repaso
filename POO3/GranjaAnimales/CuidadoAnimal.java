
/**
 * Write a description of class CuidadoAnimal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuidadoAnimal{
    
 
    public String alimentarAnimal(Animal animal, Ganaderia ganaderia) { 
        return animal.comer(ganaderia);
    }

    public String cuidarAnimal(Ganaderia ganaderia) { 
        return "El animal recibió cuidados: " + ganaderia.getCuidados();
    }


}
