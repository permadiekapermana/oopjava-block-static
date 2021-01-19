public class OneStatic {
    static String nama;
    static int umur;
    static {
        nama = "Permadi Eka Permana";
        umur = 24;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Perkenalkan, nama saya : "+nama);
        System.out.println("Saya berumur "+umur+" tahun");
    }
}
