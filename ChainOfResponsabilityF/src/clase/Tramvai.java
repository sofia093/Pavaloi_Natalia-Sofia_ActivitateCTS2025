package clase;

public class Tramvai extends MijlocTransport{

    @Override
    public void anuntaCalator(float distanta) {
        if(distanta<5){
            System.out.println("Se recomanda sa iei tramvaiul.");
        }else{
            this.getUrmMijloc().anuntaCalator(distanta);
        }
    }
}
