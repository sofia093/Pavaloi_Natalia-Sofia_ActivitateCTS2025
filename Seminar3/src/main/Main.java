package main;

import clase.AutoritatePescuitEager;
import clase.AutoritatePescuitLazy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AutoritatePescuitEager autoritatePescuitEager = AutoritatePescuitEager.getInstanta();
        autoritatePescuitEager.toString();
        autoritatePescuitEager.concediaza(2);
        System.out.println(autoritatePescuitEager.toString());

        autoritatePescuitEager.setDenumire("PESC");
        System.out.println(autoritatePescuitEager.toString());

        autoritatePescuitEager.setAutorizatie("Ana");
        System.out.println(autoritatePescuitEager.toString());

        AutoritatePescuitEager autoritatePescuitEager1 = AutoritatePescuitEager.getInstanta();
        autoritatePescuitEager1.setAutorizatie("Mara");
        System.out.println(autoritatePescuitEager1.toString());

        AutoritatePescuitLazy autoritatePescuitLazy= AutoritatePescuitLazy.getInstanta("ANPA", "www.anpa.ro", 3, 3);
        autoritatePescuitLazy.setAutorizatie("Lisa");
        System.out.println(autoritatePescuitLazy.toString());






    }


}