import org.example.Cats;

public class Main {
    public static void main(String[] args) {
        Cats cat_1 = new Cats("Slava", 19);
        cat_1.drink();
        cat_1.jump();
        cat_1.meow();
        System.out.println(cat_1.getName());
        System.out.println(cat_1.getAge());
        cat_1.birthDay();
        System.out.println(cat_1.getAge());
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    }
}