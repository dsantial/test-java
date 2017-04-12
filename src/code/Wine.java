package code;

/**
 * Created by 390767 on 17-4-12.
 */
public class Wine {
    public void fun1(){
        System.out.println("Wine 的fun...");
        fun2();
    }
    public void fun2(){
        System.out.println("Wine 的 fun2...");
    }

    public static void main(String[] args) {
        Wine a = new JNC();
        a.fun1();
    }
}
class JNC extends Wine{
    public void fun1(String a){
        System.out.println("JNC 的Fun1...");
        fun2();
    }
    public void fun2(){
        System.out.println("JNC 的Fun2...");
    }
}

