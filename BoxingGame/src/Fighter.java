public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    public Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public int hit(Fighter foe) {
        System.out.println("------------");
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu.");

        if (foe.isWhichStart()) {
            System.out.println(this.name + " => " + foe.name + " " + this.damage + " İlk vurdu.");

            if (foe.dodge()) {
                System.out.println(foe.name + " gelen hasarı savurdu.");
                return foe.health;
            }

            int newHealth = (int) (foe.health - (2) * this.damage);

            if (newHealth < 0)
                return 0;

            return newHealth;
        } else {
            // Eğer isWhichStart false ise, sıra diğer dövüşçüdedir.
            return 0;
        }
    }

    public boolean dodge() {
        double randomValue = Math.random() * 100;  // 0.0 to 99.9
        return randomValue <= this.dodge;
    }

    // Hangi dövüşçünün başlayacağını belirleyen metod.
    public boolean isWhichStart() {
        double randomNum = Math.random() * 100;
        return randomNum > 50;
    }
}
