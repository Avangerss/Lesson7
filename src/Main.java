public class Main {
    public static void main(String[] args) {
        Magic magic = new Magic();
        Medic medic = new Medic();
        Warrior warrior= new Warrior();

        Hero [] heroes = { magic, medic, warrior };
        String [] tanos = { " Ураган Конохи ", " Исиления ", " Молния "};

        for (int i = 0; i < heroes.length; i++) {
            System.out.println( heroes[i].applySuperAbility(tanos [i] ));
        }
    }
}