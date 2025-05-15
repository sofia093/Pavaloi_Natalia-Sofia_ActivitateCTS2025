package clase;

public abstract class MijlocTransport {
    private MijlocTransport urmMijloc;

    public MijlocTransport getUrmMijloc() {
        return urmMijloc;
    }

    public void setUrmMijloc(MijlocTransport urmMijloc) {
        this.urmMijloc = urmMijloc;
    }

    public abstract void anuntaCalator(float distanta);
}
