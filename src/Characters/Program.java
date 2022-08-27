package Characters;

import java.util.LinkedList;

public class Program {
    public static void main(String[] args) {
        LinkedList<Peasant> peasant = new LinkedList<>();
        LinkedList<Robber> robber = new LinkedList<>();
        LinkedList<Sniper> sniper = new LinkedList<>();
        LinkedList<Sorcerer> sorcerer = new LinkedList<>();
        LinkedList<Spearman> spearman = new LinkedList<>();
        LinkedList<Crossbowman> crossbowman = new LinkedList<>();
        LinkedList<Monk> monk = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            peasant.add(new Peasant());
            robber.add(new Robber());
            sniper.add(new Sniper());
            sorcerer.add(new Sorcerer());
            spearman.add(new Spearman());
            crossbowman.add(new Crossbowman());
            monk.add(new Monk());
        }

        peasant.forEach(s -> System.out.println(s.getInfo()));      System.out.println();
        robber.forEach(s -> System.out.println(s.getInfo()));       System.out.println();
        sniper.forEach(s -> System.out.println(s.getInfo()));       System.out.println();
        sorcerer.forEach(s -> System.out.println(s.getInfo()));     System.out.println();
        spearman.forEach(s -> System.out.println(s.getInfo()));     System.out.println();
        crossbowman.forEach(s -> System.out.println(s.getInfo()));  System.out.println();
        monk.forEach(s -> System.out.println(s.getInfo()));         System.out.println();
    }
}
