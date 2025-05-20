package clase;

public class ReducereaRatei extends Reducere{

    public void returneazaAnticipat(int sumaBani){
        if(sumaBani >500){
            super.setRate(rate-50);
        }
        System.out.println("Rata a ajuns "+super.getRate()+" dupa returnarea anticipata a sumei de " + sumaBani);
    }

}
