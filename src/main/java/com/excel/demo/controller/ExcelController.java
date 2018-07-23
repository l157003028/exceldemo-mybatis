package com.excel.demo.controller;

import com.excel.demo.service.ExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

/**
 * ClassName ExcelController
 * Description TODO
 * Author lyk
 * Date 2018/7/19 14:37
 * Version 1.0
 **/
@Controller
@RequestMapping("/excel")
public class ExcelController {

    @Autowired
    private ExcelService excelService;
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @RequestMapping("/import")
    @ResponseBody
    public String dataImport(@RequestParam("fileName") MultipartFile file) throws Exception {
        String fileName = file.getOriginalFilename();
        try {
            excelService.importExcel(fileName,file);
        } catch (Exception e) {
            if ("".equals(fileName)){
                throw new Exception("请选择文件！");
            }
        }
        return "导入成功！";
    }

    @RequestMapping("/export")
    @ResponseBody
    public void dataExport(HttpServletResponse response){
        try {
            excelService.exportExcel(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
