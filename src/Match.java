import java.util.SortedMap;

public class Match {
    Fighter p1;
    Fighter p2;
    int minWeight;
    int maxWeight;

    Match(Fighter p1,Fighter p2,int minWeight,int maxWeight){
        this.p1=p1;
        this.p2=p2;
        this.maxWeight=maxWeight;
        this.minWeight=minWeight;
    }
    void run(){
       if (isCheck()){
           double rand=Math.random()*100;

           while (true){
               System.out.println("========Yeni Raund=======");
               if (rand < 50){
                this.p2.healt=this.p1.hit(this.p2);
                if (isWin())
                {
                    break;
                }
                   this.p1.healt=this.p2.hit(this.p1);
                   if (isWin())
                   {
                       break;
                   }

               }else {
                   this.p1.healt=this.p2.hit(this.p1);
                   if (isWin())
                   {
                       break;
                   }
                   this.p2.healt=this.p1.hit(this.p2);
                   if (isWin())
                   {
                       break;
                   }
               }

               System.out.println(this.p1.name + " Sağlığı = "+ this.p1.healt);
               System.out.println(this.p2.name + " Sağlığı = "+ this.p2.healt);
           }
       }else {
           System.out.println("Boksörler Aynı Siklette Değil !");
       }

    }
    boolean isCheck(){
        return (this.p1.weight >= this.minWeight && this.p1.weight <=this.maxWeight)&&(this.p2.weight >= this.minWeight && this.p2.weight <=this.maxWeight);
    }
    boolean isWin(){
        if (this.p1.healt == 0){
            System.out.println(this.p2.name + " Kazandı !");
            return true;
        }

        if (this.p2.healt == 0){
            System.out.println(this.p1.name + " Kazandı !");
            return true;
        }
        return false;
    }
}
