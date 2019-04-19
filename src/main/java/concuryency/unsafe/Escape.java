package concuryency.unsafe;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Escape {

    private int thisCanBeEscape = 10;

    public Escape() {
       new InnerClass();

    }

    private class InnerClass {
        public InnerClass() {
            log.info("{}", Escape.this.thisCanBeEscape);

        }
    }
    //无论隐式构造 还是显示构造 都有线程不安全 对象未发布前执行是不安全的
    public static void main(String[] args) {
        new Escape();
     //  log.info("{}", );
    }


}

