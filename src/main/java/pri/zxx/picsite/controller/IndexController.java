package pri.zxx.picsite.controller;

import pri.zxx.picsite.entity.TheTst;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zxx
 * @desc
 * @createTime 2019-09-25-下午 2:11
 */
public class IndexController {

    public static void main(String[] args) {
        IndexController indexController = new IndexController();
        indexController.sort();
    }

    public void sort() {
        TheTst t1 = new TheTst(1L, 15.1);
        TheTst t2 = new TheTst(2L, 13.1);
        TheTst t3 = new TheTst(2L, 13.1);
        TheTst t4 = new TheTst(3L, 17.1);
        TheTst t5 = new TheTst(1L, 14.1);
        TheTst t6 = new TheTst(3L, 15.1);
        TheTst t7 = new TheTst(1L, 19.1);
        TheTst t8 = new TheTst(2L, 16.1);
        TheTst t9 = new TheTst(3L, 13.1);
        TheTst t10 = new TheTst(3L, 18.1);
        ArrayList<TheTst> lis = new ArrayList<>();
        lis.add(t1);
        lis.add(t2);
        lis.add(t3);
        lis.add(t4);
        lis.add(t5);
        lis.add(t6);
        lis.add(t7);
        lis.add(t8);
        lis.add(t9);
        lis.add(t10);
        List<TheTst> collect = lis.stream()
                .sorted(Comparator.comparingLong(TheTst::getTime).reversed()
                        .thenComparing(Comparator.comparingDouble(TheTst::getScore).reversed()))
                .collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
