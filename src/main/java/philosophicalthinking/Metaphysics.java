package philosophicalthinking;

import java.util.ArrayList;
import java.util.List;

public class Metaphysics extends Philosophy {


    String substance = "substance is  the underlying reality that " +
            "exists independently of its properties or attributes.";
    String attributes = "attribution is the characteristics or properties that define a substance";
    String causality = "Causality refers to the relationship between cause and effect and the laws that govern it.";
    String essence = "Essence is the defining characteristic of a substance that makes it what it is.";
    String reality = "Reality is the nature of existence and the way things actually are.";
    String potentialityActuality = "Potentiality and actuality refer to the idea that " +
            "things have a potential to exist or become real, " +
            "and that they may also have actual existence.";
    String identity = "Identity is the principle that states that " +
            "an object is the same as itself over time.";
    String universals = "Universals are the concept that certain properties or " +
            "characteristics exist independently of individual things " +
            "and can be instantiated in multiple objects.";
    String timeSpace = "Time and space are the nature of time and space, " +
            "and the relationship between them.";
    String monismDualism = "Monism and dualism refer to the debate over " +
            "whether reality is made up of one substance or two distinct substances, " +
            "such as mind and matter.";

    public List<String> getMetaphysicsKeyConcepts() {
        List<String> metaphysicsKeyConcepts = new ArrayList<>();
        metaphysicsKeyConcepts.add(substance);
        metaphysicsKeyConcepts.add(attributes);
        metaphysicsKeyConcepts.add(causality);
        metaphysicsKeyConcepts.add(essence);
        metaphysicsKeyConcepts.add(reality);
        metaphysicsKeyConcepts.add(potentialityActuality);
        metaphysicsKeyConcepts.add(identity);
        metaphysicsKeyConcepts.add(universals);
        metaphysicsKeyConcepts.add(timeSpace);
        metaphysicsKeyConcepts.add(monismDualism);
        return metaphysicsKeyConcepts;
    }
}
