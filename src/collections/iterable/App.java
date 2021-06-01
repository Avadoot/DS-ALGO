package collections.iterable;

public class App {

    public static void main(String[] args) {
        UrlLib urlLib = new UrlLib();

        for (String html : urlLib) {
            System.out.println(html.length());
        }
    }
}
