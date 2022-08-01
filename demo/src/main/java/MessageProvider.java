public class MessageProvider {
    private final String name;

    public MessageProvider(String name) {
        this.name = name;
    }

    public MessageProvider() {
        this.name = "world";
    }

    public static void main(String[] args) {
        MessageProvider messageProvider = new MessageProvider();

        System.out.println(messageProvider.message());
    }


    public String message() {
        return "Hello, " + name + "!";
    }
}
