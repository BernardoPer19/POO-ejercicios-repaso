
public class ModuloRobotico{
    private int cantSavia;
    private int cantComponentes;
    private boolean encendido;

    public ModuloRobotico () {
        cantSavia = 0;
        cantComponentes = 0;
        encendido = false;
    }

    public String recoloectarSavia(int nuevaCantidad){
        String res = "";

        if(encendido){
            if(cantSavia + nuevaCantidad >= 90){
                res = "no puedes realizar esta accion, espacio insuficiente";
            }else{
                res  = "la accion fue existosa";
                cantSavia = cantSavia + nuevaCantidad;
            }
        }else{
            res = "la maquina esta apagada!";
        }
        return res;

    }

    public String createComponent(){
        String res = "";
        if(encendido){
            if(cantSavia >= 50){
                cantSavia = cantSavia - 50;
                cantSavia ++;
                res = "la accion fue existosa";
            }
        }
        return res;
    }

    public boolean encender () {
        return encendido = true;
    }

    public boolean apagar () {
        return encendido = true;
    }

}
