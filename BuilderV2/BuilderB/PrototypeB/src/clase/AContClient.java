package clase;

public abstract class AContClient {
    protected String nume;
    protected String data;

    public AContClient() {
        this.nume = "N/A";
        this.data = "01.01.2025";
    }

    public AContClient(String nume, String data) {
        if(nume.length()!=0){
            this.nume = nume;
        }else{
            this.nume="N/A";
        }
        if(data.length()==10){
            this.data = data;
        }else {
            this.data = "Data invalida";
        }
    }

    public abstract AContClient clone();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AContClient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", data='").append(data).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
