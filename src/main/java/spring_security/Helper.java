package spring_security;

public class Helper {
    private static final String prefix = "___";
    public static String bg = "<script>document.documentElement.style.background = '#ccc'</script>";
    public static void l(Object data) { System.out.println(prefix + data.toString()); }
}