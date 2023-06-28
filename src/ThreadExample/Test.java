package ThreadExample;

class Test1 extends Thread {
    public void run() {
        System.out.println("first thread");
    }
}

class Test2 extends Thread {
    public void run() {
        System.out.println("second thread");
    }
}

class Ab {
    public static void main(String[] args) {
        Test1 obj23 = new Test1();
        obj23.start();
        Test2 obj22 = new Test2();
        obj22.start();
        System.out.println(Thread.currentThread().getName());
        System.out.println("jiajda");
        System.out.println(obj22.getName());
    }
}
