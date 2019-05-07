package jdk12;


public class httpClient {


//    HttpClient client = HttpClient.newBuilder().connectTimeout(Duration.ofMillis(500)).authenticator(new Authenticator() {
//        @Override
//        protected PasswordAuthentication getPasswordAuthentication() {
//           // return super.getPasswordAuthentication();
//            return new PasswordAuthentication("admin", "123".toCharArray());
//        }
//
//    }).build();
//    //可设置heard method cookie等信息
//    HttpRequest request = HttpRequest.newBuilder().uri(URI.create("localhost:7200/")).build();
//
//    HttpResponse<String> response;
//
//    {
//        try {
//            response = client.send(request, HttpResponse.BodyHandlers.ofString());
//            response.statusCode();
//            response.body();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    //同步get请求
//    public void syncGet() throws InterruptedException, IOException {
//
//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://www.baidu.com")).build();
//        HttpResponse<String> response =
//                client.send(request, HttpResponse.BodyHandlers.ofString());
//
//        System.out.println(response.body());
//    }
//
//    //异步Get 请求
//
//    public void asyncGet() throws IOException, InterruptedException, ExecutionException {
//
//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://www.baidu.com")).build();
//        CompletableFuture<String> result = client.sendAsync(request, HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::body);
//        System.out.println(result.get());
//
//    }
//
//    //POST请求
//    public void testPostForm() throws IOException, InterruptedException {
//        HttpClient client = HttpClient.newBuilder().build();
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create("http://www.w3school.com.cn/demo/demo_form.asp"))
//                .header("Content-Type","application/x-www-form-urlencoded")
//                .POST(HttpRequest.BodyPublishers.ofString("name1=value1&name2=value2"))
//                .build();
//
//        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//        System.out.println(response.statusCode());
//    }
//
//    //JSON传参 header指定内容是表单类型，然后通过BodyPublishers.ofString传递表单数据，需要自己构建表单参数
//    public void testPostJsonGetJson() throws ExecutionException, InterruptedException {
////         ObjectMapper objectMapper = new ObjectMapper();
////         StockDto dto = new StockDto();
////         dto.setName("hj");
////         dto.setSymbol("hj");
////         dto.setType(StockDto.StockType.SH);
////         String requestBody = objectMapper
////           .writerWithDefaultPrettyPrinter()
////           .writeValueAsString(dto);
////         
////         HttpRequest request = HttpRequest.newBuilder(URI.create("http://localhost:8080/json/demo"))
////           .header("Content-Type", "application/json")
////           .POST(HttpRequest.BodyPublishers.ofString(requestBody))
////           .build();
////         
////         CompletableFuture<StockDto> result = HttpClient.newHttpClient()
////           .sendAsync(request, HttpResponse.BodyHandlers.ofString())
////           .thenApply(HttpResponse::body)
////           .thenApply(body -> {
////            try {
////             return objectMapper.readValue(body,StockDto.class);
////            } catch (IOException e) {
////             return new StockDto();
////            }
////           });StockDto
////   System.out.println(result.get());
//    }
//
//
//    //并发请求
//    //endAsync方法返回的是CompletableFuture，可以方便地进行转换、组合等操作
//    //这里使用CompletableFuture.allOf组合在一起，最后调用join等待所有future完成
//    public void testConcurrentRequests(){
//        HttpClient client = HttpClient.newHttpClient();
//        List<String> urls = List.of("http://www.baidu.com","http://www.alibaba.com/","http://www.tencent.com");
//        List<HttpRequest> requests = urls.stream()
//                .map(url -> HttpRequest.newBuilder(URI.create(url)))
//                .map(reqBuilder -> reqBuilder.build())
//                .collect(Collectors.toList());
//
//        List<CompletableFuture<HttpResponse<String>>> futures = requests.stream()
//                .map(request -> client.sendAsync(request, HttpResponse.BodyHandlers.ofString()))
//                .collect(Collectors.toList());
//        futures.stream()
//                .forEach(e -> e.whenComplete((resp,err) -> {
//                    if(err != null){
//                        err.printStackTrace();
//                    }else{
//                        System.out.println(resp.body());
//                        System.out.println(resp.statusCode());
//                    }
//                }));
//        CompletableFuture.allOf(futures
//                .toArray(CompletableFuture<?>[]::new))
//                .join();
//
//
//    }

}
    

