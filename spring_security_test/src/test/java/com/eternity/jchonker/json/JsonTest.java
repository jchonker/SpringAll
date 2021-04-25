package com.eternity.jchonker.json;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonTest {

    @Test
    public void test1(){
        //通过map数据结构生成json对象
        //(还可以通过原生json数据格式生成,通过实体类生成  https://blog.csdn.net/u012448904/article/details/84292821)
        Map<Object,Object> map = new HashMap<>();
        map.put("name","zhangsan");
        map.put("age","12");
        List<Object> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(45);
        map.put("code",list);
        JSONObject json = new JSONObject(map);  //构建json对象
        String jsonStr = json.toString();   //json对象转换成json字符串
        System.out.println("json对象转换成json字符串:"+jsonStr);

        //解析json数据
        System.out.println("解析json数据:");
        try {
            Resource resource = new ClassPathResource("zhangsan.json");
            File file = resource.getFile();
            //读取json对象
            String str = FileUtils.readFileToString(file);
            //转换json对象
            JSONObject jObject = new JSONObject(str);
            String name = jObject.getString("name");
            System.out.println("name:"+name);
            String address = jObject.getString("address");
            System.out.println("address:"+address);
            int age = jObject.getInt("age");
            System.out.println("age:"+age);
            System.out.println("code:");
            JSONArray major = jObject.getJSONArray("code");
            for(int i = 0;i < major.length();i++){
                System.out.println(major.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test2(){
        System.out.println("当前时间戳:"+System.currentTimeMillis());

    }
}
