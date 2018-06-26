package cucumber

this.metaClass.mixin(cucumber.api.groovy.EN)

Given(~/^a first test$/) { ->
    println "This is a first test"
}

When(~/^test is executed$/) { ->
    println "Test is being executed"
}

Then(~/^result is obtained$/) { ->
    println "Result obtained"
}



