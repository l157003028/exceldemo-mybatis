package com.excel.demo.service;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

/**
 * InterfaceName ExcelService
 * Description TODO
 * Author lyk
 * Date 2018/7/19 14:36
 * Version 1.0
 **/
public interface ExcelService {
    boolean importExcel(String fileName, MultipartFile file) throws Exception;
    void exportExcel(HttpServletResponse response) throws Exception;
}
