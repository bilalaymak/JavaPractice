package philosophicalthinking;

import java.util.ArrayList;
import java.util.List;

public class Logic extends Metaphysics{

    String definition = "definition is the essence or nature of a thing," +
            " that is, the essential qualities that make something what it is; or" +
            "organizing and structuring our knowledge and understanding of the world.";
    String deduction = "deduction is a process of reasoning in which " +
            "a conclusion is drawn from premises that are generally accepted " +
            "or proven to be true";
    String correlation = "correlation is a statistical measure of the relationship between two or more variables. " +
            "It describes how two variables change in relation to each other " +
            "and the extent to which they are related.";
    String analogy = "analogy is a comparison between two things, " +
            "typically for the purpose of explanation or clarification.";

    public List<String> getPhilosophyKeyConcepts(){
        List<String> logicKeyConcepts = new ArrayList<>();
        logicKeyConcepts.add(definition);
        logicKeyConcepts.add(deduction);
        logicKeyConcepts.add(correlation);
        logicKeyConcepts.add(analogy);
        return logicKeyConcepts;
    }













}
