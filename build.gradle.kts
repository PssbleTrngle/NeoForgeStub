plugins {
    id("com.possible-triangle.common")
}

// TODO move to GradleHelper
val patch = env["PATCH_VERSION"] ?: "999"
mod.version =
    providers
        .gradleProperty("mod_version")
        .map { it.replace("<patch>", patch) }

upload {
    maven.nexus()
}

enableSpotless()
