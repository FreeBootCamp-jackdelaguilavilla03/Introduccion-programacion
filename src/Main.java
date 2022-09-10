public class Main {
    public static int sumatotal(int a , int b , int c){
        return a+b+c;
    }

    public static class Car {
        public
        int doors;
        public Car() {
            this.doors = 0;
        }

        public void addDoor() {
            this.doors++;
        }
    }
    public static void main(String[] args) {
        int a,b,c, total;
        a = 3; b = 2; c = 1;
        total = sumatotal(a,b,c);
        System.out.println(total);

        Car carrito = new Car();
        carrito.addDoor();
    }

}