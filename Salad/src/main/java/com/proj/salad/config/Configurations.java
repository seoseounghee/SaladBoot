package com.proj.salad.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
public class Configurations implements WebMvcConfigurer {

    //뷰 세팅1
    @Bean
    public TilesConfigurer tilesConfigurer() {
        final TilesConfigurer configurer = new TilesConfigurer();
        
        //타일즈 설정파일이 위치하는 디렉토리+파일명
        configurer.setDefinitions(new String[]{"/WEB-INF/tiles/tiles_user.xml","/WEB-INF/tiles/tiles_salad.xml","/WEB-INF/tiles/tiles_review.xml","/WEB-INF/tiles/tiles_notice.xml","/WEB-INF/tiles/tiles_mypage.xml","/WEB-INF/tiles/tiles_map.xml","/WEB-INF/tiles/tiles_event.xml"});  
        configurer.setCheckRefresh(true);
        return configurer;
    }

    //뷰 세팅2
    @Bean
    public TilesViewResolver tilesViewResolver() {
        final TilesViewResolver tilesViewResolver = new TilesViewResolver();
        tilesViewResolver.setViewClass(TilesView.class);
        tilesViewResolver.setOrder(1);  //뷰 우선순위
        return tilesViewResolver;
    }

}
