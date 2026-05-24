package com.mark.objectoutputstream;

import com.mark.User;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {
        // 파일 → 바이트 스트림 → 객체 복원
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(
                        "src/main/java/com/mark/objectoutputstream/user.ser"))) {

            User user = (User) ois.readObject();

            System.out.println(user);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}