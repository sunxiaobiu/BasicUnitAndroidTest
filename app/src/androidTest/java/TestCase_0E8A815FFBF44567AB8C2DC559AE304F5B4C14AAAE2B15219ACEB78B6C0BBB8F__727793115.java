import android.content.Context;
import android.net.ConnectivityManager;
import androidx.core.content.ContextCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0E8A815FFBF44567AB8C2DC559AE304F5B4C14AAAE2B15219ACEB78B6C0BBB8F__727793115 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      var0 = ContextCompat.getSystemService((Context)var0, ConnectivityManager.class);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
