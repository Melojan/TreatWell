/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testing;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import treatwell.BuildBox;
import treatwell.InvalidSizeException;

/**
 *
 * @author meloj
 */
public class BuildBoxTest {

    private static BuildBox box;

    @BeforeClass
    public static void beforeClass() {
        box = new BuildBox();
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void whenBothSizesAreDifferent() throws InvalidSizeException {
        thrown.expect(InvalidSizeException.class);
        thrown.expectMessage(containsString("different"));
        box.checkSizes(6, 4);
    }

    @Test
    public void whenBothSizesAreNegative() throws InvalidSizeException {
        thrown.expect(InvalidSizeException.class);
        thrown.expectMessage(containsString("negative"));
        box.checkSizes(-6, -8);
    }

    @Test
    public void whenBothSizesAreTheSame() {
        int h = 5;
        int w = 5;

        assertTrue(h == w);
    }
}

