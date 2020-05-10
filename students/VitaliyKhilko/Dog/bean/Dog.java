package bean;


public class Dog {

    private String name;
    private String color;
    private int age;

    public Dog(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setDogColor(String color){
        this.color = color;
    }

    public String getDogColor(){
        return color;
    }

    public  void voice(){
        System.out.println("ГАВ ГАВ ГАВ");
    }

    public void eat(){
        System.out.println("Я голоден, дайте мне кость !!");
    }

    public void sleep(){
        System.out.println("Что то я устал лаять, теперь мне хочется спать.");
    }
}
