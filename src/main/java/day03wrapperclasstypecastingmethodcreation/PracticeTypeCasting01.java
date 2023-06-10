package day03wrapperclasstypecastingmethodcreation;

public class PracticeTypeCasting01 {

    public static void main(String[] args) {

        //Auto Widening

        short s = 235;
        long l = s;
        System.out.println(l);

        byte b = 16;
        double d = b;
        System.out.println(d);

        int i = 456;
        float f = i;
        System.out.println(f);

        char c = 'A';
        double g = c;
        System.out.println(g);

        //Explicit Narrowing

        char h = 'B';
        double j = (double)h;
        System.out.println(j);

        byte y = 127;
        short r = (short)y;
        System.out.println(r);

        int a = 3455;
        long w = (int)a;
        System.out.println(w);

        short t = 6579;
        float e = (short)t;
        System.out.println(e);






    }
}
