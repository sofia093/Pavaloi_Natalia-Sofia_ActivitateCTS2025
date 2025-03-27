package Builder;

public class PachetTransport {
    private boolean hasTV;
    private boolean hasAC;
    private boolean isFumator;

    public PachetTransport(boolean hasTV, boolean hasAC, boolean isFumator) {
        this.hasTV = hasTV;
        this.hasAC = hasAC;
        this.isFumator = isFumator;
    }

    public void setHasTV(boolean hasTV) {
        this.hasTV = hasTV;
    }

    public void setHasAC(boolean hasAC) {
        this.hasAC = hasAC;
    }

    public void setFumator(boolean fumator) {
        isFumator = fumator;
    }

    public boolean isHasTV() {
        return hasTV;
    }

    public boolean isHasAC() {
        return hasAC;
    }

    public boolean isFumator() {
        return isFumator;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PachetTransport{");
        sb.append("hasTV=").append(hasTV);
        sb.append(", hasAC=").append(hasAC);
        sb.append(", isFumator=").append(isFumator);
        sb.append('}');
        return sb.toString();
    }
}
