package DevDojo.javacore.Minterfaces.test;

import DevDojo.javacore.Minterfaces.dominio.DatabaseLoader;
import DevDojo.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        fileLoader.load();
        databaseLoader.load();

        System.out.println("----------------");

        fileLoader.remove();
        databaseLoader.remove();

        System.out.println("----------------");

        fileLoader.checkPermission();
        databaseLoader.checkPermission();
    }
}
