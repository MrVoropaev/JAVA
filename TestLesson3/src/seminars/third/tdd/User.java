package seminars.third.tdd;

public class User {

    String name;
    String password;

    boolean isAuthenticate = false;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;

    }

    //3.6.
    public boolean authenticate(String name, String password) {
        return false;
    }

}

public class NumberUtilsOne {
    public static boolean isInRange(int n) {
        return n > 25 && n < 100;
    }
}

public class NumberUtils {
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
