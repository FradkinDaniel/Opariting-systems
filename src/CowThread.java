public class CowThread implements Runnable {

    final int id;
    Compound comp;
    SharedResources res;

    public CowThread(int id, SharedResources res, Compound comp){
        this.id = id;
        this.res = res;
        this.comp = comp;
    }

    @Override
    public void run() {

        // EAT
        try {
            res.hay.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        comp.eat(id);
        res.hay.release();
        // DRINK
        try {
            res.drinking.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        comp.drink(id);
        res.drinking.release();


        if (id % 2 == 0 && comp.milked < 5){

            comp.milk(id);

        }



        comp.eat(id);
    }
}
