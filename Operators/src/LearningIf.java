public class LearningIf {
    public static void main(String[] args) {
        boolean isMale= false;
        String name = "Bob";
        System.out.println("before if");
        if(isMale){
            System.out.println("Mr. " + name);
        }else{
            System.out.println("Ms. " + name);
        }
        System.out.println("after if");

        boolean isSeniorCitizen = false;
        boolean isAnAdult  = false;

        if (isSeniorCitizen){
            System.out.println("hello senior citizen");
        }else if (isAnAdult){
            System.out.println("hello an adult");
        }else System.out.println("hello child");

    }
}
