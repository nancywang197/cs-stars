import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class HumanEval_162 {
    /**
     * Converts a string to its MD5 hash.
     *
     * @param text The input string.
     * @return The MD5 hash of the string as a hexadecimal string, or null if the input is null or empty.
     */
    public String string_to_md5(String text) {
        if (text == null || text.isEmpty()) {
            return null;
        }

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hash = md.digest(text.getBytes("ASCII"));
            StringBuilder sb = new StringBuilder();
            for (byte b : hash) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException | java.io.UnsupportedEncodingException e) {
            return null; // Or throw an exception, depending on error handling strategy.
        }
    }
}
