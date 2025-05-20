package clase;

public class ReducereaPerioadei extends Reducere{

    public void returneazaAnticipat(int sumaBani){
        if(sumaBani >500){
            super.setDurationInMonths(durationInMonths-1);
        }
        System.out.println("Durata de rambursare a ajuns "+super.getDurationInMonths()+" dupa returnarea anticipata a sumei de " + sumaBani);
    }
}
