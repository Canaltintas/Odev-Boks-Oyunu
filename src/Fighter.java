public class Fighter {
    String name;
    int weight;
    int healt;
    int damage;
    int dodge;

    Fighter(String name,int weight,int healt,int damage,int dodge){
        this.name=name;
        this.healt=healt;
        this.weight=weight;
        this.damage=damage;
        this.dodge=dodge;

    }
    int hit(Fighter foe){
        System.out.println(this.name + " ==>"+foe.name + " " + this.damage + " Hasar vurdu !");
        if (dodgeChange()){
            System.out.println(foe.name + " Gelen Hasarı Blokladı !");
            return foe.healt;
        }
        if (foe.healt - this.damage <= 0){
            return 0;
        }
        return foe.healt-this.damage;
    }

    boolean dodgeChange(){
        double rand = Math.random()*100;
        return rand <= this.dodge;

    }
}
