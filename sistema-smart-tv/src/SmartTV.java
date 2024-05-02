public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    
    public void ligar(){
        this.ligada=true;
    }

    public void desligar(){
        this.ligada=false;
    }

    public void aumentarVol(){
        this.volume++;
    }
    public void diminuirVol(){
        this.volume--;
    }

    public void mudarDeCanal(int novoCanal){
        this.canal = novoCanal;
    }

    public void aumentarCanal(){
        this.canal++;
    }

    public void diminuirCanal(){
        this.canal--;
    }
}
