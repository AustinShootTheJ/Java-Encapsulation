package com.AustinShootTheJ;

public class Main {

    public static void main(String[] args) {

        // bad code example class variables are directly accessible.
    /*
        Player player = new Player();
    player.fullName = "tim";
    player.health = 20;
    player.weapon = "Sword";

    int damage = 10;
    player.loseHealth(damage);
        System.out.println("remaining health is " + player.healthRemaining());

*/

//EnhancedPlayer player = new EnhancedPlayer("Tim", 200, "Sword");
 //
   //System.out.println("Initial health is " + player.getHealth());


Printer duplexPrinter = new Printer(100,true);
Printer printer = new Printer(100,false);

duplexPrinter.fillToner(1);
duplexPrinter.printJob(10);
duplexPrinter.printJob(7);
duplexPrinter.printJob(83);

printer.printJob(23);
printer.fillToner(-1);

    }
}
