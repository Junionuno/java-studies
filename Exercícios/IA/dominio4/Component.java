package Exercícios.IA.dominio4;

public class Component implements Comparable<Component> {
    private String name;
    private int code;

    public Component(String name, int code) {
        this.name = name;
        this.code = code;
    }

    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                ", code=" + code +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public int compareTo(Component o) {
        return this.getName().compareTo(o.getName());
    }
}
