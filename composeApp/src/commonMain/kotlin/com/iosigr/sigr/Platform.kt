package com.iosigr.sigr

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform