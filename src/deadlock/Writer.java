/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deadlock;

import java.util.Random;

public class Writer extends Thread {
    
    private Buffer buffer;
    protected int process;
    String o;
    public Writer(Buffer buffer, int process) {
        this.buffer = buffer;
        this.process = process;
    }
    
    @Override
    public void run() {
        o = "";
        o = "\n"+buffer.enterRegion(process);
        o = o+"\n"+buffer.write(new Random().nextInt(5));
        o = o+"\n"+buffer.leaveRegion(process);
        
    }
    public String geto(){
        return o;
    }
}
