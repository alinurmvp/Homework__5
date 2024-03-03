public class Main {
    public static void main(String[] args){
Boss boss = new Boss ();
boss.setHealth(800);
boss.setDamage(80);
boss.setTypeOfDefence("CRITICAL DAMAGE");

        System.out.println( "Здоровье босса = " + boss.getHealth() +  "  , Урон босса = " + boss.getDamage()
        + ", Тип защиты босса = " + boss.getTypeOfDefence());
    }
    public static Hero []
    createHeroes() {
        Hero[] heroes = new Hero[3];
        heroes[0] = new Hero(250,20,"Critical Damage");
        heroes[1] = new Hero(220,15,"Magic");
        heroes[2] = new Hero(240,10);

        return heroes;



    }
}