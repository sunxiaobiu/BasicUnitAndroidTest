import androidx.test.runner.AndroidJUnit4;
import com.android.volley.toolbox.RequestFuture;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_android_service_one__2058545041 {
   @Test
   public void testCase() throws Exception {
      RequestFuture var2 = RequestFuture.newFuture();
      Object var1 = null;
      var2.get(61000L, (TimeUnit)var1);
   }
}
