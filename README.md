This repository demonstrates an inconsistency in the `removeIf` function's behavior when used with `MutableMap` in Kotlin. While it works as expected with `MutableList` and `MutableSet`, its behavior with `MutableMap` is less intuitive. The example code showcases this unexpected behavior and provides a solution using an iterator for consistent removal.