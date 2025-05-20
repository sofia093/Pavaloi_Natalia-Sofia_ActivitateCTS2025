package clase;

public class StaticBlock {
    private String nume;

    private StaticBlock(String nume) {
        this.nume = nume;
    }

    private static StaticBlock staticBlock = null;

    static {
        try{
            staticBlock = new StaticBlock("Ana");
        } catch (Exception e) {
            throw new RuntimeException("Error creating static block");
        }
    }

    public static StaticBlock getStaticBlock() {
        return staticBlock;
    }

}
