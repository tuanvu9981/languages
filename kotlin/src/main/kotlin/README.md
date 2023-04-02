
## Chú ý về Kotlin 

### 1. Về class enum 
[Main page & các cách khởi tạo Enum](https://kotlinlang.org/docs/enum-classes.html)

### 2. Về constructor 
    - Có 2 loại constructor trong kotlin.
    - Primary constructor (1 class có duy nhất 1), là tiền đề cho constructor trong Flutter Dart 
    - Secondary constructor (1 class có thể có nhiều), là di sản kế thừa từ Java 
[Hướng dẫn tutorial về constructors](https://www.tutorialspoint.com/kotlin/kotlin_constructors.htm)

### 3. Về kế thừa (Inheritance)
    - Kotlin không có từ khóa "extends"
    - Mặc định, class và method của class trong kotlin là final, phải có từ khóa "open" phía trước thì chúng mới có thể cho phép kế thừa được
    - Syntax **ChildClass : ParentsClass**
    - Các kiểu kế thừa phụ thuộc chặt chẽ vào constructors.
    - Note: **Interface's methods are open by default**
[Official Kotlin document](https://kotlinlang.org/docs/inheritance.html#overriding-rules)
[Tutorial Inheritance document](https://www.tutorialspoint.com/kotlin/kotlin_constructors.htm)
[Viblo blog about Kotlin Inheritance and Overriding](https://viblo.asia/p/kotlin-class-and-inheritance-RnB5pXJb5PG)