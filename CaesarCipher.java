package check;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        String s = "abc"; // Initial string
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());

     
            for (int i = 0; i < n; i++) {
                String operation = scanner.nextLine().trim();
                String[] parts = operation.split(" ");
                char[] chars = s.toCharArray();
                int start = Integer.parseInt(parts[0]);
                int end = Integer.parseInt(parts[1]);
                String direction = parts[2];

                // Perform operation on the substring
                s = performOperation(s, chars,start, end, direction);
            }
            System.out.println(s);
    }  
            
    private static String performOperation(String s,char[] chars, int start, int end, String direction) {
		// TODO Auto-generated method stub
    	

            if (direction.equals("L")) {
                for (int i = start; i <= end; i++) {
                    chars[i] = (char) (chars[i] - 1);
                    if (chars[i] < 'a') {
                        chars[i] = 'z';
                    }
                }
            } else if (direction.equals("R")) {
                for (int i = start; i <= end; i++) {
                    chars[i] = (char) (chars[i] + 1);
                    if (chars[i] > 'z') {
                        chars[i] = 'a';
                    }
                }
            }

            s = String.valueOf(chars);

		return s;
	}

}
