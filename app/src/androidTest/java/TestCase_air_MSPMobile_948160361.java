import android.content.Context;
import android.support.v4.content.FileProvider;
import androidx.test.runner.AndroidJUnit4;
import java.io.File;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_MSPMobile_948160361 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      String var1 = "android";
      Object var2 = null;
      FileProvider.getUriForFile((Context)var0, var1, (File)var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
