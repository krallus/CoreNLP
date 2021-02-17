package temp;

import java.util.Properties;

import org.junit.Ignore;
import org.junit.Test;

import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

//@Ignore
public class OutOfBoundsTestCase {

	@Test
	public void test() {
		final String text = "José Voytenco: \"The full weight of the Law must fall on the exploiters and blacksmiths\"";
		final Annotation document = new Annotation(text);
		final Properties properties = new Properties();
		properties.setProperty("annotators", "tokenize,ssplit,pos,lemma,ner,depparse,coref,quote");
		final StanfordCoreNLP coreNlp = new StanfordCoreNLP(properties);
		coreNlp.annotate(document);
	}

}
