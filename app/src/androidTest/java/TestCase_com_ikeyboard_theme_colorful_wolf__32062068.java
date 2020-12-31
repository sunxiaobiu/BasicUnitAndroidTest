import android.content.Context;
import android.support.v4.content.ContextCompat;
import androidx.test.runner.AndroidJUnit4;
import java.io.File;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_ikeyboard_theme_colorful_wolf__32062068 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      File[] var1 = ContextCompat.getExternalCacheDirs((Context)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
