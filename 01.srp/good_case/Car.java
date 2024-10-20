/**
 * 자동차 추상 객체
 */
abstract public class Car {
    protected final String WD;

    protected final int[] WHEEL = { 0, 0, 0, 0 };

    public Car(String wd) {
        WD = wd;
    }

    // 추상 메서드로 변경
    abstract public void run(int power);

    protected void printWheelStatus() {
        System.out.println("휠 동력 상태: " + WHEEL[0] + ", " + WHEEL[1] + ", " + WHEEL[2] + ", " + WHEEL[3]);
    }
}
