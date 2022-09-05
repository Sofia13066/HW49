package model;
public class Friend{
    private final String name;
    
    public Friend(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public synchronized void greet(Friend greeter){
        System.out.format("%s: %s" + " greeted me. %n", this.name, greeter.getName());
        greeter.mutualGreet(this);
    }

    public synchronized void mutualGreet(Friend greeter) {
        System.out.format("%s: %s" + "greeted me too. %n", this.name, greeter.getName());
    }
}
