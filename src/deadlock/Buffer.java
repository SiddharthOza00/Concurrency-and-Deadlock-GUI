/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deadlock;

public class Buffer {
    
    private int x;
    private int wait_turn;
    boolean[] interest = new boolean[2];
    
    public Buffer() {
        x = -1;
    }
    
    public String read() {
        String o = "Read: " + x;
        System.out.println("Read: " + x);
        return o;
    }
    
    public String write(int x) {
        this.x = x;
        String o = "Write: " + x;
        System.out.println("Write: " + x);
        return o;
    }
    
    /*
     * Métodos para o controle de acesso a região crítica
     */
    @SuppressWarnings("empty-statement")
    protected String enterRegion(int process) {
        int other = 1 - process;
        interest[process] = true;
        wait_turn = process;
        while((wait_turn == process) && interest[other]);
        String o = "Process " + process + " enter region";
        System.out.println("Process " + process + " enter region");
        return o;
    }
    
    protected String leaveRegion(int process) {
        interest[process] = false;
        String o = "Process " + process + " leave region";
        System.out.println("Process " + process + " leave region");
        return o;
    }
}