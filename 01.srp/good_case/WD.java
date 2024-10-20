/**
 * 전륜
 */
class FrontWheelCar extends Car {
    public FrontWheelCar(String wd) {
        super(wd);
    }

    @Override
    public void run(int power) {
        WHEEL[0] = power;
        WHEEL[1] = power;

        printWheelStatus();
    }
}

/**
 * 후륜
 */
class RearWheelCar extends Car {
    public RearWheelCar(String wd) {
        super(wd);
    }

    @Override
    public void run(int power) {
        WHEEL[2] = power;
        WHEEL[3] = power;

        printWheelStatus();
    }
}

/**
 * 사륜
 */
class AllWheelCar extends Car {
    public AllWheelCar(String wd) {
        super(wd);
    }

    @Override
    public void run(int power) {
        WHEEL[0] = power;
        WHEEL[1] = power;
        WHEEL[2] = power;
        WHEEL[3] = power;

        printWheelStatus();
    }
}
