package javaprogramming;

class Calc {
int a;
int b;
public Calc(){
    a=5;
    b=3;
    System.out.println("hi");
}

}

public class Object_demo {
    public static void main(String[] args) {
        Calc obj = new Calc();
        System.out.println(obj.a);
    }
}

