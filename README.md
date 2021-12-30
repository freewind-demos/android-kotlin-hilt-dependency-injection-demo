Android Kotlin Hilt Dependency Inject Project
===========================

Hilt在Dagger的基础上提供了与Android相关的一些注解，进一步减少为了依赖注入而必须手动添加的一些模板代码。

注意：
1. 项目根`build.gradle.kts`中添加依赖`classpath("com.google.dagger:hilt-android-gradle-plugin:2.38.1")`
2. app下`build.gradle.kts`中添加相应插件和依赖，且必须使用`kapt(...)`而不是`annotationProcessor(...)`
3. 只需要添加恰当的annotation，就可以直接在`MainActivity`里使用注入的依赖

Run this demo from your IDE.

注：无法通过命令行`./gradlew installDebug`部署
