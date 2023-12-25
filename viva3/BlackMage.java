
package viva3;

class BlackMage {
    private int hp;
    private double evasion;
    private double critResistance;
    
    public BlackMage() {
        this.hp = 100;
        this.evasion = 0.05;
        this.critResistance = 0.10;
    }
    
    public int getHp() {
        return hp;
    }
    
    public double getEvasion() {
        return evasion;
    }
    
    public double getCritResistance() {
        return critResistance;
    }
    
}
