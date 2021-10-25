public class Main {
    public static void main(String[] args){


        Car car1 = new Car("Chevrolet", "Camaro", 2021);
        Car car2 = new Car("Ford", "Mustang", 2022);

//        car1 = car2; // 이렇게 할 경우 주소가 복사된 것임으로 값이 아니라 주소가 같은 객체가 된다.(같은 객체)

        car2.copy(car1); // 이렇게 하면 값은 같으면서 서로 다른 객체가 생성된다.

        System.out.println(car1);
        System.out.println(car2);

        System.out.println();

        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());

        System.out.println();

        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
    }
}
