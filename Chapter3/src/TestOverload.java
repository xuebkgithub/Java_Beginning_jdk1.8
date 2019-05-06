public class TestOverload {
}

class Overload{
  public int getSum(int i, int j){
    return i + j;
  }
  public int getSum(int i, int j, int k){
    return i + j + k;
  }
  public double getSum(double i, double j ){
    return i + j;
  }
  public double getSum(double i, double j, double k){
    return i + j + k;
  }
  public void getSum(double i, double j, int k){
    System.out.println(i + j + k);
  }
}

/*
前端项目编译、发布及与后端交互
1. vue项目与后端交互通过配置文件config.js中指定的url请求后端（线上/测试环境）服务
2. angular项目不需要配置config.js文件，通过jenkins编译参数BUILD_P（代码根据参数）访问线上/测试环境后端服务
3. 前端项目发布（执行git_pull.sh），传入三个参数：
$ARTIFACTID（对应脚本参数$SERVER_NAME），项目的名称
$DEPLOY_DIR(对应脚本参数DEPLOY_DIR)，前端代码（包含各个$NGINX_NAME）的部署路径
$CODE_DIR(对应脚本参数$CODE_DIR)，git代码的部署名称
# 编译
1. angular 按照编译的参数.来进行相应的打包控制.环境区分.
2. 传统项目(vue) 按照config.js进行环境区分. 打包控制.为单一选项
3. 纯 html+js(非编译) 不需要进行编译, config.js进行环境区分

# 发布

# 后端交互


 */