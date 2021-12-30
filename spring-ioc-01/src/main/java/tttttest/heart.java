package tttttest;

public class heart {
    private heart h;

    public void setH(heart h) {
        this.h = h;
    }

    public void run(){
        System.out.println("在跳");
    }
}
class Dog extends heart{
    private heart h;
    public void setH(heart h) {
        this.h = h;
    }
}
class Cat extends heart{
    private heart h;

    public void setH() {
        this.h = h;
    }
}
class MyTest{
    public static void main(String[] args) {
        Cat c=new Cat();
        c.setH();
    }
}
