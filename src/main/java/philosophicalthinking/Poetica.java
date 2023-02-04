package philosophicalthinking;

import java.util.ArrayList;
import java.util.List;

public class Poetica extends Metaphysics {

    String imagination = "Imagination is the ability to create mental images and imagine new possibilities.";
    String metaphor = "Metaphor is the use of language to describe one thing in terms of another, " +
            "creating connections between seemingly disparate ideas and experiences.";
    String symbolism = "Symbolism is the use of symbols to represent ideas, emotions, and experiences.";
    String empathy = "Empathy is the ability to understand and share the feelings of others.";
    String aesthetics = "Aesthetics is the study of beauty and the arts, " +
            "including the principles of design and the evaluation of works of art.";
    String mystery = "Mystery is a sense of wonder and awe in the face of the unknown.";
    String playfulness = "Playfulness is a lighthearted, open-minded approach to the world.";
    String authenticity = "Authenticity is a commitment to being true to oneself and one's experiences.";
    String emotion = "Emotion is the experience of feelings and their expression in life and art.";
    String unknown = "Mystery is the recognition of the limits of our understanding " +
            "and the recognition that there is much that is beyond our comprehension.";


    public List<String> getPoeticaKeyConcepts() {
        List<String> poeticaKeyConcepts = new ArrayList<>();
        poeticaKeyConcepts.add(imagination);
        poeticaKeyConcepts.add(metaphor);
        poeticaKeyConcepts.add(symbolism);
        poeticaKeyConcepts.add(empathy);
        poeticaKeyConcepts.add(aesthetics);
        poeticaKeyConcepts.add(mystery);
        poeticaKeyConcepts.add(playfulness);
        poeticaKeyConcepts.add(authenticity);
        poeticaKeyConcepts.add(emotion);
        poeticaKeyConcepts.add(unknown);

        return poeticaKeyConcepts;
    }

}
