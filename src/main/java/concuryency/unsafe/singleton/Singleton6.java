package concuryency.unsafe.singleton;


/**
 * 枚举模式
 * 线程绝对安全
 */
public class Singleton6 {

    private  Singleton6() {

    }

    public  Singleton6 singleton () {
        return Singleto.SINGLETO.getsingleton6();

    }

    private enum  Singleto {
        SINGLETO;
        private Singleton6 singleton;

        Singleto() {
            singleton = new Singleton6();

        }
        public Singleton6 getsingleton6 () {
            return singleton;
        }

    }
}
