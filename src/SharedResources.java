// Or Bar Califa 318279429
// Daniel Fradkin 316410885

import java.util.concurrent.*;
public class SharedResources {
    Semaphore hay = new Semaphore(6);
    Semaphore drinking = new Semaphore(3);
    Semaphore milking = new Semaphore(1);
    int walking = 0;
    int milked = 0;


}
