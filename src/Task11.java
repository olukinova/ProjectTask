public class Task11 {
    public static void main(String[] args) {
        String [] arr = {"apple", "banana", "orange", "apple", "banana", "mango", "lemon", "lemon"};
        for(int i = 0; i < arr.length; i++) {
            String word = arr[i];
            for (int j = i + 1;  j < arr.length; j++) {
                if(word.equals(arr[j])) {
                    System.out.println(word);
                }
            }
        }
    }
}
