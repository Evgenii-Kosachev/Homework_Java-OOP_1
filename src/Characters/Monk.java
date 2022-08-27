package Characters;

import java.util.Random;

public class Monk {
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
        Monk.number = 0;
        Monk.r = new Random();
    }


    /**
     * Конструктор создания персонажа 1.
     * @param name Имя персонажа заданного пользователем.
     */
    public Monk(String name) {
        this.name = name;

        this.attack = 12;
        this.protection = 7;
        this.shotsFired = 0;
        this.damage = new int[]{-4, -4, 0};
        this.health = 30;
        this.speed = 5;
        this.delivery = false;
        this.magic = true;
    }

    /**
     * Конструктор создания персонажа 2.
     * @param name Имя персонажа заданного пользователем.
     * @param protection Увеличенная защита.
     */
    public Monk(String name, int protection) {
        this(name);
        this.protection = 9;
    }

    public Monk() {
        this(String.format("Hero #%d", ++Monk.number));
        this.damage[2] = Monk.r.nextInt(damage[0],damage[1] + 1);
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
