package cucumber

import static cucumber.api.groovy.Hooks.*

Before() {
    println "Before test"
}

After() {
    println "After test"
}