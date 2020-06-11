package com.raywong.organizationfunction;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * @Description: 替换算法
 * @Author Ray.Wong
 * @Date 2020/6/11 16:08
 */
public class SubstituteAlgorithm {

/*    public String foundPerson(String[] people){
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")) {
                return "Don";
            }

            if (people[i].equals("John")) {
                return "John";
            }

            if (people[i].equals("Kent")) {
                return "Kent";
            }
        }
        return "";
    }*/

    /**
     *  这里的替换算法的例子，我感觉都已经重新写了。应该说是用其它方法来更高效的完成
     */

    public String foundPerson(String[] people){
        List candidates = Arrays.asList(new String[]{"Don", "John", "Kent"});
        for (int i = 0; i < people.length; i++) {
            if (candidates.contains(people[i])) {
                return people[i];
            }
        }
        return "";
    }

}