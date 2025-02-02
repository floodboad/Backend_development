package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * **********************************************************
 *
 * @Project:
 * @Author : Gavincoder
 * @Mail : xunyegege@gmail.com
 * @Github : https://github.com/xunyegege
 * @ver : version 1.0
 * @Date : 2019-10-08 15:28
 * @description:
 ************************************************************/
public class MapDemo {

    public static void main(String[] args) {

        Student s1 = new Student(1L, "张三", 15, "浙江");
        Student s2 = new Student(2L, "李四", 15, "湖北");
        Student s3 = new Student(3L, "王五", 17, "北京");
        Student s4 = new Student(4L, "田七", 17, "浙江");
        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);



        //在地址前面加上部分信息，只获取地址
        List<String> lists = students.stream().map(s -> "住址:" + s.getAddress()).collect(Collectors.toList());

        //循环输出
        lists.forEach(list ->System.out.println(list));
    }
}
