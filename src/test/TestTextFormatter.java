package test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import parser.TextFormatter;

public class TestTextFormatter {
    /**
     * Test if the text formatter can filter out non-string characters
     */
    @Test

    public void testTF() {
        String testText = "“Now We Are Six” by A. A. M'il&#8217;ne";
        assertEquals("Now We Are Six by A A Milne", TextFormatter.formatText(testText));
    }
}
