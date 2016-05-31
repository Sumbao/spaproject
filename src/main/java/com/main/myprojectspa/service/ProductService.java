package com.main.myprojectspa.service;

import com.main.myprojectspa.domain.projectspa.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.main.myprojectspa.domain.projectspa.util.ApplicationConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Service
public class ProductService {
    private static Logger LOGGER = LoggerFactory.getLogger(ProductService.class);

    @Transactional
    public void updateproductdata(Product product, MultipartHttpServletRequest multipartdata) throws IOException {
        try{
            Product producttomerge = Product.findProduct(product.getId());
            String filename = producttomerge.getProductPicture();
            MultipartFile file = multipartdata.getFile("fileedit");
            String editFilename = file.getOriginalFilename();
            if(filename.equals(editFilename)){
                producttomerge.setProductId(product.getProductId());
                producttomerge.setProductName(product.getProductName());
                producttomerge.setProductTypes(product.getProductTypes());
                producttomerge.setProductPrice(product.getProductPrice());
                producttomerge.setProductDetails(product.getProductDetails());
                producttomerge.merge();
                LOGGER.error("same file");
            }else{
                File fileproduct = new File(ApplicationConstant.PATH_FILE+filename);
                Boolean filestatus = fileproduct.isFile();
                if (filestatus == true) {
                    fileproduct.delete();
                }
                MultipartFile fileedit = multipartdata.getFile("fileedit");
                byte[] editfilebyte = fileedit.getBytes();
                File newpath = new File(ApplicationConstant.PATH_FILE + fileedit.getOriginalFilename());
                FileCopyUtils.copy(editfilebyte, new FileOutputStream(newpath));
                producttomerge.setProductId(product.getProductId());
                producttomerge.setProductName(product.getProductName());
                producttomerge.setProductTypes(product.getProductTypes());
                producttomerge.setProductPrice(product.getProductPrice());
                producttomerge.setProductDetails(product.getProductDetails());
                producttomerge.setProductPicture(product.getProductPicture());
                producttomerge.merge();
                LOGGER.error("not same file");
            }

        } catch (Exception e) {
        LOGGER.error("serviceproducterror:{}", e);
        throw new RuntimeException(e);
    }
    }
}