注解使用说明：

    SpringBoot常用注解：
        @Configuration：代表该类会引用资源文件的
        @ConfigurationProperties：读取配置文件前缀后面的key，设置com.xianxin.opensource.name
        @PropertySource：资源文件的引用地址，设置value = "classpath:***.properties"，为什么设置value值要加上classpath是因为项目在打包发布后该文件都是存储在classpath下面的
    
    Jackson常用注解：
        @JsonIgnore：用于返回前端页面时，忽略不显示
        @JsonFormat：用于处理字段类型是日期时间类型的，返回显示个性化日期格式
        @JsonInclude：用于处理为空字段，前端页面不显示出来的情况（实体类与json互转的时候 属性值为null的不参与序列化）
        
        
开发环境热部署：
    使用devtools进行热部署：
        pom文件引入代码段：
            <!-- 热部署 -->
    		<!-- devtools可以实现页面热部署（即页面修改后会立即生效，
    			这个可以直接在application.properties文件中配置spring.thymeleaf.cache=false来实现） -->
    		<!-- 实现类文件热部署（类文件修改后不会立即生效），实现对属性文件的热部署。 -->
    		<!-- 即devtools会监听classpath下的文件变动，并且会立即重启应用（发生在保存时机），
    			注意：因为其采用的虚拟机机制，该项重启是很快的 -->
    		<!-- （1）base classloader （Base类加载器）：加载不改变的Class，例如：第三方提供的jar包。 -->
    		<!-- （2）restart classloader（Restart类加载器）：加载正在开发的Class。 -->
    		<!-- 为什么重启很快，因为重启的时候只是加载了在开发的Class，没有重新加载第三方的jar包。 -->
    		<dependency>
    			<groupId>org.springframework.boot</groupId>
    			<artifactId>spring-boot-devtools</artifactId>
    			<!-- optional=true, 依赖不会传递, 该项目依赖devtools; 
    				之后依赖boot项目的项目如果想要使用devtools, 需要重新引入 -->
    			<optional>true</optional>
    		</dependency>
    		
    		
SpringBoot资源文件属性配置：
     资源文件中的属性配置与映射到实体类
           
           pom文件代码段：            
                <dependency>
        			<groupId>org.springframework.boot</groupId>
        			<artifactId>spring-boot-configuration-processor</artifactId>
        			<optional>true</optional>
        		</dependency>
           
           Java代码片段：               
                com.xianxin.controller.DemoControllrt
                        @Autowired
                        private Resource resource;
                        @GetMapping("getResource")
                        public JSONResult getResource()
                        
                src/mian/resources/resource.properties
                
SpringBoot 资源文件配置server以及tomca
    