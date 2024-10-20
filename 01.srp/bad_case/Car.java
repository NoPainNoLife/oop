/**
 * 자동차 휠의 구동 특징
 * - 전륜(FWD)
 * - 후륜(RWD)
 * - 사륜(AWD)
 */
public class Car {
    private final String WD;

    private final int[] WHEEL = { 0, 0, 0, 0 };

    public Car(String wd) {
        WD = wd;
    }

    public void run(int power) {
        // run 메서드가 짊어져야하는 책임은 무려 3가지나 된다.
        switch (WD.toUpperCase()) {
            case "FWD": {
                WHEEL[0] = power;
                WHEEL[1] = power;
                break;
            }
            case "RWD": {
                WHEEL[2] = power;
                WHEEL[3] = power;
                break;
            }
            case "AWD": {
                WHEEL[0] = power;
                WHEEL[1] = power;
                WHEEL[2] = power;
                WHEEL[3] = power;
                break;
            }
        }

        System.out.println("휠 동력 상태: " + WHEEL[0] + ", " + WHEEL[1] + ", " + WHEEL[2] + ", " + WHEEL[3]);
    }
}