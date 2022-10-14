package configuration;

public class RestTemplateConfig {
    @Configure
       public class RestTemplateConfig {
        @Bean
        public RestTemplate restTemplate() {
            return new RestTemplate();
        }
    }
}
