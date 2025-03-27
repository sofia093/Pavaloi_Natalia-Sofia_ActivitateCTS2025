package Builder;

public class PachetTransportBuilder implements Builder { //unealta temporara
    private boolean hasTV;
    private boolean hasAC;
    private boolean isFumator;

    public PachetTransportBuilder() {
        this.hasTV = false;
        this.hasAC = false;
        this.isFumator = false;
    }

    @Override
    public PachetTransport build() {
        return new PachetTransport(hasTV, hasAC, isFumator);
    }

    public PachetTransportBuilder setHasTV(boolean hasTV) {
        this.hasTV = hasTV;
        return this;
    }

    public PachetTransportBuilder setHasAC(boolean hasAC) {
        this.hasAC = hasAC;
        return this;
    }

    public PachetTransportBuilder setFumator(boolean fumator) {
        isFumator = fumator;
        return this;
    }


}
