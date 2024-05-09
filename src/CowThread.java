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
        res.walking++;
        res.drinking.release();

        // MILK
        if (id % 2 == 0 && res.milked < 5) {
            try {
                res.milking.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            comp.milk(id);
            res.milked++;
            res.milking.release();
        }

        while (res.walking < 4){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        comp.walk(id);

    }
}
