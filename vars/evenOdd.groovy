def call(Map config) {
    println('EvenOdd')
    
    if(env.BUILD_NUMBER.toInteger() % 2 == 0) {
        println('Number is Even')
        return true
    }
     println('Number is Odd')
    return false
}
