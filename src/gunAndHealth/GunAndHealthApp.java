package gunAndHealth;

public class GunAndHealthApp {

    public static void main(String[] args) {

        Player1 player1 = new Player1("Halk", "sword", 100);
//        player1.damagedByGun1();
//        player1.damagedByGun1();
//        player1.damagedByGun2();
        Player2 player2 = new Player2("Duck", "gun", 150, true);
        System.out.println(player2.getHealth());
        player2.damagedByGun1();
        player2.damagedByGun2();
        player2.damagedByGun2();



    }
}
