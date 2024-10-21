public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(10);
        System.out.println(rectangle.getArea());

        // 리스코프 치환 원칙 위반
        // 50으로 출력되어야 하지만 100으로 출력됨
        // 즉, 직사각형과 정사각형은 상속관계가 될 수 없음
        Square square = new Square();
        square.setWidth(5);
        square.setHeight(10);
        System.out.println(square.getArea());
    }
}
