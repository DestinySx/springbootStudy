package com.gupaoedu.study.first.thirdDemo;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: suxin
 * Date: 2019/7/14   Time: 11:20
 * Description:
 **/
public class ImportDemoSelector implements ImportSelector {

    /*
    * AnnotationMetadata 注解里面的源数据
    * */
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {

        Map<String,Object> attributes = annotationMetadata.getAnnotationAttributes(EnableDefineService.class.getName());

        //动态注入逻辑
        return new String[]{TwoService.class.getName()};
    }
}