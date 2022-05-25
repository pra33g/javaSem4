//29	WAP that has two threads where one thread prints table of 5 and other thread prints a string 10 times. Set and display the names and priorities of these threads	
class six implements Runnable{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("This is a string!");
            try {
                Thread.sleep(40);
            } catch (Exception e) {
            }
        }
    }
}
class five implements Runnable{
    public void run(){
        for (int i = 1; i < 11; i++) {
            System.out.println(5 + " * " + i + " = " + i * 5);
            try {
                Thread.sleep(40);
            } catch (Exception e) {
            }
        }
    }
}
class P29{
    public static void main(String[] args) {
        five f = new five();
        six s = new six();
        Thread t1 = new Thread(f);
        Thread t2 = new Thread(s);
        t1.start();
        t2.start();
    }
}

