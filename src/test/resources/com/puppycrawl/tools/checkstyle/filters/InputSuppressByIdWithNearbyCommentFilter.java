package com.puppycrawl.tools.checkstyle.filters;

public class InputSuppressByIdWithNearbyCommentFilter {

    private int A1; // @cs-: ignore (reason)

    private static final int abc = 5; // @cs-: violation (No NPE here)

    int line_length = 100; // Suppression @cs-: ignore (reason)

    private long ID = 1; // Suppression @cs-:
}
