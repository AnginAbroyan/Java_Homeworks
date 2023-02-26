package homework10.association.ex6;

import homework10.association.ex6.Heart;

//COMPOSITION
public class Human {
   public int age;
   public String name;

   private Heart aHeart;

   public Human(){
       aHeart = new Heart();
       aHeart.setHeartRate(67);
   }
}
