package s1t4n2exercici1;

import static org.junit.Assert.*;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class TestSize {

	public static Matcher<String> length(Matcher<? super Integer> matcher) {

		return new FeatureMatcher<String, Integer>(matcher, "una cadena de longitud que es", "longitud") {
			@Override
			protected Integer featureValueOf(String actual) {
				return actual.length();
			}
		};

	}

	@Test
	public void test() {
		assertThat("Mordor", length(is(8)));
	}

}