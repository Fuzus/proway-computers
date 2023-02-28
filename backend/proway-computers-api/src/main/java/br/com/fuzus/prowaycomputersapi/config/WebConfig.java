package br.com.fuzus.prowaycomputersapi.config;

import br.com.fuzus.prowaycomputersapi.model.Produto;
import br.com.fuzus.prowaycomputersapi.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Configuration
@EnableWebMvc
public class WebConfig implements CommandLineRunner, WebMvcConfigurer {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Produto> list = Arrays.asList(
                new Produto(1, "Mouse gamer", new BigDecimal(439.00), "À vista no PIX", "/assets/mouse-3.jpg", 15),
                new Produto(2, "Monitor muito bom", new BigDecimal(1200.50), "À vista no PIX", "/assets/monitor-1.jpg", 10),
                new Produto(3, "Teclado excelente", new BigDecimal(749.99), "À vista no PIX", "/assets/mouse-3.jpg", 15),
                new Produto(4, "Fone para quem joga FPS", new BigDecimal(599.99), "À vista no PIX", "/assets/teclado-1.jpg", 10),
                new Produto(5, "Fone de ouvido", new BigDecimal(299.99), "À vista no PIX", "/assets/fone-de-ouvido-2.jpg", 10),
                new Produto(6, "Fone de ouvido bom", new BigDecimal(399.99), "À vista no PIX", "/assets/fone-de-ouvido-3.jpg", 15),
                new Produto(7, "HD 1TB", new BigDecimal(499.99), "À vista no PIX", "/assets/hd.jpg", 15),
                new Produto(8, "Combo de placa de vídeos", new BigDecimal(18449.99), "À vista no PIX", "/assets/mouse-3.jpg", 15),
                new Produto(9, "Processador Ryzen", new BigDecimal(1000), "À vista no PIX", "/assets/placa-video.jpg", 15)
        );

        produtoRepository.saveAll(list);
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:4200")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD", "TRACE", "CONNECT");
    }
}

