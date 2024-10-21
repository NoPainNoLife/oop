public class S2 extends SmartPhone {
    @Override
    public void message(String number, String message) {
        System.out.println("In S2");

        super.message(number, message);
    }
}
