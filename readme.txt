一个最简单的集成数据库、使用jsp的spingboot web项目。实际自己使用时可以解压打包文件修改jsp和配置数据内容。也可获取源码修改。

端口默认：8080
context-path: helloworld

数据库创建文件在db文件夹中。   （resource/db/db.sql，为了能使db.sql被打包到jar，才放到了resource中)
图片资源在resource/static下。

两个访问路径：
http://localhost:8080/helloworld/index
http://localhost:8080/helloworld/list

日志记录在data/logs下。主要是切面拦截的web访问日志。