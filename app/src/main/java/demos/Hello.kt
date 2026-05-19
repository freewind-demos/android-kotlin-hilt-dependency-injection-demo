package demos.android.kotlin.hilt.dependency.injection.demo

import javax.inject.Inject

class Hello @Inject constructor() {
    fun hello(name: String): String {
        return "Hello, ${name}!"
    }
}