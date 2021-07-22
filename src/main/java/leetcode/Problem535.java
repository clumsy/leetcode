package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@BeatsPercent(76.18)
@TimeComplexity(average = Complexity.CONSTANT)
@SpaceComplexity(Complexity.LINEAR_N)
public class Problem535 {
    public class Codec {
        private static final String ALPHABET = "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz"; // base58

        private final Random random = new Random();
        private final Map<String, String> long2short = new HashMap<>();
        private final Map<String, String> short2long = new HashMap<>();

        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            String shortUrl = long2short.get(longUrl);
            if (shortUrl != null) {
                return long2short.get(longUrl);
            }
            while (true) {
                shortUrl = generate();
                if (short2long.putIfAbsent(shortUrl, longUrl) == null) {
                    long2short.put(longUrl, shortUrl);
                    return shortUrl;
                }
            }
        }

        private String generate() {
            int length = 7;
            StringBuilder sb = new StringBuilder(length);
            while (length-- > 0) {
                sb.append(ALPHABET.charAt(random.nextInt(ALPHABET.length())));
            }
            return sb.toString();
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            return short2long.get(shortUrl);
        }
    }

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
}
