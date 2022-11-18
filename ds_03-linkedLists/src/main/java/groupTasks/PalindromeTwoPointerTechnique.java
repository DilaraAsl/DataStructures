package groupTasks;

public class PalindromeTwoPointerTechnique {
    public static void main(String[] args) {
        String str = "Do geese see God?";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        // handle blank or null
        str = str.toLowerCase();
        str = str.replaceAll("[^a-z0-9]", "");

        System.out.println(str);
        System.out.println(str.length());
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }


        }
        return true;
    }
}
