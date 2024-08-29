@FunctionalInterface
public interface Write {
    void write();
}
// one way
//class Functional_Interface implements Write{
//    @Override
//    public void write() {
//        System.out.println("welcome to bridgelabz solution");
//    }
//}
class MainClass{
    public static void main(String[] args) {
        // one way
       // Write obj = new Functional_Interface();
        //obj.write();

        // 2 way
        Write write = new Write() {
            @Override
            public void write() {
                System.out.println("welcome to bridgelabz solution");
            }
        };
        write.write();
    }
}
