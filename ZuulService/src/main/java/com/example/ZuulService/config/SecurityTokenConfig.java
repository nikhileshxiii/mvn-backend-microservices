package com.example.ZuulService.config;

//@EnableWebSecurity
//public class SecurityTokenConfig extends WebSecurityConfiguration {
//
//    @Autowired
//    private JwtConfig jwtConfig;
//
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable()
//                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//                .and().exceptionHandling().authenticationEntryPoint((req, rsp, e)-> rsp.sendError(HttpServletResponse.SC_UNAUTHORIZED))
//                .and().addFilterAfter(new JwtTokenAuthenticationFilter(jwtConfig), UsernamePasswordAuthenticationFilter.class)
//                .authorizeRequests()
//                	.antMatchers(org.springframework.http.HttpMethod.POST, jwtConfig.getUri()).permitAll()
//                	.antMatchers("/gallery"+"/admin/**").hasRole("ADMIN")
//                	.anyRequest().authenticated();
//    }
//
//    @Bean
//    public JwtConfig jwtConfig() {
//    	return new JwtConfig();
//    }
//}