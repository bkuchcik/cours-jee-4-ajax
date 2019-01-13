rootProject.name = "cours-jee-4-ajax"

include("ajax-java", "ajax-kotlin")
includeIfExists(projectName = "tp-display-quote-v2-java")
includeIfExists(projectName = "tp-display-quote-v2-kotlin")

fun includeIfExists(projectName: String) {
    if (file(projectName).exists()) {
        include(projectName)
    }
}
