//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.name = "校長";
        h.hp = 100;

        Matango m1 = new Matango();
        m1.hp = 50;
        m1.suffix = 'A';

        Matango m2 = new Matango();
        m2.hp = 48;
        m2.suffix = 'B';

        Matango m3 = new Matango();
        m3.hp = 48;
        m3.suffix = 'X';

        h.slip();h.slip();
        h.slip();h.slip();
        h.slip();h.slip();
        h.slip();h.slip();
        h.slip();h.slip();
        h.slip();h.slip();
        h.slip();h.slip();
        h.slip();h.slip();
        h.slip();h.slip();
        m1.run();
        m2.run();
        m3.run();
        h.run();
    }
}