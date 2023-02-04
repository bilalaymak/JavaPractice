package philosophicalthinking;

public class Runner {
    //inheritance with constructors
    public static void main(String[] args) {
        Poetica poeticalThinhing = new Poetica();

        for (String w: poeticalThinhing.getPoeticaKeyConcepts()){
            System.out.println(w);
        }

        System.out.println("*************************");


        Metaphysics metaphysicalThinking = new Metaphysics();
        for (String w: metaphysicalThinking.getMetaphysicsKeyConcepts()){
            System.out.println(w);
        }
        System.out.println("*************************************");

        Logic logicalThinking = new Logic();
        for (String w: logicalThinking.getPhilosophyKeyConcepts()){
            System.out.println(w);
        }

        System.out.println("*****************************");

        Philosophy philosophicalThinking = new Philosophy();

        for (String w: philosophicalThinking.getPhilosophyKeyConcepts()){
            System.out.println(w);
        }






    }


}
