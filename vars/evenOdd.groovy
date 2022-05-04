def call(Map config) {
    println "Even Odd!\n"
    
    if(env.BUILD_NUMBER.toInteger() % 2 == 0) {
        println "Number is Even"
        return true
    }
     println "Number is Odd"
    return false
}
