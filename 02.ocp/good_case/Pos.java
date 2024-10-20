public class Pos {
    // CardA, CardB, CardC는 각각 다른 클래스이지만
    // Purchasable 부모 객체가 있으므로 묶을 수 있다.
    // 인터페이스 객체만 받아 send를 호출하면 된다.
    public boolean purchase(Purchasable purchasable, int price) {
        return purchasable.send(price);
    }
}
