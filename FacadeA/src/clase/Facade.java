package clase;

public class Facade {
    public void interneazaPacient(Pacient pacient, Salon salon) {
        Medic medic = new Medic();

        if (medic.interneaza(pacient)) {
            if(salon.estePatLiber()){
                System.out.println("Pacientul poate fi internat");
            }else{
                System.out.println("Nu este pat liber in salon");
            }
        }else{
            System.out.println("Medicul a decis ca starea pacientului nu este grava");
        }
    }
}
