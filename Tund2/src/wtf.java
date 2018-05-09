public class wtf {
    public static void main(String[] args){
        System.out.println("Hello world");
        String key = "user.name";
        String name = System.getProperty(key);

        if (args.length == 0) {
            System.out.println("Yo mama is ugly");
        } else if (args[0].equals("os")) {
            System.out.println(name + " wants the D");
        }
    }
}