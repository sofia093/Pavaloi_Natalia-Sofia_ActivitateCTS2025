package clase;

public class Facade {
    public void verificaMasa(Masa masa){
        Ospatar ospatar = new Ospatar();
        Waiter waiter = new Waiter();

        if(ospatar.verificaMasaLibera(masa)){
            if(waiter.debaraseaza(masa)){
                System.out.println("Masa "+ masa.getNrMasa()+ " este pregatita");
            }else{
                System.out.println("Masa nu a fost inca debarasata");
            }
        }else{
            System.out.println("Masa este inca ocupata");
        }
    }
}
