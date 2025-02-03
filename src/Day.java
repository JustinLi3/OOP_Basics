public enum Day {
   SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
   public void method(Integer a){

   }
   public static void main(String[] args){
      for (Day d: values()){
         System.out.println(d.name());
      }
      Day day = Day.FRIDAY;
      day.method(5);
   }
}
