package app.revanced.shared.annotation

import app.revanced.patcher.annotation.Compatibility
import app.revanced.patcher.annotation.Package

@Compatibility(
    [Package(
        "com.google.android.youtube", arrayOf("17.49.37", ""18.01.36","18.02.33")
    )]
)
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
internal annotation class YouTubeCompatibility

