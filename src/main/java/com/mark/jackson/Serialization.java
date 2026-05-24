package com.mark.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mark.User;

import java.io.File;

public class Serialization {

    public static void main(String[] args) {
        User user = new User("춘식이", 6, "choonsik@KTB4.co.kr", "choonsik!!11");

        ObjectMapper mapper = new ObjectMapper();

        try {
            File file = new File("src/main/java/com/mark/jackson/user.json");

            // 객체 → JSON → 파일 저장
            mapper.writeValue(file, user);

            System.out.println("=== 직렬화 전 객체 ===");
            System.out.println(user);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}