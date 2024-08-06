## 動かし方

#### ローカル

* `demo`ディレクトリ直下で`gradlew bootRun`

#### Dockerfileからの起動

* `demo`ディレクトリ直下で`gradlew build`
* `cd ..`
* `docker build --build-arg JAR_FILE=demo/build/libs/demo-0.0.1-SNAPSHOT.jar --no-cache -t <任意のタグ名> .`
* `docker run -e APPLICATIONINSIGHTS_CONNECTION_STRING=<ApplicationInsightsへの接続文字列> -p 8080:8080 <上記コマンドで命名した任意のタグ名>`

#### その他

* 環境変数`APPLICATIONINSIGHTS_CONNECTION_STRING`としてApplicationInsightsへの接続文字列が必要。



