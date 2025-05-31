package com.randomix;

import java.util.UUID;

public class GuidUret {

    public static String generate() {
        return UUID.randomUUID().toString();
    }
}
