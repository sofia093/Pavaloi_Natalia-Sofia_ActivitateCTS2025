package clase;

public class Autobuz extends MijlocTransport{

    @Override
    public void anuntaCalator(float distanta) {
        if(distanta < 3){
            System.out.println("Se recomanda sa mergi cu autbuzul.");
        }
        else{
            this.getUrmMijloc().anuntaCalator(distanta);
        }
    }


}
