package Stack;
public class No1 {
    public static void main(String [] args ){
    Tumpukan tumpukan = new Tumpukan(5);
        tumpukan.push(3);
        tumpukan.baca();
        tumpukan.push(2);
        tumpukan.baca();
        tumpukan.push(3);
        tumpukan.baca();
        System.out.println("nilai teratas = "+tumpukan.peek());
        System.out.println("Nama saya adalah Koandres");
        System.out.println("nilai yang dihapus = "+tumpukan.pop());
        tumpukan.baca();
        System.out.println();
        tumpukan.push(4);
        tumpukan.baca();
        }
}
