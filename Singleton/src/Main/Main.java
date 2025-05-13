package Main;

import clase.EagerDataBaseConnection;
import clase.StaticBlockConnection;
import registry.Registry;

public class Main {
    public static void main(String[] args) {
        EagerDataBaseConnection eagerDataBaseConnection = EagerDataBaseConnection.getEagerDataBaseConnection();
        System.out.println(eagerDataBaseConnection.toString());

        eagerDataBaseConnection.setNume("Vasile");
        System.out.println(eagerDataBaseConnection.toString());

        StaticBlockConnection staticBlockConnection = StaticBlockConnection.getStaticBlockConnection();
        System.out.println(staticBlockConnection.toString());

        Registry registry = Registry.getInstance("Ana");
        System.out.println(registry.toString());
    }
}