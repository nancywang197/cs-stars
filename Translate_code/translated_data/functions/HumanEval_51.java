String removeVowels(String text) {
    StringBuilder sb = new StringBuilder();
    for (char c : text.toCharArray()) {
        char lowerC = Character.toLowerCase(c);
        if (lowerC != 'a' && lowerC != 'e' && lowerC != 'i' && lowerC != 'o' && lowerC != 'u') {
            sb.append(c);
        }
    }
    return sb.toString();
}
