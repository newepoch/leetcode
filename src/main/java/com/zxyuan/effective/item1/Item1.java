package com.zxyuan.effective.item1;

/**
 * 用静态工厂方法代替构造器
 */
public class Item1 {

    private String a;
    private String b;
    private String c;

    private static final Item1 instance = new Item1();
    private static final Item1 child1 = new Item1Child1();

    public static void main(String[] args) {
        System.out.println(Item1.newchild1());
    }

    /**
     * 类型转换方法
     * @return
     */
    public static Item1 from(Item1DTO dto) {
        Item1 item1 = newInstance();
        item1.a = dto.d;
        item1.b = dto.e;
        item1.c = dto.f;
        return new Item1();
    }

    /**
     * 聚合方法,多个参数聚合成一个实体
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static Item1 of(String a, String b, String c) {
        Item1 item1 = newInstance();
        item1.a = a;
        item1.b = b;
        item1.c = c;
        return item1;
    }

    /**
     * 相对复杂的类型转换
     * @param str
     * @return
     */
    public static Item1 valueOf(String str) {
        Item1 item1 = newInstance();
        item1.a = str;
        item1.b = str.toLowerCase();
        item1.c = str.toUpperCase();
        return item1;
    }

    /**
     * 获取一个实例
     * @return
     */
    public static Item1 getInstance() {
        return instance;
    }
    public static Item1 instance() {
        return instance;
    }

    /**
     * 创建一个新实例
     * @return
     */
    public static Item1 newInstance() {
        return new Item1();
    }
    public static Item1 create() {
        return new Item1();
    }

    /**
     * 获取不同类型的实例
     * @return
     */
    public static Item1 getChild1() {
        return child1;
    }

    /**
     * 创建一个新的不同类型的实例
     * @return
     */
    public static Item1 newchild1() {
        return new Item1Child1();
    }

}
