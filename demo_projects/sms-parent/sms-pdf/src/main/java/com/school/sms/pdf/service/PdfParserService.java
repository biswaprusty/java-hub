package com.school.sms.pdf.service;

import com.school.sms.pdf.util.PdfExtractorUtil;
import org.springframework.stereotype.Service;

import java.io.InputStream;

@Service
public class PdfParserService {

    public String parsePdf(InputStream inputStream) {
        // For now just simulate parsing
        return PdfExtractorUtil.extractText(inputStream);
    }
}