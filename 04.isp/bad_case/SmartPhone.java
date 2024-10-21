public abstract class SmartPhone {
    public void call(String number) {
        System.out.println("Calling " + number);
    }

    public void message(String number, String text) {
        System.out.println(number + ": " + text);
    }

    // 무선충전
    public void wirelessCharge() {
        System.out.println("Wireless charging");
    }

    // AR 기능
    public void ar() {
        System.out.println("AR feature");
    }

    // 생체인식 추상 함수
    abstract public void biometrics();
}
