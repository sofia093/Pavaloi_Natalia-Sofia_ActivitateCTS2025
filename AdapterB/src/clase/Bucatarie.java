package clase;

public class Bucatarie {

    public void aduceNota(IProdusBucatarie produsBucatarie) {
        System.out.println("Chelnerul a adus nota: ");
        produsBucatarie.printeazaFactura();
    }
}
