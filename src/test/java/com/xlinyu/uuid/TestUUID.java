package com.xlinyu.uuid;

import org.junit.Test;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

/**
 * Created by gavin on 24/09/2016.
 */
public class TestUUID {


    @Test
    public void uuid() {
        String uuid = UUID.randomUUID().toString();
        System.out.println(uuid.replace("-", ""));
        //eaefbbd2d05347909a1c144ba1e9cf5a
        //576ab0fb202a8a040df8bef5
        System.out.println("576ab0fb202a8a040df8bef5".length());
    }

    @Test
    public void g() {
        Map<String, String> data = new HashMap<String, String>();
        for(int i=0;i<100000;i++){
            UUID uuid = UUID.randomUUID();
            long l = ByteBuffer.wrap(uuid.toString().getBytes()).getLong();
            String s = Long.toString(l, Character.MAX_RADIX);
            System.out.println(s);
            data.put(s, s);
        }
        System.out.println(data.size());
    }

}
