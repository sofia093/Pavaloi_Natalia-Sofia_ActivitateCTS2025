package clase;

public class AdaptorBilet extends BiletTerestru implements IBiletMetrou {
    public AdaptorBilet(int nrCalatorii) {
        super(nrCalatorii);
    }

    @Override
    public void validareBilet() {
        super.controlBilet();
    }
}
