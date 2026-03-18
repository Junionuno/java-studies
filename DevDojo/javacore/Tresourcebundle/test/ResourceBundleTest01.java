package DevDojo.javacore.Tresourcebundle.test;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("message", new Locale("en", "US"));

        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        ResourceBundle bundleBr = ResourceBundle.getBundle("message", new Locale("pt", "BR"));
        System.out.println(bundleBr.getString("hello"));
        System.out.println(bundleBr.getString("good.morning"));

        System.out.println(bundle.getString("hi"));

        System.out.println(bundle.getString("boas_vindas"));

        String status = bundle.getString("status_veiculo");
        String resultado = MessageFormat.format(status, "Vectra 2.2");
        System.out.println(resultado);
    }
}
