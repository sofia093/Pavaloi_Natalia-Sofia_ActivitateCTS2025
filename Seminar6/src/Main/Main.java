package Main;

import Clase.Adapter;
import Clase.MedicamentFarmacie;
import Clase.MedicamentSpital;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void vindeMedicament(MedicamentFarmacie medicamentFarmacie){
        System.out.println("Farmacia noastra va ofera medicamentul: ");
        medicamentFarmacie.cumparaMedicamente();
    }

    public static void main(String[] args) {
        MedicamentFarmacie medicamentFarmacie=new MedicamentFarmacie(30,"Parasinus", true);
        MedicamentFarmacie medicamentFarmacie1=new MedicamentFarmacie(40,"Nurofen", true);

        vindeMedicament(medicamentFarmacie);
        vindeMedicament(medicamentFarmacie1);

        MedicamentSpital medicamentSpital=new MedicamentSpital(40, "Antibiotic");
        MedicamentSpital medicamentSpital1=new MedicamentSpital(50, "Augumentin");

        vindeMedicament(new Adapter(medicamentSpital));
        vindeMedicament(new Adapter(medicamentSpital1));

    }
}