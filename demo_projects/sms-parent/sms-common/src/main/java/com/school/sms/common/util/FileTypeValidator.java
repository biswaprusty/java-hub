package com.school.sms.common.util;

public class FileTypeValidator {

    private FileTypeValidator() {}

    public static boolean isExcelFile(String fileName) {
        return fileName != null &&
                (fileName.endsWith(".xls") || fileName.endsWith(".xlsx"));
    }
}
