package com.kotu.test;

import org.apache.commons.lang3.StringEscapeUtils;

/**
 * Created by kotu on 8/18/16.
 */
public class App {
    public static void main(String[] args) {
        String p = "<p>My paragraph.</p>";
        System.out.println(StringEscapeUtils.escapeHtml4(p));
    }
}
