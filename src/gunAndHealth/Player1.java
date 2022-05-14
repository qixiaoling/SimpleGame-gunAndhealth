package gunAndHealth;

public class Player1 {

    private String name;
    private String weapon;
    private int health;

    public Player1(String name, String weapon, Integer health) {
        this.name = name;
        this.weapon = weapon;
        if(this.health <= 0 || this.health > 100) {
            this.health = 100;
        }else {
            this.health = health;
        }
    }

    void damagedByGun1() {
        this.health -= 30;
        if (this.health <=0){
            this.health = 0;
        }
        System.out.println("Git by gun1, health is reduced by 30. New health is: " + this.health);
        if(this.health == 0) {
            System.out.println(this.name + " is dead.");
        }
    }
    void damagedByGun2() {
        this.health -= 50;
        if (this.health <=0){
            this.health = 0;
        }
        System.out.println("Git by gun1, health is reduced by 50. New health is: " + this.health);
        if (this.health == 0) {
            System.out.println(this.name + " is dead.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }
}
