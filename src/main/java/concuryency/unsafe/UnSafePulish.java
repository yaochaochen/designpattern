package concuryency.unsafe;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class UnSafePulish {

    private String[] state = {"a","b","c"};

    public String[] getState() {
        return state;
    }

    public static void main(String[] args) {

        UnSafePulish unSafePulish = new UnSafePulish();

        log.info("{}", Arrays.toString(unSafePulish.getState()));
        //线程不安全的
        unSafePulish.getState()[0] = "d";
        log.info("{}", Arrays.toString(unSafePulish.getState()));


    }
}
