
package viva3;

import java.util.Random;

public class Phantom {
    private double accuracy;
    private double critRate;
    
    public Phantom() {
        this.accuracy = 1.00;
        this.critRate = 1.00;
    }
    
    public Phantom(double accuracy, double critRate) {
        if (accuracy > 0.00 && accuracy < 1.00 && critRate > 0.00 && critRate < 1.00) {
            this.accuracy = accuracy;
            this.critRate = critRate;
        }
    }
    
    public double getAccuracy() {
        return accuracy;
    }
    
    public void setAccuracy(double accuracy) {
        if (accuracy > 0.00 && accuracy < 1.00) {
            this.accuracy = accuracy;
        }
    }
    
    public double getCritRate() {
        return critRate;
    }
    
    public void setCritRate(double critRate) {
        if (critRate > 0.00 && critRate < 1.00) {
            this.critRate = critRate;
        }
    }
    
    public int damage(BlackMage blackmage) {
        int totalHp = blackmage.getHp();
        double totalEffectiveAccuracy = accuracy * (1 - blackmage.getEvasion());
        double totalEffectiveCritRate = critRate - blackmage.getCritResistance();
        int damageValue = 0;
        
        Random r = new Random();
        
        while (totalHp > 0) {
            double rand = r.nextDouble();
            if (rand < totalEffectiveAccuracy) {
                if (rand < totalEffectiveCritRate) {
                    damageValue = 4; // Critical hit
                    totalHp -= 4;
                } else {
                    damageValue = 2; // Normal hit
                    totalHp -= 2;
                }
            } else {
                damageValue = 0; // Missed hit
            }
            break;
        }
        return damageValue;
    }
    
    public String toString(BlackMage blackmage) {
        int remainingHp = blackmage.getHp();

        System.out.println("The epic battle begins!");

        while (remainingHp > 0) {
            int damage = damage(blackmage);
            remainingHp -= damage;
            if (remainingHp < 0) {
                remainingHp = 0;
            }

            if (damage == 4) {
                System.out.println("[CRIT] Phantom has dealt " + damage + " damage to the Black Mage (" + remainingHp + "/100)");
            } else if (damage == 2) {
                System.out.println("[NORM] Phantom has dealt " + damage + " damage to the Black Mage (" + remainingHp + "/100)");
            } else {
                System.out.println(("[MISS] Phantom has dealt " + damage + " damage to the Black Mage (" + remainingHp + "/100)"));
            }
        }
        
        System.out.println("The Black Mage is defeated...");
        return "";
    }
}
