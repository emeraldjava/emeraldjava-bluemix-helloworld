package emeraldjava.bluemix.classifier.helloworld;

import com.ibm.watson.developer_cloud.natural_language_classifier.v1.NaturalLanguageClassifier;
import com.ibm.watson.developer_cloud.natural_language_classifier.v1.model.Classifier;

import java.io.File;

/**
 * Created by pauloconnell on 08/04/16.
 */
public class MyNaturalLanguageClassifier {

    public String doSometing() {
        return "Hello";
    }

    public void load() {

        NaturalLanguageClassifier service = new NaturalLanguageClassifier();
        service.setUsernameAndPassword("160c427b-9730-41dd-be72-63c55a7f28c7", "iEnzuteoYomR");

        Classifier classifier = service.createClassifier("MyClassifier", "en", new File("./train.csv"));
        System.out.println(classifier);

    }
}
