import java.util.concurrent.*;
public class SharedResources {
    Semaphore hay = new Semaphore(6);
    Semaphore drinking = new Semaphore(3);
    Semaphore milking = new Semaphore(5);
    Semaphore walking = new Semaphore(0);

    synchronized public void  allowWalk(){
        walking.release();
        walking.release();
        walking.release();
        walking.release();
    }
}
