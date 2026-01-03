package com.school.sms.common.util;

import com.school.sms.common.dto.StudentExcelDTO;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.InputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelHelper {

    private ExcelHelper() {}

    public static List<StudentExcelDTO> parseStudentExcel(InputStream inputStream) {
        List<StudentExcelDTO> students = new ArrayList<>();

        try (Workbook workbook = new XSSFWorkbook(inputStream)) {
            Sheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rows = sheet.iterator();

            rows.next(); // skip header

            while (rows.hasNext()) {
                Row row = rows.next();
                StudentExcelDTO dto = new StudentExcelDTO();

                dto.setName(row.getCell(0).getStringCellValue());
                dto.setDateOfBirth(row.getCell(1).getLocalDateTimeCellValue().toLocalDate());
                dto.setGrade(row.getCell(2).getStringCellValue());
                dto.setEmail(row.getCell(3).getStringCellValue());

                students.add(dto);
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to parse Excel file", e);
        }

        return students;
    }
}
