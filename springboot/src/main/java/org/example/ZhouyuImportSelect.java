package org.example;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.ArrayList;
import java.util.ServiceLoader;

/**
 * @author : ichigo-xin
 * @date 2023/8/16
 */
public class ZhouyuImportSelect implements DeferredImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        ServiceLoader<AutoConfiguration> load = ServiceLoader.load(AutoConfiguration.class);

        ArrayList<String> list = new ArrayList<>();
        for (AutoConfiguration autoConfiguration : load) {
            list.add(autoConfiguration.getClass().getName());
        }
        return list.toArray(new String[0]);
    }
}
