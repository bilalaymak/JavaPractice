package philosophicalthinking;

import java.util.ArrayList;
import java.util.List;

public class Philosophy {

   String reality = "reality is the nature of existence and the way things actually are";
   String knowledge = "knowledge is the nature of knowledge and how it is acquired";
   String mindAndBody = "the dichotomy of mind and body is the relationship between " +
           "the physical and mental aspects of reality";
   String freewillAndDeterminism = "the dichotomy of free will and determinism is" +
           "the debate over whether our actions " +
           "are determined by prior causes or whether we have free will";

   public List<String> getPhilosophyKeyConcepts(){
      List<String> philosophyKeyConcepts = new ArrayList<>();

      philosophyKeyConcepts.add(reality);
      philosophyKeyConcepts.add(knowledge);
      philosophyKeyConcepts.add(mindAndBody);
      philosophyKeyConcepts.add(freewillAndDeterminism);

      return philosophyKeyConcepts;
   }

}
