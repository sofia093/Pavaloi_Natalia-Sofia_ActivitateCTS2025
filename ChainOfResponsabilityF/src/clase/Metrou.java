package clase;

public class Metrou extends MijlocTransport{

    @Override
    public void anuntaCalator(float distanta) {
        if(distanta >= 5){
            System.out.println("Se recomanda sa iei metroul.");
        }
    }
}
