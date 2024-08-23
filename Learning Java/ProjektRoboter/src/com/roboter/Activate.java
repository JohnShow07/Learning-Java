package com.roboter;

import java.util.List;
import java.util.ArrayList;
import com.roboter.Roboter;

public class Activate {
    public static void main (String [] args) {
        List<String> activeWork = new ArrayList<>();
        workList(activeWork,"do homework");
        workList(activeWork,"wash the dishes");
        workList(activeWork,"tidy up the living room");
        workList(activeWork,"fold the clothes");
        workList(activeWork,"get the kids to school");
        workList(activeWork,"bring the trash out");

        Roboter roboter = new Roboter();
        System.out.println(roboter.isItActive(true));
        System.out.println(roboter);
        System.out.println(roboter.getTask(working(activeWork, 3)));
        System.out.println(roboter);
        System.out.println(roboter.getTask(working(activeWork, -1)));  // Invalid index example
        System.out.println(roboter);
        System.out.println(roboter.getTask(working(activeWork, 2)));
        System.out.println(roboter);
        System.out.println(roboter.getTask(working(activeWork, 0)));
        System.out.println(roboter);

        System.out.println(roboter.isItActive(false));
        System.out.println(roboter);

    }

    public static void workList(List<String> list, String adding){
        list.add(adding);
    }

    public static String working(List<String> list, int choose){

        if (choose < 0 || choose >= list.size()) {
            return "Invalid task index";
        } else {
            return list.get(choose);
}}}