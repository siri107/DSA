// String comparision
// lee
public class String_Compression_443 {
    public int compress(char[] chars) {

        StringBuilder sb = new StringBuilder();

        int start = 0;
        int end = 0;

        while (end < chars.length) {

            if (chars[start] != chars[end]) {

                if (end - start == 1) {
                    sb.append(chars[start]);
                } else {
                    sb.append(chars[start]);
                    sb.append(end - start);
                }

                start = end;
            }

            end++;
        }

        // Last group
        if (end - start == 1) {
            sb.append(chars[start]);
        } else {
            sb.append(chars[start]);
            sb.append(end - start);
        }

        // Copy compressed result back into original array
        for (int i = 0; i < sb.length(); i++) {
            chars[i] = sb.charAt(i);
        }

        return sb.length();
    }
    public int compress1(char[] chars) {

        int index = 0;
        int i = 0;

        while (i < chars.length) {

            char ch = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == ch) {
                count++;
                i++;
            }

            chars[index++] = ch;

            if (count > 1) {
                String num = String.valueOf(count);

                for (char c : num.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index;
    }
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        String_Compression_443 compressor = new String_Compression_443();
        System.out.println(compressor.compress(chars));
        System.out.println(compressor.compress1(chars));

    }
}
