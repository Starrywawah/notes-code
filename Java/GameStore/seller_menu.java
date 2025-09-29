public class seller_menu {
    public static void sell()
    {
        macam.clear();
        macam.write("1. Add Game\n2. See Collection\n3. Update Game\n4. Delete Game\n 0. Quit Store");
        macam.writenum(macam.inputInt("Pick a quesiton : "));
    }
}
