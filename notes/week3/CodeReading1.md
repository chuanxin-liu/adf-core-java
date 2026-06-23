1.SampleFireBrigade.java` 的 `sense()` 方法做了什么？
  按以下顺序执行
    第一回合：订阅通信频道1
    在避难所且水未满：原地补水(return)
    水为0：寻找最近避难所
    有着火目标：按距离排序，遍历目标：   
        目标无火：移除目标并跳过
        距离近：灭火
        距离远：寻路前往
    没有目标：随机选路走

2.for (Iterator it = targets.iterator(); it.hasNext();)` 这种语法叫什么？为什么这里不用增强 for 循环？
    这种语法是Iterator迭代器写法
    循环体调用了it.remove，如果用增强for循环会抛出异常，反而用迭代器写法删除更安全


        