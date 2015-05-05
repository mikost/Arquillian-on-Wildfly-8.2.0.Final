package pack;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;

public class ClazzTest {

    @Test
    public void should_create_greeting() {
	assertThat(new Clazz().getGreeting(), is("Hello, World!"));
    }    
}
