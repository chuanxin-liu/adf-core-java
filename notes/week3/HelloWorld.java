package week3;

public class HelloWorld {
    public static void main(String[] args) {
        // - `main` 方法
        // - 声明 3 个不同类型的变量
        // - 一个 `if-else` 判断
        // - 一个 `for` 循环
        // - 调用一个自定义方法

        int a = 5;
        double b = 1.0;
        float c = 2.0f;

        // if-else 判断
        if (b < c) {
            System.out.println("b is smaller: " + b);
        } else {
            System.out.println("c is smaller or equal: " + c);
        }


        for (int i = 0; i < a; i++) {
            square(i);
        }
    }


    public static void square(int n) {

        System.out.println(n*n);
    }
}
