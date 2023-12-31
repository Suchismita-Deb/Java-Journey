package com.teach.a3_javaLanguage.L11parallelStreams;

import java.util.concurrent.ForkJoinPool;

public class Matrix {
    public static void main(String[] args) {
        System.out.println("Available Processors : " + Runtime.getRuntime().availableProcessors());
        System.out.println("Total Memory : " + Runtime.getRuntime().totalMemory());
        System.out.println("Fork Join Pool : " + ForkJoinPool.commonPool());
    }
}

//windows pc memory specifications: https://www.windowscentral.com/how-get-full-memory-specs-speed-size-type-part-number-form-factor-windows-10