package www.bizpro.com.tw.app.dagger.scope;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

//自訂共用標籤名稱 ActivityScope
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface ActivityScope {
}
