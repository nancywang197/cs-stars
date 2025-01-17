public class Main {

    public static String strongestExtension(String className, String[] extensions) {
        if (extensions.length == 0) {
            throw new IllegalArgumentException("Array of extensions cannot be empty");
        }

        int strongAlphaCount = countAlphaCase(extensions[0]);
        String strong = extensions[0];
        int maxStrongAlphaCount = strongAlphaCount;

        for (String s : extensions) {
            int alphaCount = countAlphaCase(s);
            if (alphaCount > maxStrongAlphaCount) {
                strong = s;
                maxStrongAlphaCount = alphaCount;
            }
        }

        return className + "." + strong;
    }

    private static int countAlphaCase(String str) {
        int alphaCountUpper = 0;
        int alphaCountLower = 0;

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                alphaCountUpper++;
            } else if (Character.isLowerCase(c)) {
                alphaCountLower++;
            }
        }

        return alphaCountUpper - alphaCountLower;
    }

    ;

        System.out.println(strongestExtension(className, extensions));
    }
}