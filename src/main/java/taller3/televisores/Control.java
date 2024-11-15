package taller3.televisores;

public class Control {
    private TV tv;


    public void setTv(TV tv){
        this.tv = tv;
    }
    public TV getTv(){
        return this.tv;
    }

    public void turnOn(){
        tv.turnOn();
    }
    public void turnOff(){
        tv.turnOff();
    }


    public void canalUp(){
        tv.canalUp();
    }
    public void canalDown(){
        tv.canalDown();
    }


    public void volumenUp(){
        tv.volumenUp();
    }
    public void volumenDown(){
        tv.volumenDown();
    }

    
    public void setCanal(int canal){
        if (canal >= 1 && canal <= 120 && this.tv.getEstado() == true){
        tv.setCanal(canal);
        }
    }

    public void setVolumen(int volumen){
        tv.setVolumen(volumen);
    }


    public void enlazar(TV tv){
        this.tv = tv;
        tv.control = this;
    }

}
