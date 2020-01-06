package com.guming;



import com.sun.xml.internal.ws.util.StringUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author: zhangguojie
 * @Date: 2019/11/8 17:17
 * @Description:
 */
public class Ad {

    public static void main(String[] args) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String format = now.format(fmt);

        System.out.println(format);


   /* }

    public static <T> List<Collection> splitList(Collection<T> collection, int splitSize) {

        if (String.isEmpty(collection)) {
            return Collections.emptyList();
        }
        return Stream.iterate(0, f -> f + 1)
                .limit(collection.size() % splitSize == 0 ? collection.size() / splitSize : collection.size() / splitSize + 1)
                .parallel()
                .map(a -> collection.parallelStream().skip(a * splitSize).limit(splitSize).collect(Collectors.toList()))
                .filter(b -> !b.isEmpty())
                .collect(Collectors.toList());
    }*/
    }
}