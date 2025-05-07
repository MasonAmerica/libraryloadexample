package com.hellooworldapp

object DlopenHelper {
    init {
        System.loadLibrary("dlopentest")
    }

    @JvmStatic
    external fun tryLoadLibrary(): Boolean
}
