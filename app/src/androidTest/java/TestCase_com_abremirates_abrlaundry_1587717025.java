import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_abremirates_abrlaundry_1587717025 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      RequestQueue var3 = Volley.newRequestQueue(var2);
      Object var1 = null;
      var3.cancelAll(var1);
   }
}
