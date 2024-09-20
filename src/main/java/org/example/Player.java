package org.example;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon waepon){
        this.name = name;
        this.healthPercentage = healthPercentage > 100 ? 100 : ( healthPercentage < 0 ? 0 : healthPercentage);
        this.weapon = weapon;
    }
    public int healthRemaining(){
        return healthPercentage;
    }
    public void loseHealth(int damage){
        this.healthPercentage -= damage;
       if (healthPercentage<0){
           healthPercentage = 0;
           System.out.println(this.name + "player has been knccked out of game");
       }
    }
    public void restoreHealth(int healthPotion){
        this.healthPercentage += healthPotion;
        if (healthPercentage>100){
            this.healthPercentage = 100;
        }
    }
}
