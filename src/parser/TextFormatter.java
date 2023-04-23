package parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFormatter {
    public static String formatText(String text) {
        Pattern excludeHTMLTagPattern = Pattern.compile("<[^>]*>"); // We don't care about anything inside HTML tags.
        Pattern excludeNonTextOrSpacesPattern = Pattern.compile("[^a-zA-Z *]+"); // We only want the words and the spaces between words.
        Pattern normalizeWhiteSpacePattern = Pattern.compile(" {2,}"); // Sometimes there are multiple spaces between words, needs to only be one.
        Matcher matcher;

        matcher = excludeHTMLTagPattern.matcher(text);
        text = matcher.replaceAll(" "); // Replace any HTML tags with empty spaces.

        text = text.replaceAll("’", "").replaceAll("'", "").replaceAll("&#8217;", "").replaceAll("&#x2019;", ""); // Delete any apostrophes.

        matcher = excludeNonTextOrSpacesPattern.matcher(text);
        text = matcher.replaceAll(" "); // Replace any non-text or spaces with more spaces, like emdashes or punctuation.

        text = text.trim(); // Important to trim excess whitespace at beginning or end, else match won't work.
        matcher = normalizeWhiteSpacePattern.matcher(text);

        text = matcher.replaceAll(" "); // Get rid of any extra spaces

        return text;
    }
}
