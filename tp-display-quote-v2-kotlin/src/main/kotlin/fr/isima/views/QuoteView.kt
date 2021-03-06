package fr.isima.views

import fr.isima.business.Direction
import fr.isima.business.IndexedQuote
import kotlinx.html.*


fun IndexedQuote.toHtml() = html {
    head {
        script {
            type = "text/javascript"
            src = "/js/jquery-2.2.0.js"
        }
        script {
            type = "text/javascript"
            src = "/js/bootstrap.min.js"
        }
        link {
            rel = "stylesheet"
            type = "text/css"
            href = "/css/bootstrap-theme.min.css"
        }
        link {
            rel = "stylesheet"
            type = "text/css"
            href = "/css/bootstrap.min.css"
        }
    }
    body {
        div {
            classes = setOf("container")
            div {
                classes = setOf("jumbotron")
                h1 {
                    +"Citation "
                    span {
                        id = "number"
                        if (number > 0) {
                            +"$number"
                        }
                    }
                }
                p {
                    classes = setOf("lead")
                    style = "height: 150px"
                    span {
                        id = "content"
                        +"${quote.content} "
                    }
                    span {
                        id = "author"
                        style = "font-style: italic;"
                        +quote.author
                    }
                }
                p {
                    div {
                        classes = setOf("btn-group")
                        role = "group"
                        for (direction in directions) {
                            navigationButton { direction }
                        }
                    }
                }
            }
        }
        script {
            type = "text/javascript"
            src = "/js/quotes.js"
        }
    }
}

/**
 * An exemple of dsl usage to allow really tasty configuration !
 */
private fun DIV.navigationButton(directionFn: () -> Direction) {
    directionFn().apply {
        button {
            id = this@apply.id
            type = ButtonType.button
            classes = setOf("btn", "btn-lg", "btn-success", "direction-button")
            attributes["data-enabled"] = "$enabled"
            attributes["data-target-index"] = "$targetNumber"
            +label
        }
    }
}