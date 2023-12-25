package viva3;

public class Phantom {

    public double accuracy;
    public double critRate;

    public Phantom() {
        accuracy = 1.00;
        critRate = 1.00;
    }

    public Phantom(double accuracy, double critRate) {
        if (accuracy >= 0.00 && accuracy <= 1.00 && critRate >= 0.00 && critRate <= 1.00) {
            this.accuracy = accuracy;
            this.critRate = critRate;
        } else {
            System.out.println("Invalid input values. Setting default values.");

            this.accuracy = accuracy;
            this.critRate = critRate;
        }
    }

    public double getAccuracy() {
        return this.accuracy;

    }

    public void setAccuracy(double accuracy) {
        if (accuracy >= 0 && accuracy <= 1) {
            this.accuracy = accuracy;
        } else {
            System.out.println("Invalid accuracy");
        }
    }

    public double getCritRate() {
        return this.critRate;
    }

    public void setCritRate(double critRate) {
        if (critRate >= 0 && critRate <= 1) {
            this.critRate = critRate;
        } else {
            System.out.println("Invalid critRate");
        }
    }

    public int damage(BlackMage blackMage) {
        int totalDamage = 0;
        int totalHP = blackMage.getHP();

        while (totalHP > 0) {

            double totalEffAccuracy = accuracy * (1-blackMage.getEvasion());
            double totalEffCritRate = blackMage.getCritResistance();

            double randomValue = Math.random(); // Random value between 0.0 and 1.0

            if (randomValue < totalEffAccuracy) {
                if (randomValue < totalEffCritRate) {
                    System.out.println("[CRIT] Phantom has dealt 4 damage to the "
                            + "Black Mage (" + (totalHP - 4) + "/100)");
                    totalHP  -= 4;
                } else {
                    System.out.println("[NORM] Phantom has dealt 2 damage to the "
                            + "Black Mage (" + (totalHP - 2) + "/100)");
                    totalHP -= 2;
                }
            } else {
                System.out.println("[MISS] Phantom has dealt 0 damage to the "
                            + "Black Mage (" + totalHP  + "/100)");
            }
        }
        return totalDamage;
    }

    @Override
    public String toString() {
        return "The epic battle begins!\n";
    }

 public static class BlackMage {

        private int hp;
        private double evasion;
        private double critResistance;

        public BlackMage() {
            this.hp = 100;
            this.evasion = 0.05;
            this.critResistance = 0.1;
        }

        public int getHP() {
            return hp;
        }

        public double getEvasion() {
            return evasion;
        }

        public double getCritResistance() {
            return critResistance;
        }

    }

}
