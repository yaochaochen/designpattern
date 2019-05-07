package jdk11;


/**
 * @ClassName StreamDemo
 * @Author yaochaochen
 * @Date 2019-04-03 13:32
 **/
public class StreamDemo {
    
//    //Java 9 开始对 Stream 增加了以下 4 个新方法。
//    public void  stream() throws IOException {
//        //1) 增加单个参数构造方法，可为null
//        Stream.ofNullable(null).count(); // 0
//
//        //增加 takeWhile 和 dropWhile 方法
//        Stream.of(1,2,3,2,1).dropWhile(n -> n < 3 ).collect(Collectors.toList());
//
//        Stream.of(1, 2, 3, 2, 1)
//                .takeWhile(n -> n < 3)
//                .collect(Collectors.toList()); // [1, 2]
//
//        //Opthonal 也增加了几个非常酷的方法，现在可以很方便的将一个 Optional 转换成一个 Stream,
//        // 或者当一个空 Optional 时给它一个替代的。
//        Optional.of("javastack").orElseThrow();   // javastack
//        Optional.of("javastack").stream().count(); // 1
//        Optional.ofNullable(null)
//                .or(() -> Optional.of("javastack"))
//                .get();  // javastack
//
//
//        //InputStream 终于有了一个非常有用的方法：transferTo，
//        // 可以用来将数据直接传输到 OutputStream，这是在处理原始数据流时非常常见的一种用法，如下示例。
//
//        var classLoader = ClassLoader.getSystemClassLoader();
//        var inputStream = classLoader.getResourceAsStream("javastack.txt");
//        var javastack = File.createTempFile("javastack2", "txt");
//        try (var outputStream = new FileOutputStream(javastack)) {
//            inputStream.transferTo(outputStream);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
   // }
   
}
