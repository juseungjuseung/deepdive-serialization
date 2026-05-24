package com.mark.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mark.User;

import java.io.File;

public class Deserialization {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            File file = new File("src/main/java/com/mark/jackson/user.json");

            // 파일 → JSON → 객체 복원
            User user = mapper.readValue(file, User.class);

            System.out.println("=== 역직렬화 결과 (JSON) ===");
            System.out.println(user);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}