package methods;

public class Methods {
    public static int reverse(int number){
        StringBuffer sb = new StringBuffer(String.valueOf(number));
        return Integer.parseInt(String.valueOf(sb.reverse()));
    }
}

