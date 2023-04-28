
public class Dog { 
    public String bark() {
        return "Bark!"; 
    }
    public String bark2() 
    { 
        return "Bark! Bark!";
    }
}
public class Chiwawa extends Dog 
{ 
    public String bark2() 
    {
        return "Yip! Yip!"; 
    }
}

public class myclass{
    public static void main(String[] args) {
        Dog fido = new Dog();
        Chiwawa carlos = new Chiwawa();
        System.out.println(fido.bark()); System.out.println(carlos.bark()); System.out.println(fido.bark2()); System.out.println(carlos.bark2());
    }
}
