public class Compound {
    public void eat(int id){
        System.out.println(id+ "done eating");
    }
    public void drink(int id){
        System.out.println(id+"done drinking");
    }
    public synchronized void milk(int id){
        System.out.println(id+"done giving milk");
    }
    public void walk(int id){
        System.out.println(id+"done walking");
    }
}

