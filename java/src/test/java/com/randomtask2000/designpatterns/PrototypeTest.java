package com.randomtask2000.designpatterns;

import com.randomtask2000.designpatterns.Prototype.Sheep;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.equalTo;

public class PrototypeTest {
    /**
     * In java there is a tendency to extend the Clonable interface, but it has caused a lot of trouble over the years regarding deep copying of super(this). Hence, we copy an object through a constructor instead.
     *
     * Read more on `clone` vs Copy here <a href="https://adtmag.com/articles/2000/01/18/effective-javaeffective-cloning.aspx">here</a>
     *
     * See more detail on deep vs shallow copying here <a href="http://javaconceptoftheday.com/difference-between-shallow-copy-vs-deep-copy-in-java/">here</a>
     */
    @Test
    public void cloneDolly_happyPath(){
        Sheep original = new Sheep("Jolly", "Mountain Sheep");
        System.out.println(original.getName()); // Jolly
        System.out.println(original.getCategory()); // Mountain Sheep
        // Clone and modify what is required
        Sheep cloned = new Sheep(original); // we go about it by copying the object through a constructor
        cloned.setName("Dolly");
        assertThat(cloned.getName(), is(not(equalTo(original.getName()))));
        assertThat(cloned.getName(), is(not(equalTo("Jolly")))); // assert that we are comparing the value not the pointer
        assertThat(cloned.getName(), is(equalTo("Dolly"))); // same as above
        System.out.println(cloned.getName()); // Dolly
        System.out.println(cloned.getCategory()); // Mountain sheep
    }
}
