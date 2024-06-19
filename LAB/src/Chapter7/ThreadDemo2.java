
package Chapter7;

public class ThreadDemo2 extends Thread{
    @Override
    public void run(){
    System.out.println("This is thread extending thread class");
    }
    public static void main(String[]args){
    ThreadDemo2 td2 = new ThreadDemo2();
    td2.start();
    System.out.println(td2.getId());
    System.out.println(td2.getName());
    }
    
}
