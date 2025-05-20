package clase;

public class ControlBilet {
    public void verificaBilet(IBiletMetrou bilet) {
        System.out.println("Controlorul a verificat biletul: ");
        bilet.validareBilet();
    }
}
