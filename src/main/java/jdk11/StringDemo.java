package jdk11;

import java.util.stream.Stream;

/**
 * @ClassName StringDemo
 * @Author yaochaochen
 * jdk 11 新特性 对字符串处理方法增强 添加了一些方法
 * @Date 2019-04-03 10:19
 **/
public class StringDemo {

    public static void main(String[] args) {
        //判断字符串是否为空白 
        " ".isBlank();// true
        //去掉首尾空格
        " Jack Love".strip();
        //去掉尾部空格
        " JackLove".stripTrailing();
        //去掉首部空格
        " JackLOVE ".stripLeading();
        //复制字符串 count 复制次数
        "Jack".repeat(3);
        // 统计行数 lines的方法很多
        ("A\nB\n").lines().count();

        Stream.ofNullable(null).count(); // 0
    }
    
}
