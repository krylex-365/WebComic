package com.example.comicspringmvc.util;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Date;

@Component
public class Utils {
    public static boolean createDir (String dir){
        File theDir = new File(dir);
        if (!theDir.exists()){
            theDir.mkdirs();
            return true;
        }
        System.out.println("Tạo đường dẫn thất bại");
        return false;
    }

    public static boolean insertFile(String dir, MultipartFile file,String fileNameWithExtension){
        byte[] bytes = new byte[0];
        try {
            bytes = file.getBytes();
            String insPath = dir + fileNameWithExtension;
            Files.write(Paths.get(insPath),bytes);
            File fileCheck = new File(insPath);
            if(fileCheck.exists()){
                return true;
            }
            else {
                return false;
            }
        } catch (IOException e) {
            return false;
        }
    }

    public static LocalDate getLocalDateNow() {
        return LocalDate.now();
    }

    public static Date getDateNow(){
        return new Date();
    }


}
