public class Compound {
    int milked = 0;
    public void eat(int id){
        System.out.println(id+ "done eating");
    }
    public void drink(int id){
        System.out.println(id+"done drinking");
    }
    public synchronized void milk(int id){
        System.out.println(id+"done giving milk");
        milked++;
    }
    public void walk(int id){
        System.out.println(id+"done walking");
    }
}

