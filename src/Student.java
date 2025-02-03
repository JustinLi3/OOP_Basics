public class Student implements Comparable <Student>{
   private final String id; // Unique
   private String name;

   public Student(String id, String name) {
      this.id = id;
      this.name = name;
   }

   // Overloading if there are different parameters
   // Use this tag to identify
   @Override
   public boolean equals(Object obj) {
      if (obj instanceof Student) {
         Student student = (Student)obj; // Type cast into student
         // S2 is student.id
         // S1 is this.id
         return student.id.equals(id);
      }
      return false;
   }

   @Override
   public int compareTo(Student student){
      if (id.compareTo(student.id) > 0){
         return 1;
      } else if (id.compareTo(student.id) < 0) {
         return -1;
      }
      return 0;
   }

   @Override
   public String toString(){
      return id + " " + name;
   }

   // Temporary for testing code independently
   public static void main(String[] args){
      Student s1 = new Student("1", "Justin");
      Student s2 = new Student("1", "Justin");
      System.out.println(s1.equals(s2)); // False, checks whether they exist in the same memory allocated, needs to override
      System.out.println(s1 == s2); // False, also checks whether they exist in the same memory allocated
      System.out.println(s1.toString()); // Need to override since it prints the memory allocation
      // MyClass@The hexadecimal hash code (memory reference representation).


   }
}
