public class Character {
    private final String NAME;
    private int health;

    // Weapon 인터페이스를 상속하는 모든 클래스를 다룰 수 있음
    // 고수준 모듈을 의존한다.(DIP 원칙)
    // Weapon 구현체가 추가될때마다 코드를 변경할 필요가 없으므로
    // 개방-폐쇄 원칙(OCP) 또한 준수함
    private Weapon weapon;

    public Character(String name, int health, Weapon weapon) {
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

    public void changeWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void getInfo() {
        System.out.println("Name: " + NAME);
        System.out.println("Health: " + health);
        System.out.println("Weapon: " + weapon);
    }
}
