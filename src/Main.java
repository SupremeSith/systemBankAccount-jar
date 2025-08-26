//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // objetos
        // instancia da classe e infos do cleinte
        Clients c001 = new Clients();
        c001.firstName = "João Pedro";
        c001.age = 18;

        Clients c002 = new Clients();
        c002.firstName = "Gabriel";
        c002.age = 16;

        Clients c003 = new Clients();
        c003.firstName = "Maria";
        c003.age = 18;


        System.out.println(c002.firstName);
    }
}