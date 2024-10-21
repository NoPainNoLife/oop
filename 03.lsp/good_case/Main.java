public class Main {
    public static void main(String[] args) {
        // 리스코프 치환 원칙을 준수
        // 직사각형(Rectangle), 정사각형(Square)은 모두 도형(Shape)에 속한다.
        Rectangle rectangle = new Rectangle(5, 10);
        Square square = new Square(5);

        System.out.println(rectangle.getArea());
        System.out.println(square.getArea());
    }
}
