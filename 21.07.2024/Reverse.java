public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello, World!";        
        System.out.println("Original string:");
        System.out.println(str);
        String reversedStr = reverseString(str);    
        System.out.println("Reversed string:");
        System.out.println(reversedStr);
    }
    public static String reverseString(String str) {
        char[] charArray = str.toCharArray(); 
        int left = 0;
        int right = charArray.length - 1;      
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;      
            left++;
            right--;
        }           
        return new String(charArray);
    }
}
