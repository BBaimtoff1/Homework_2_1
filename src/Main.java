public class Main {
    public static void main(String[] args) {
        System.out.println(USA(21, 29));
        System.out.println(USA(19, 27));
        System.out.println(USA(46, -9));
        System.out.println(USA(27, -30));
        System.out.println(USA(8, 35));

        System.out.println(USA(generateRandomAge(), 23));
    }
    public static String USA(int Age, int temperature) {

        if ((Age > 20 && Age < 45) && (temperature > -20 && temperature < 30)) {
            return ("Можна идти гулять");
        } else if (Age > 45 && (temperature > 0 && temperature < 28)) {
            return ("Можна идти гулять");
        } else if (Age > 45 && (temperature > -10 && temperature < 25)) {
            return ("Можна идти гулять");
        } else {
            return ("Оставайтесь дома");
        }
    }

    public static int generateRandomAge(){
        return (int) (Math.random() * 70);
    }
}
