
class ExplicitStatic14 {
    static String str1 = "First field";
    static String str2;

    static {
        str2 =  new String("Field 2");
        System.out.println("Initial: " + str1 + " and " + str2);
    }

    public static void main(String[] args) {

        System.out.println(str1);
        System.out.println(str2);
    }
}