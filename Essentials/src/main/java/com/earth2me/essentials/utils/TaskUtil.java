package com.earth2me.essentials.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskUtil {

    public static final ExecutorService EXECUTOR = Executors.newSingleThreadScheduledExecutor(
            r -> new Thread(r, "Essentials Async Processor Thread (x1)")
    );
}
