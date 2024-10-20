public class Pos {
    public boolean purchage(Object card, String name, int price) {
        boolean result;

        switch (card.toUpperCase()) {
            case "A" -> result = ((CardA) card).send(price);
            case "B" -> result = ((CardB) card).send(name, price);
            case "C" -> result = ((CardC) card).send(name, price);
            // 신생 업체가 추가될때마다 case를 추가해야 한다?
            // 소스코드를 계속 수정해야 하므로 OCP 위반!

            default -> {
                System.out.println("유효하지 않는 카드입니다.");
                result = false;
            }
        }

        return result;
    }
}
