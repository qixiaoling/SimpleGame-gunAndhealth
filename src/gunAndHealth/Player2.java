package gunAndHealth;

public class Player2 extends Player1{

    private boolean armour;
    private int health;

    public Player2(String name, String weapon, Integer health, boolean armour) {
        super(name, weapon, health);
        this.armour = armour;
        if (this.health <= 0 || this.health > 100){
            this.health = 100;
        }else {
            this.health = health;
        }
    }

    @Override
    void damagedByGun1() {
        if (armour) {
            this.health -=20;
            if(this.getHealth() <= 0 ){
                this.health = 0;
            }
            System.out.println("Armour is on, hit by gun 1, health is reduced by 20. New health is: " + this.health);
            if(this.health == 0) {
                System.out.println(this.getName() + " is dead.");
            }

        }
        if(!armour) {
            this.health -=30;
            if(this.getHealth() <= 0 ){
                this.health = 0;
                            }
            System.out.println("Armour is off, hit by gun 1, health is reduced by 30. New health is: " + this.health);
            if (this.health == 0){
                System.out.println(this.getName() + " is dead.");
            }

        }
    }
    void damagedByGun2() {
        if (armour) {
            this.health -= 40;
            if (this.getHealth() <= 0) {
                this.health = 0;
            }
            System.out.println("Armour is on, hit by gun 2, health is reduced by 40. New health is: " + this.health);
            if (this.health == 0) {
                System.out.println(this.getName() + " is dead.");
            }

        }
        if (!armour) {
            this.health -= 50;
            if (this.getHealth() <= 0) {
                this.health = 0;
            }
            System.out.println("Armour is off, hit by gun 2, health is reduced by 50. New health is: " + this.health);
            if (this.health == 0) {
                System.out.println(this.getName() + " is dead.");
            }

        }
    }
}
