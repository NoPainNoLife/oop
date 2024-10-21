public class Character {
    private final String NAME;
    private int health;

    // 무기가 추가된다면?
    // 개방-폐쇄 원칙에 위배된다.(OCP 위반)
    // 완전하게 구현된 클래스, 저수준 모듈에 의존하고 있다.(DIP 위반)
    private OneHandSword weapon;

    public Character(String name, int health, OneHandSword weapon) {
        this.NAME = name;
        this.health = health;
        this.weapon = weapon;
    }

    public int attack() {
        return weapon.attack();
    }

    public void damaged(int damage) {
        health -= damage;
    }

    public void changeWeapon(OneHandSword weapon) {
        this.weapon = weapon;
    }

    public void getInfo() {
        System.out.println("Name: " + NAME);
        System.out.println("Health: " + health);
        System.out.println("Weapon: " + weapon);
    }
}
