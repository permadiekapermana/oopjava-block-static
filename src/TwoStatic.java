public class TwoStatic {
    static String nama;
    static int umur;
    static {
        System.out.println("Static Block 1");
        nama = "Permadi Eka Permana";
        umur = 24;
    }
    static {
        System.out.println("Static Block 2");
        nama = "Susianti Komaria";
        umur = 24;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Perkenalkan, nama saya : "+nama);
        System.out.println("Saya berumur "+umur+" tahun");
        System.out.println("Static block kedua akan overide static block pertama.");
    }
}
