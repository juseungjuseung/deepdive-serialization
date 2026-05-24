package com.mark.objectoutputstream;

import com.mark.User;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) {
        User user = new User("춘식이", 6, "choonsik@KTB4.co.kr", "choonsik!!11");

        // 객체 → 바이트 스트림 → 파일 저장
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(
                        "src/main/java/com/mark/objectoutputstream/user.ser"))) {

            System.out.println("=== 직렬화 전 객체 ===");
            System.out.println(user);

            // 객체 직렬화
            oos.writeObject(user);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}