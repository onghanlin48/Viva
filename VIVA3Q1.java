/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package viva3q1;

/**
 *
 * @author Huawei
 */
public class VIVA3Q1 {
 
}
class Phantom {
    private double accuracy;
    private double critRate;

    // Empty constructor initializing accuracy and critRate
    public Phantom() {
        this.accuracy = 1.00;
        this.critRate = 1.00;
    }

    // Constructor requiring two parameters to initialize accuracy and critRate
    public Phantom(double accuracy, double critRate) {
        if (accuracy > 0.00 && accuracy < 1.00 && critRate > 0.00 && critRate < 1.00) {
            this.accuracy = accuracy;
            this.critRate = critRate;
        } else {
            System.out.println("Invalid input values. Setting default values.");
            this.accuracy = 1.00;
            this.critRate = 1.00;
        }
    }

    // Accessor and mutator methods for accuracy
    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        if (accuracy > 0.00 && accuracy < 1.00) {
            this.accuracy = accuracy;
        } else {
            System.out.println("Invalid accuracy value.Previous value are used.");
        }
    }

    // Accessor and mutator methods for critRate
    public double getCritRate() {
        return critRate;
    }

    public void setCritRate(double critRate) {
        if (critRate > 0.00 && critRate < 1.00) {
            this.critRate = critRate;
        } else {
            System.out.println("Invalid critRate value. Previous value are used.");
        }
    }

    // BlackMage class with the default access modifier
    private static class BlackMage {
        private int hp;
        private double evasion;
        private double critResistance;

        // Empty constructor defaulting to certain values
        public BlackMage() {
            this.hp = 100;
            this.evasion = 0.05; // 5% evasion
            this.critResistance = 0.1; // 10% critResistance
        }
    }

    // Method to calculate damage against BlackMage
    public String damage(BlackMage blackMage) {
        StringBuilder result = new StringBuilder();
        int totalHP = blackMage.hp;

        while (totalHP > 0) {
            double totalEffectiveAccuracy = accuracy * (1 - blackMage.evasion);
            double totalEffectiveCritRate = critRate - blackMage.critResistance;

            double randomValue = Math.random(); // Generating a random value between 0 and 1

            if (randomValue < totalEffectiveAccuracy) {
                if (randomValue < totalEffectiveCritRate) {
                    result.append("[CRIT] Phantom has dealt 4 damage to the Black Mage (")
                            .append(totalHP - 4)
                            .append("/100)\n");
                    totalHP -= 4; // Critical hit: 4 points
                } else {
                    result.append("[NORM] Phantom has dealt 2 damage to the Black Mage (")
                            .append(totalHP - 2)
                            .append("/100)\n");
                    totalHP -= 2; // Normal hit: 2 points
                }
            } else {
                result.append("[MISS] Phantom has dealt 0 damage to the Black Mage (")
                        .append(totalHP)
                        .append("/100)\n");
                // Missed hit: 0 point
            }
        }

        return result.toString();
    }

    // toString method to return combat log
    @Override
    public String toString() {
        return "The epic battle begins!\n";
    }

    public static void main(String[] args) {
        // Creating a Phantom instance
        Phantom phantom = new Phantom(0.8, 0.7); // Set accuracy to 0.8 and critRate to 0.7

        // Creating a BlackMage instance
        Phantom.BlackMage blackMage = new Phantom.BlackMage();

        // Initiating battle and displaying combat logs
        System.out.print(phantom.toString());
        System.out.println(phantom.damage(blackMage) + "The Black Mage is defeated.");
    }
}
