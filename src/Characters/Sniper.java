package Characters;

import java.util.Random;

public class Sniper {
    private static int number;
    private static Random r;

    private String name;
    private int attack;
    private int protection;
    private int shotsFired;
    private int[] damage;
    private int health;
    private int speed;
    private boolean delivery;
    private boolean magic;

    static {
        Sniper.number = 0;
        Sniper.r = new Random();
    }


    /**
     * Конструктор создания персонажа 1.
     * @param name Имя персонажа заданного пользователем.
     */
    public Sniper(String name) {
        this.name = name;

        this.attack = 12;
        this.protection = 10;
        this.shotsFired = 32;
        this.damage = new int[]{8, 10, 0};
        this.health = 15;
        this.speed = 9;
        this.delivery = false;
        this.magic = false;
    }

    /**
     * Конструктор создания персонажа 2.
     * @param name Имя персонажа заданного пользователем.
     * @param shotsFired Увеличенная скорострельность.
     */
    public Sniper(String name, int shotsFired) {
        this(name);
        this.shotsFired = 36;
    }

    public Sniper() {
        this(String.format("Hero #%d", ++Sniper.number));
        this.damage[2] = Sniper.r.nextInt(damage[0],damage[1] + 1);
    }


    /** Геттер приватного поля name */
    public String getName() {return this.name;}

    /** Геттер приватного поля attack */
    public int getAttack() {return this.attack;}

    /** Геттер приватного поля protection */
    public int getProtection() {return this.protection;}

    /** Геттер приватного поля shotsFired */
    public int getShotsFired() {return this.shotsFired;}

    /** Геттер приватного поля damage */
    public int[] getDamage() {return this.damage;}

    /** Геттер приватного поля health */
    public int getHealth() {return this.health;}

    /** Геттер приватного поля speed */
    public int getSpeed() {return this.speed;}

    /** Геттер приватного поля delivery */
    public boolean getDelivery() {return this.delivery;}

    /** Геттер приватного поля magic */
    public boolean getMagic() {return this.magic;}


    /** Краткое описание персонажа */
    public String getInfo() {
        return String.format("Name: %s, health: %d, damage: %d, type: %s.",
                this.name, this.health, this.damage[2], this.getClass().getSimpleName());
    }
}
