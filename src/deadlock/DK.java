package deadlock;
import java.util.concurrent.Semaphore;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

class DK extends Thread {
  String o="";
  int[] b=new int[2];
  int k =0;
  private int id;
  static volatile int turn = 0;
  static volatile boolean [] flag = new boolean[2]; 
  
  private Random rand = new Random();
  public DK(){
      
  }
  public DK(int i) {
    id = i;
  }
  
  
  public int switchP(int i) {
    if (i == 1) {
      return 0;
    } else {
      return 1;
    }
  }
  
  public void run() {
    
    int pID = this.id; 
//    Scanner sc = new Scanner(System.in);
    
    int s;
    s =b[k];
    
    for (int i = 0; i <= s; i++) {
      flag[pID] = true;
      while (flag[switchP(pID)]) {
        if (turn == switchP(pID)) {
          flag[pID] = false;
          while (flag[switchP(pID)] == true) {};
          flag[pID] = true;
        }
      }
      
             
    System.out.println("Object Thread " + this.id + " is starting iteration " + i);
    o = o +"Object Thread " + this.id + " is starting iteration " + i+"\n";
    setSleep(10);
    
    System.out.println("Object Thread " + this.id + " is done with iteration " + i); 
        setSleep(10);
    o=o+"Object Thread " + this.id + " is done with iteration " + i+"\n";
//       System.out.println("\n");
    turn = switchP(pID);
    flag[pID] = false;
//        System.out.println(o);
  }
  }
  
  public void setSleep(int time) {
    try {Thread.sleep(rand.nextInt(time));}
    catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
  
  
  void ex(int[] a) {
     b=a;
    final int N = 2;
    DK[] p = new DK[N];
    
    for (int i = 0; i < N; i++) {
      p[i] = new DK(i);
      p[i].start();
      try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(Peterson.class.getName()).log(Level.SEVERE, null, ex);
        }
      o = o + p[i].get();
//        System.out.println(o);
      k++;
    }
  }
  String get(){
//      System.out.println(o);
      return o;
  }
}