package homework10.association;
//COMPOSITION
public class Human6 {
   public int age;
   public String name;

   private Heart6 aHeart;

   public Human6(){
       aHeart = new Heart6();
       aHeart.setHeartRate(67);
   }
}
