package emeraldjava.bluemix.classifier.helloworld;

import com.ibm.watson.developer_cloud.natural_language_classifier.v1.NaturalLanguageClassifier;
import com.ibm.watson.developer_cloud.natural_language_classifier.v1.model.Classification;
import com.ibm.watson.developer_cloud.natural_language_classifier.v1.model.Classifier;
import com.ibm.watson.developer_cloud.natural_language_classifier.v1.model.Classifiers;

import java.io.File;

/**
 * Created by pauloconnell on 08/04/16.
 */
public class MyNaturalLanguageClassifier {

    private NaturalLanguageClassifier service = null;

    public MyNaturalLanguageClassifier() {
        service = new NaturalLanguageClassifier();
        service.setUsernameAndPassword("160c427b-9730-41dd-be72-63c55a7f28c7", "iEnzuteoYomR");
    }

    public void load() {
        Classifier classifier = service.createClassifier("MyClassifier", "en", new File("./src/main/resources/train.csv"));
        System.out.println(classifier);

    }

    public void list() {
        Classifiers classifiers = service.getClassifiers();
        System.out.println(classifiers);
    }

    public void classify() {
        Classification classification = service.classify("MyClassifier", "How hot will it be today?");
        System.out.println(classification);
    }
}
