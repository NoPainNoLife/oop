/**
 * 필요한 기능의 인터페이스만 상속받아 구현할 수 있음
 */
public class S20 extends SmartPhone implements WirelessChargable, ARable, Biometricsable {
    @Override
    public void wirelessCharge() {
        System.out.println("무선 충전을 지원합니다.");
    }

    @Override
    public void ar() {
        System.out.println("AR을 지원합니다.");
    }

    @Override
    public void biometrics() {
        System.out.println("생체인증을 지원합니다.");
    }
}
