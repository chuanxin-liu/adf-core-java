`Collection<EntityID> unexploredBuildings` 为什么用 `Collection` 而不是 `List`？
因为Collection接口更通用，可以接受任何类型的元素，而List接口只能接受引用类型的元素。

EnumSet.of(...)` 是什么作用？对比普通 `Set` 有什么好处？
速度更快，内存更小。
