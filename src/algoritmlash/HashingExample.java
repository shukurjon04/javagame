package algoritmlash;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class HashingExample {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        // Heshlash uchun kerakli ma'lumot
        String data = "Hello, world!";
        // Heshlash uchun kerakli algoritm
        String algorithm = "SHA-256";
        // MessageDigest obyektini yaratish
        MessageDigest md = MessageDigest.getInstance(algorithm);
        // Ma'lumotni bayt massiviga aylantirish
        byte[] dataBytes = data.getBytes();
        // Hesh natijasini bayt massiviga olish
        byte[] hashBytes = md.digest(dataBytes);
        // Hesh natijasini heksadesimal formatga o'tkazish
        StringBuilder hexHash = new StringBuilder();
        for (byte b : hashBytes) {
            hexHash.append(String.format("%02x", b));
        }
        // Hesh natijasini base64 formatga o'tkazish
        String base64Hash = Base64.getEncoder().encodeToString(hashBytes);
        // Hesh natijalarini ekranga chiqarish
        System.out.println("Data: " + data);
        System.out.println("Algorithm: " + algorithm);
        System.out.println("Hex hash: " + hexHash);
        System.out.println("Base64 hash: " + base64Hash);
    }
}

