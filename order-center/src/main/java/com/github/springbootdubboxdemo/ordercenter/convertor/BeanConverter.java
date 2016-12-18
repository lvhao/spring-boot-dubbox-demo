package com.github.springbootdubboxdemo.ordercenter.convertor;

import com.google.common.collect.Multimap;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

/**
 * Created by root on 2016/12/18 0018.
 */
@FunctionalInterface
public interface BeanConverter {
    MapperFactory MAPPER_FACTORY = new DefaultMapperFactory.Builder().build();

    default MapperFacade getMapper(){
        return MAPPER_FACTORY.getMapperFacade();
    }

    default MapperFactory getMapperFactory() {
        return MAPPER_FACTORY;
    }

    default <S,T> void registerAllDefault(Multimap<Class<S>,Class<T>> typeMap) {
        typeMap.keySet().stream().forEach(sourceType ->
                typeMap.get(sourceType).stream().forEach(targetType ->
                        registerDefault(sourceType,targetType)
            )
        );
    }
    default <S,T> void registerDefault(Class<S> sourceType, Class<T> targetType) {
        getMapperFactory().classMap(sourceType, targetType)
                .byDefault()
                .register();
    }
    void register();
}

