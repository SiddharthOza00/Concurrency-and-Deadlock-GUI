/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deadlock;

public class Reader extends Thread{
    
    private Buffer buffer;
    protected int process;
    String o;
    public Reader(Buffer buffer, int process) {
        this.buffer = buffer;
        this.process = process;
    }
    
    
    @Override
    public void run() {
        o="";
        o = "\n"+buffer.enterRegion(process);
        o = o +"\n"+buffer.read();
        o = o +"\n"+buffer.leaveRegion(process);
        
    }
    public String geto(){
        return o;
    }
}