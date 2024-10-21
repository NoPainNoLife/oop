public class Iphone extends SmartPhone {
    // 해당 기능들 모두 지원하지 않는데에도
    // 부모 클래스로 부터 상속받았기에 모두 구현해야 한다.
    // ISP 원칙에 위배된다.
    @Override
    public void wirelessCharge() {
        // 지원하지 않는 기기
        System.out.println("Not supported");
    }

    @Override
    public void ar() {
        // 지원하지 않는 기기
        System.out.println("Not supported");
    }

    @Override
    public void biometrics() {
        // 지원하지 않는 기기
        System.out.println("Not supported");
    }
}
