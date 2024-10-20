class CardA implements Purchasable {
    @Override
    public boolean send(int price) {
        System.out.println(getClass().getSimpleName() + " " + price + "원 결제 요청");
        return true;
    }
}

class CardB implements Purchasable {
    @Override
    public boolean send(int price) {
        System.out.println(getClass().getSimpleName() + " " + price + "원 결제 요청");
        return true;
    }
}

class CardC implements Purchasable {
    @Override
    public boolean send(int price) {
        System.out.println(getClass().getSimpleName() + " " + price + "원 결제 요청");
        return true;
    }
}