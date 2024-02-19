public class Pen {
   String color = "blue";
   String type = "gel";
   int point = 10;

   static boolean clicked = false;

   public static void click() {
   clicked = true;
   }
   public static void unclick() {
    clicked = false;
   }
}