/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */
public class HelloGoodbye {
    public static void main(String[] args) {
        // args[0] = first arg after ClassName
        String user1 = args[0];
        String user2 = args[1];
        // printf + %s (format specifier)
        System.out.printf("Hello %s and %s.\n", user1, user2);
        System.out.printf("Goodbye %s and %s.\n", user2, user1);
    }
}
