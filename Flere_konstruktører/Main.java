package Flere_konstruktører;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Kasper", "Sommer2021");
        User user2 = new User("Jesper", "Foraar2022", "jesper@example.com");
        User user3 = new User("Jonathan", "Vinter2023", "job@example.com", 65743257);

        // Udprint attributterne ved hjælp af toString-metoden
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }
}
