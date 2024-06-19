
package Chapter7;

class SyncMethod{
    synchronized public void classRoom(String TeacherName){
    for(int i=1;i<=5;i++){
    System.out.println(i+"\tClass taking by:"+TeacherName);
    try{
    Thread.sleep(1000);
    }catch (InterruptedException e){
    e.printStackTrace();}
    }
    }
}

class MyThread extends Thread{
SyncMethod sym;
String TeacherName;
@Override
public void run(){
sym.classRoom(TeacherName);
}
MyThread(SyncMethod sym, String TeacherName){
this.sym =sym;
this.TeacherName = TeacherName;
} 
}

public class Test extends Thread{
    public static void main(String[]args){
        SyncMethod sym = new SyncMethod();
        MyThread mt1 = new MyThread(sym,"Bibek");
        MyThread mt2 = new MyThread(sym,"Pain");
        mt1.start();
        mt2.start();
    }
}
