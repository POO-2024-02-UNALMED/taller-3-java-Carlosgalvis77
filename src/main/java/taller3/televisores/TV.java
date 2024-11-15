package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private Boolean estado;
    private int volumen = 1;
    public Control control;
    private static int numTV = 0;

    public TV(Marca marca, Boolean estado){
        this.marca = marca;
        this.estado = estado;
        numTV++;
    }

    public void setMarca(Marca marca){
        this.marca = marca;
    }
    public Marca getMarca(){
        return this.marca;
    }


    public void setCanal(int canal){
        if(canal > 0 && canal <= 120 && this.estado == true){
            this.canal = canal;
        }else{}
    }
    public int getCanal(){
        return this.canal;
    }


    public void setPrecio(int precio){
        this.precio = precio;
    }
    public int getPrecio(){
        return this.precio;
    }


    public void setVolumen(int volumen){
        if(volumen <= 7 && volumen >= 0 && this.estado == true){
        this.volumen = volumen;
        }
    }
    public int getVolumen(){
        return this.volumen;
    }


    public void setControl(Control control){
        this.control = control;
    }
    public Control getControl(){
        return this.control;
    }

    public static int getNumTV(){
        return numTV;
    }

    public static int setNumTV(int i){
        numTV = i;
        return numTV;
    }


    public void turnOff(){
        this.estado = false;
    }
    public void turnOn(){
        this.estado = true;
    }

    public boolean getEstado(){
        return this.estado;
    }


    public void canalUp(){
        if(this.estado == true && this.canal <120){
            this.canal += 1;
        }
    }
    public void canalDown(){
        if(this.estado == true && this.canal > 1){
            this.canal -= 1;
        }
    }

    public void volumenUp(){
        if(this.volumen < 7 && this.estado == true){
            this.volumen++;
        }
    }
    public void volumenDown(){
        if(this.volumen > 0 && this.estado == true){
            this.volumen--;
        }
    }
}
