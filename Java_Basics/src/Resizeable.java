import java.util.*;

interface resizable {
    void resizeWith();
    void resizeheight();
}

class rect implements resizable {
     int h;

    @Override
    public void resizeWith() {
         h=12;
    }

    @Override
    public void resizeheight() {
        // Implement resizeheight method if needed
    }

    public static void main(String args[]) {
       int e=100;
        rect r = new rect();
        // System.out.println(e);
        r.resizeWith();
        r.h=e;
        System.out.println(r.h); // Accessing instance variable h via object r
    }
}
