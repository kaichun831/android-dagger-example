package www.bizpro.com.tw.app.dagger.api;

import io.reactivex.rxjava3.core.Single;
import okhttp3.RequestBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;
import www.bizpro.com.tw.app.dagger.responses.LoginResponse;

public interface RetrofitService {

    @POST("albums/")
    Single<Response<LoginResponse>> LOGIN(@Body RequestBody body);
}
