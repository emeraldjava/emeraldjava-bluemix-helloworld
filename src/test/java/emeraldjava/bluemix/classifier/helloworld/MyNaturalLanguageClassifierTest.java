package emeraldjava.bluemix.classifier.helloworld;


import org.junit.Test;

/**
 * Created by pauloconnell on 08/04/16.
 */
public class MyNaturalLanguageClassifierTest {

    private MyNaturalLanguageClassifier naturalLanguageClassifier = null;

    @Test
    public void testDoSometing() throws Exception {
        naturalLanguageClassifier = new MyNaturalLanguageClassifier();
        naturalLanguageClassifier.doSometing();
    }
}