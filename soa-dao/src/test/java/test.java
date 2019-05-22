import com.example.entity.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @program: soa-boot
 * @description: ${description}
 * @author: HuangYong
 * @create: 2019-04-27 22:09
 **/
public class test {
    public static void main(String[] args) {
        List<Test> tests1 = new ArrayList<>();
        List<Test> tests05 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Test a = new Test();
            a.setTest(String.valueOf(i));
            tests1.add(a);
        }
        for (int i = 0; i <5 ; i++) {
            tests05.add(tests1.get(i)) ;
        }

        List<Test> tests2 = new ArrayList<>();
        List<Test> tests59 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Test a = new Test();
            a.setTest(String.valueOf(i));
            tests2.add(a);
        }

        for (int i = 5; i <10 ; i++) {
            tests59.add(tests1.get(i)) ;
        }

        List<Test> tests = new CopyOnWriteArrayList<>();
        tests.addAll(tests05);
        tests.addAll(tests59);
        System.out.printf("========");
    }
}
