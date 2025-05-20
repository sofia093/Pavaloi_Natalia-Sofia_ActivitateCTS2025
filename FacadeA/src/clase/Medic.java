package clase;

public class Medic {

    public boolean interneaza(Pacient pacient) {
        if(pacient.getStare() == 3){
            return true;
        }else{
            return false;
        }
    }
}
