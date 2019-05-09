package java.com.models;

public class Scene {
    private int position;
    private String name;
    private int data;

    public Scene(){}

    public Scene(int position, String name, int data){
        this.position = position;
        this.name = name;
        this.data = data;

    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
