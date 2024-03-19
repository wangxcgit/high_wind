package com.sld.high_wind;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class HighWindApplicationTests {

    @Test
    void contextLoads() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        // 构建请求体数据
        String requestBody = "{\"name\": \"wangxc\"}";

        // 创建HttpEntity对象并将请求头和请求体添加到其中
        HttpEntity<String> entity = new HttpEntity<>(requestBody, headers);

        // 定义目标URL地址
        String url = "http://localhost:91/user/findUser";

        // 发起POST请求
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);

        // 获取返回结果
        String result = response.getBody();

        System.out.println("Result: " + result);

    }

}
