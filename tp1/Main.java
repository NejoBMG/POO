package POO;
class Main{
    public static void main(String[] args) {
        Uno a, b;
        Dos c,d;
        int n,m;
        
        a = new Uno();
        c = new Dos();
        b = c;
        d = c;
        m = d.g() + c.k() + a.f();
        System.out.println(m);
        // d = (Dos)a;
        // n = m - d.k();
        // System.out.println(n);
    }
}